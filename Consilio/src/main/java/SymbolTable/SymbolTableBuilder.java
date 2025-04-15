package SymbolTable;

import visitor.ASTNode;
import visitor.GenericVisitor;


public class SymbolTableBuilder {

    private final SymbolTable symTable = new SymbolTable();

    public void buildSymbolTable(ASTNode root) {
        symTable.openScope();
        visit(root);
        //symTable.closeScope();
    }

    private void visit(ASTNode node) {
        switch (node.type.split(":")[0]) {
            case "Program" -> visitProgram(node);
            case "Domain" -> visitDomain(node);
            case "Problem" -> visitProblem(node);
            case "TypeDeclaration" -> visitTypeDeclaration(node);
            case "ArrayInit" -> visitArrayInit(node);
            case "Parameters" -> visitParameters(node);
            case "Assignment" -> visitAssignment(node);
            case "If" -> visitIf(node);
            case "Action" -> visitAction(node);
            default -> visitChildren(node);
        }
/* d
        switch (node.type) {
            case "Domain", "Action" -> symTable.openScope();

            case "TypeDeclaration" -> {
                String name = node.children.getFirst().type.replace("Name: ", "");
                //System.out.println(name);
                symTable.enterSymbol(name, "Type");
            }

            case "ArrayInit" -> {
                String type = node.children.get(0).type.replace("Type: ", "");
                //System.out.println(type);
                ASTNode values = node.children.get(2);
                //System.out.println(values.toString());
                for (ASTNode value : values.children) {
                    String name = value.type.replace("Object: ", "");
                    symTable.enterSymbol(name, type);
                    //System.out.println("Inserted: " + name + " of type " + type);
                }
            }
        }

        for (ASTNode child : node.children) {
            processNode(child);
        }

        if (node.type.equals("Problem") || node.type.equals("Domain") ||
                 node.type.equals("Action")) {
            symTable.closeScope();
        }
 */
    }

    private void visitChildren(ASTNode node) {
        for (ASTNode child : node.children) {
            visit(child);
        }
    }

    private void visitProgram(ASTNode node) {
        visitChildren(node);
    }

    private void visitDomain(ASTNode node) {
        symTable.openScope();
        visitChildren(node);
    }

    private void visitProblem(ASTNode node) {
        symTable.openScope();
        visitChildren(node);
    }

    private void visitTypeDeclaration(ASTNode node) {
        String typeName = node.children.getFirst().type.replace("Name: ", "");
        symTable.enterSymbol(typeName, "TYPE");
        visitChildren(node);
    }

    private void visitArrayInit(ASTNode node) {
        String type = node.children.get(1).type.replace("Type: ", "");
        ASTNode values = node.children.get(2);
        for (ASTNode value : values.children) {
            String name = value.type.replace("Object: ", "");
            symTable.enterSymbol(name, type);
        }
    }

    private void visitParameters(ASTNode node) {
        for (ASTNode param : node.children) {
            String[] parts = param.type.split(" ");
            if (parts.length == 2) {
                symTable.enterSymbol(parts[1], parts[0]);
            }
        }
    }

    private void visitAssignment(ASTNode node) {
        ASTNode left = node.children.get(0);
        if (left.type.startsWith("Identifier: ")) {
            String name = left.type.split(": ")[1];
            try {
                symTable.retrieveSymbol(name);
            } catch (RuntimeException e) {
                System.err.println("ERROR: Undeclared variable used in assignment: " + name);
            }
        }
        visitChildren(node);
    }

    private void visitIf(ASTNode node) {

    }

    private void visitAction(ASTNode node) {
        symTable.openScope();
        visitChildren(node);
        symTable.closeScope();
    }

    public SymbolTable getSymbolTable() {
        return symTable;
    }
}