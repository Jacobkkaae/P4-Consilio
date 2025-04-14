package SymbolTable;

public class Symbol {
    public final String name;
    public final String type;
    //object?
    //attribute?
    //parameter?
    //value?

    public Symbol(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Symbol(" + name + ": " + type + ")";
    }
}
