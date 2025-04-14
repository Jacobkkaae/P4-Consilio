package visitor;

import antlr.ConsilioBaseVisitor;
import antlr.ConsilioParser;

public class ProblemVisitor extends GenericVisitor {

    @Override
    public ASTNode visitProblem(ConsilioParser.ProblemContext ctx) {
        ASTNode root = new ASTNode("Problem");

        ASTNode problemName = new ASTNode("Name: " + ctx.IDENTIFIER().getFirst());
        ASTNode objBlock = visit(ctx.objects());
        ASTNode initBlock = visit(ctx.init());
        ASTNode goalBlock = visit(ctx.goal());

        root.adoptChildren(problemName, objBlock, initBlock, goalBlock);
        return root;
    }

    @Override
    public ASTNode visitObjects(ConsilioParser.ObjectsContext ctx) {
        ASTNode objectsNode = new ASTNode("Objects");

        for (ConsilioParser.ArrayInitializerContext arrayInitCtx : ctx.objectBody().arrayInitializer()) {
            ASTNode arrayInit = new ASTNode("ArrayInit");

            String type = arrayInitCtx.IDENTIFIER(0).getText();
            String name = arrayInitCtx.IDENTIFIER(1).getText();

            ASTNode typeName = new ASTNode("Type: " + type);
            ASTNode arrayName = new ASTNode("Name: " + name);
            ASTNode values = visit(arrayInitCtx.arrayBody());

            arrayInit.adoptChildren(typeName, arrayName, values);
            objectsNode.adoptChildren(arrayInit);
        }

        return objectsNode;
    }

    @Override
    public ASTNode visitArrayBody(ConsilioParser.ArrayBodyContext ctx) {
        ASTNode valuesNode = new ASTNode("Values");

        ConsilioParser.ArrayBodyContext current = ctx;
        while (current != null) {
            valuesNode.adoptChildren(new ASTNode("Object: " + current.IDENTIFIER().getText()));
            current = current.arrayBody();
        }

        return valuesNode;
    }

    @Override
    public ASTNode visitInit(ConsilioParser.InitContext ctx) {
        ASTNode initNode = new ASTNode("InitialState");

        for (ConsilioParser.AssignmentContext assignCtx : ctx.assignment()) {
            ASTNode assign = visit(assignCtx);
            initNode.adoptChildren(assign);
        }

        return initNode;
    }


    @Override
    public ASTNode visitGoal(ConsilioParser.GoalContext ctx) {
        ASTNode goalNode = new ASTNode("GoalState");

        for (ConsilioParser.ExpressionContext exprCtx : ctx.expression()) {
            ASTNode expr = visit(exprCtx);
            goalNode.adoptChildren(expr);
        }

        return goalNode;
    }

}
