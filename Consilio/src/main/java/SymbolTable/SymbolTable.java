package SymbolTable;

import visitor.ASTNode;
import java.util.*;

// vi skal lave et openScope() og et closeScope(), enterSymbol(), retrieveSymbol(), (declaredLocally())*

public class SymbolTable {

    // Måske ændrer til ArrayList eller Stack men Deque er mere eller mindre en stack der strictly følger LIFO
    private final Deque<Map<String, Symbol>> scopeStack = new ArrayDeque<>();

    public class ReservedKeywords {
        private static final List<String> reservedKeywords = Arrays.asList(
                "Action", "..."
        );

        public static List<String> getReservedKeywords() {
            return reservedKeywords;
        }
    }

    public void openScope() {
        scopeStack.push(new HashMap<>());
    }

    public void closeScope() {
        scopeStack.pop();
    }

    /**
     * Forsøger at tilføje en variabel til vores scope. Kaldes når vi declare en variabel. If exists gives error.
     * @param name navnet på variablen.
     * @param type typen af variablen
     */
    public void enterSymbol(String name, String type) {
        Map<String, Symbol> current = scopeStack.peek();
        if (current != null && !current.containsKey(name)) {
            current.put(name, new Symbol(name, type));
        } else {
            System.err.println("Invalid redeclaration of symbol: " + name);
        }
    }

    /**
     * Forsøger at læse en variabel i et scope. Skal kaldes når vi læser en variabel.
     * @param name navnet på variablen.
     * @return navnet på variablen eller en error.
     */
    public Symbol retrieveSymbol(String name) {
        for (Map<String, Symbol> scope : scopeStack) {
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        throw new RuntimeException("Symbol not found");
    }

    public void dump() {
        System.out.println("Symbol Table:");
        int level = scopeStack.size();
        for (Map<String, Symbol> scope : scopeStack) {
            System.out.println("  Scope Level " + level--);
            for (Symbol sym : scope.values()) {
                System.out.println("  " + sym);
            }
        }
    }
}
/*
public class SymbolTable {

    private final List<Map<String, Symbol>> scopeStack = new ArrayList<>(); // ArrayList (virker måske)

    public void openScope() {
        scopeStack.add(new HashMap<>());
    }

    public void closeScope() {

        scopeStack.removeLast();
    }

    public Symbol retrieveSymbol(String name) {
        for (Map<String, Symbol> scope : scopeStack) {
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        throw new RuntimeException("Symbol not found");
    }

    public void enterSymbol(String name, String type) {
        Map<String, Symbol> current = scopeStack.getFirst();
        if (!current.containsKey(name)) {
            current.put(name, new Symbol(type, name));
        }
        System.err.println("Invalid redeclaration of symbol: " + name);
    }
}
*/