package visitor;

import SymbolTable.SymbolTable;
import antlr.ConsilioBaseVisitor;
import antlr.ConsilioParser;

public class GenericVisitor extends ConsilioBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(ConsilioParser.ProgramContext ctx) {
        System.out.println("Visiting program...");

        ASTNode root = new ASTNode("Program");

        ASTNode domainNode = new DomainVisitor().visit(ctx.domain());
        ASTNode problemNode = new ProblemVisitor().visit(ctx.problem());

        root.adoptChildren(domainNode, problemNode);

        return root;
    }


    @Override
    public ASTNode visitStatement(antlr.ConsilioParser.StatementContext ctx) {
        if (ctx.ifBlock() != null) {
            return visit(ctx.ifBlock());
        } else if (ctx.assignment() != null) {
            return visit(ctx.assignment());
        } else if (ctx.statement().size() == 2) {
            ASTNode concat = new ASTNode("StatementConcat");

            ASTNode left = visit(ctx.statement(0));
            ASTNode right = visit(ctx.statement(1));

            concat.adoptChildren(left, right);
            return concat;
        }

        return null;
    }

    @Override
    public ASTNode visitAssignment(antlr.ConsilioParser.AssignmentContext ctx) {
        ASTNode assignNode = new ASTNode("Assignment");

        ASTNode target = ctx.IDENTIFIER() != null
                ? new ASTNode("ID: " + ctx.IDENTIFIER().getText())
                : visit(ctx.dotNotation());

        ASTNode expr = visit(ctx.expression());

        assignNode.adoptChildren(target, expr);
        return assignNode;
    }

    @Override
    public ASTNode visitIfBlock(antlr.ConsilioParser.IfBlockContext ctx) {
        ASTNode ifNode = new ASTNode("If");

        ASTNode condition = visit(ctx.expression());
        ASTNode body = visit(ctx.statement());

        ifNode.adoptChildren(condition, body);
        return ifNode;
    }

    @Override
    public ASTNode visitExpression(antlr.ConsilioParser.ExpressionContext ctx) {
        if (ctx.constant() != null) {
            return visit(ctx.constant());
        }

        if (ctx.IDENTIFIER() != null && ctx.LSQUARE() == null) {
            return new ASTNode("Identifier: " + ctx.IDENTIFIER().getText());
        }

        if (ctx.LPAREN() != null && ctx.RPAREN() != null) {
            return visit(ctx.expression(0)); // skip parentheses
        }

        if (ctx.dotNotation() != null) {
            return visit(ctx.dotNotation());
        }

        if (ctx.IDENTIFIER() != null && ctx.LSQUARE() != null) {
            // This is an index access like: IDENTIFIER [ arrayBodyInt ]
            ASTNode indexExpr = new ASTNode("IndexAccess");
            indexExpr.adoptChildren(
                    new ASTNode("Array: " + ctx.IDENTIFIER().getText()),
                    visit(ctx.arrayBodyInt())
            );
            return indexExpr;
        }

        if (ctx.addOp() != null) {
            ASTNode opNode = new ASTNode("AddOp: " + ctx.addOp().getText());
            opNode.adoptChildren(visit(ctx.expression(0)), visit(ctx.expression(1)));
            return opNode;
        }

        if (ctx.compOp() != null) {
            ASTNode opNode = new ASTNode("CompOp: " + ctx.compOp().getText());
            opNode.adoptChildren(visit(ctx.expression(0)), visit(ctx.expression(1)));
            return opNode;
        }

        if (ctx.locOp() != null) {
            ASTNode opNode = new ASTNode("LogicOp: " + ctx.locOp().getText());
            opNode.adoptChildren(visit(ctx.expression(0)), visit(ctx.expression(1)));
            return opNode;
        }

        return new ASTNode("UNKNOWN_EXPRESSION");
    }

    @Override
    public ASTNode visitConstant(antlr.ConsilioParser.ConstantContext ctx) {
        if (ctx.INT_LITERAL() != null) {
            return new ASTNode("Int: " + ctx.INT_LITERAL().getText());
        } else if (ctx.BOOLEAN_LITERAL() != null) {
            return new ASTNode("Bool: " + ctx.BOOLEAN_LITERAL().getText());
        }
        return new ASTNode("UnknownConstant");
    }

    @Override
    public ASTNode visitDotNotation(antlr.ConsilioParser.DotNotationContext ctx) {
        if (ctx.LSQUARE() == null) {
            return new ASTNode("Dot: " + ctx.IDENTIFIER(0).getText() + "." + ctx.IDENTIFIER(1).getText());
        } else {
            // This handles cases like: obj[1,2].field
            return new ASTNode("Dot: " + ctx.IDENTIFIER(0).getText() + "[" + ctx.arrayBodyInt().getText() + "]." + ctx.IDENTIFIER(1).getText());
        }
    }
}
