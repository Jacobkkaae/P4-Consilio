package SymbolTable;

import visitor.ASTNode;

public class SymbolTableBuilder {

    private final SymbolTable symTable = new SymbolTable();

    public void buildSymbolTable(ASTNode root) {
        symTable.openScope();
        processNode(root);
        //symTable.closeScope();
    }

    private void processNode(ASTNode node) {
        switch (node.type) {
            case "Program", "Action" -> symTable.openScope();

            case "type" -> {

            }

            case "ArrayInit" -> {
                String type = node.children.get(0).type.replace("Type: ", "");
                System.out.println(type);
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

/* idk
        if (node.type.equals("Problem") || node.type.equals("Domain") ||
                 node.type.equals("Action")) {
            symTable.closeScope();
        }
 */
    }

    public SymbolTable getSymbolTable() {
        return symTable;
    }
}