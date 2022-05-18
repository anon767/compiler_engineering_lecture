package com.thecout.lox;

import com.thecout.lox.Parser.Parser;
import com.thecout.lox.Parser.Stmts.Stmt;
import com.thecout.lox.Traversal.AstPrinter;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PrintTest {
    static final String program = """
            fun printSum(a,b) {
            print a+b;
            }
            printSum(1,2);
            """;

    //Just succeeds
    @Test
    void printTest() {
        Scanner scanner = new Scanner(program);
        List<Token> actual = scanner.scan();
        Parser parser = new Parser(actual);
        List<Stmt> statements = parser.parse();
        AstPrinter printer = new AstPrinter();
        statements.stream().map(printer::print).forEach(System.out::println);
    }
}
