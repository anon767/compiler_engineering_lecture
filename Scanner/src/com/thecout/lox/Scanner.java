package com.thecout.lox;


import java.util.ArrayList;
import java.util.List;

import static com.thecout.lox.TokenType.EOF;

public class Scanner {


    private final String source;
    private final List<Token> tokens = new ArrayList<>();


    public Scanner(String source) {
        this.source = source;
    }


    public List<Token> scanLine(String line, int lineNumber) {
        List<Token> returnToken = new ArrayList<>();

        return returnToken;
    }

    public List<Token> scan() {
        String[] lines = source.split("\n");
        for (int i = 0; i < lines.length; i++) {
            tokens.addAll(scanLine(lines[i], i));
        }
        tokens.add(new Token(EOF, "", "", lines.length));
        return tokens;
    }

}
