package visitor;

import SymbolTable.SymbolTable;
import antlr.ConsilioBaseVisitor;
import antlr.ConsilioParser;

public class DomainVisitor extends GenericVisitor {

    @Override
    public ASTNode visitDomain(ConsilioParser.DomainContext ctx) {
        ASTNode root = new ASTNode("Domain");
        ASTNode domainName = new ASTNode("Name: " + ctx.IDENTIFIER().getText());

        root.adoptChildren(domainName);

        for (ConsilioParser.TypeContext typeCtx : ctx.type()) {
            ASTNode typeNode = visit(typeCtx);
            root.adoptChildren(typeNode);
        }

        for (ConsilioParser.ActionContext actionCtx : ctx.action()) {
            ASTNode actionNode = visit(actionCtx);
            root.adoptChildren(actionNode);
        }

        return root;
    }

    @Override
    public ASTNode visitType(ConsilioParser.TypeContext ctx) {
        ASTNode typeNode = new ASTNode("TypeDeclaration");

        String Name = ctx.IDENTIFIER().getText();

        ASTNode typeAttr = new ASTNode("attributes: ");
        ASTNode typeName = new ASTNode("Name: " + Name);

        typeNode.adoptChildren(typeName, typeAttr);

        for (ConsilioParser.AttributeContext attrCtx : ctx.attribute()) {
            ASTNode attrNode = visit(attrCtx);
            typeAttr.adoptChildren(attrNode);
        }
        return typeNode;
    }

    @Override
    public ASTNode visitAttribute(ConsilioParser.AttributeContext ctx) {
        ASTNode attrNode = new ASTNode("Attribute:");
        String attrName = ctx.IDENTIFIER().getText();
        String attrType = ctx.value().getText();

        ASTNode attrNameNode = new ASTNode("Name: " + attrName);
        ASTNode attrTypeNode = new ASTNode("Type: " + attrType);

        attrNode.adoptChildren(attrNameNode, attrTypeNode);

        return attrNode;
    }

    @Override
    public ASTNode visitAction(ConsilioParser.ActionContext ctx) {
        ASTNode actionNode = new ASTNode("Action: " + ctx.IDENTIFIER().getText());

        ASTNode paramList = new ASTNode("Parameters");
        for (ConsilioParser.ParameterContext param : ctx.parameterList().parameter()) {
            paramList.adoptChildren(new ASTNode(param.IDENTIFIER().getFirst() + " " + param.IDENTIFIER().getLast()));
        }
        actionNode.adoptChildren(paramList);

        ASTNode body = visit(ctx.statement());
        actionNode.adoptChildren(body);

        return actionNode;
    }
    // når vi besøger en action skal vores scope stack, pushe alle objects af den tilsvarende parameter
    // til stacken, og så poppe det specifkke object når actionen er blevet kørt med det paramater.
    // Hvis der er 2 eller flere objecter til samme type skal programmet pushe alle mulige kombinationer
    // af objecterne
}
