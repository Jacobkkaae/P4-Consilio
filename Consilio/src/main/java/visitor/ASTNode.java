package visitor;

import java.util.ArrayList;
import java.util.List;

public class ASTNode {
    public String type;
    public List<ASTNode> children = new ArrayList<>();
    public ASTNode parent;

    public ASTNode(String type) {
        this.type = type;
    }

    public void adoptChildren(ASTNode... newChildren) {
        for (ASTNode child : newChildren) {
            if (child != null) {
                children.add(child);
                child.parent = this;
            }
        }
    }

    @Override
    public String toString() {
        return toString(0);
    }

    private String toString(int indent) {
        StringBuilder sb = new StringBuilder("  ".repeat(indent) + type + "\n");
        for (ASTNode child : children) {
            sb.append(child.toString(indent + 1));
        }
        return sb.toString();
    }
}
