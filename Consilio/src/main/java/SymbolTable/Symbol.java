package SymbolTable;

public class Symbol {
    public final String name;
    public final String type;
    public final SymbolKind kind;
    //object?
    //attribute?
    //parameter?
    //value?

    public Symbol(String name, String type, SymbolKind kind) {
        this.name = name;
        this.type = type;
        this.kind = kind;
    }

    public SymbolKind getKind() {
        return kind;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Symbol(" + name + ": " + type + ")";
    }
}
