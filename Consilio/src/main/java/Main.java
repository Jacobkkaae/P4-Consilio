import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.InputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

import java.nio.file.Files;
import java.nio.file.Paths;

import visitor.ASTNode;
import visitor.DomainVisitor;
import visitor.GenericVisitor;
import visitor.ProblemVisitor;
import SymbolTable.SymbolTableBuilder;



// crafting a compiler page 325
public class Main {
    public static void main(String[] args) throws Exception {

        String domainSource = readResourceFile("testDomain.consilio");
        String problemSource = readResourceFile("testProblem.consilio");

        /*
        CharStream domainInput = CharStreams.fromString(domainSource);
        antlr.ConsilioLexer domainLexer = new antlr.ConsilioLexer(domainInput);
        CommonTokenStream domainTokens = new CommonTokenStream(domainLexer);
        antlr.ConsilioParser domainParser = new antlr.ConsilioParser(domainTokens);

        ParseTree domainTree = domainParser.domain();
        DomainVisitor domainVisitor = new DomainVisitor();

        ASTNode domainAst = domainVisitor.visit(domainTree);

        System.out.println(domainAst);




        System.out.println("\n");

        CharStream problemInput = CharStreams.fromString(problemSource);
        antlr.ConsilioLexer problemLexer = new antlr.ConsilioLexer(problemInput);
        CommonTokenStream problemTokens = new CommonTokenStream(problemLexer);
        antlr.ConsilioParser problemParser = new antlr.ConsilioParser(problemTokens);

        ParseTree problemTree = problemParser.problem();
        ProblemVisitor problemVisitor = new ProblemVisitor();

        ASTNode problemAst = problemVisitor.visit(problemTree);

        System.out.println(problemAst);

         */

        String combinedSource = domainSource + "\n" + problemSource;
        CharStream Input = CharStreams.fromString(combinedSource);
        antlr.ConsilioLexer Lexer = new antlr.ConsilioLexer(Input);
        CommonTokenStream Tokens = new CommonTokenStream(Lexer);
        antlr.ConsilioParser Parser = new antlr.ConsilioParser(Tokens);

        ParseTree Tree = Parser.program();
        GenericVisitor visitor = new GenericVisitor();

        ASTNode Ast = visitor.visit(Tree);

        System.out.println(Ast);

        SymbolTableBuilder builder = new SymbolTableBuilder();
        builder.buildSymbolTable(Ast);
        builder.getSymbolTable().dump();

        /* Some genius shit to link the two Ast's together to form a plan.
        // Now build a planning engine:
        PlanningContext ctx = new PlanningContext(domainAst, problemAst);
        Planner planner = new Planner(ctx);
        List<String> plan = planner.solve();
         */

        /*
        problemParser.removeErrorListeners();
        problemParser.addErrorListener(new DiagnosticErrorListener());

        antlr.ConsilioParser.ProblemContext problemTree = problemParser.problem();

        new ProblemVisitor().visit(problemTree);
*/
    }

    private static String readResourceFile(String fileName) throws IOException {
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new IOException("Resource not found: " + fileName);
        }
        try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8)) {
            return scanner.useDelimiter("\\A").next();
        }
    }

}
