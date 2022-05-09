| Name           |     | Body                                                                                                                        |
|----------------|-----|-----------------------------------------------------------------------------------------------------------------------------|
| program        | →   | declaration* EOF ;                                                                                                          |
| declaration    | →   | classDecl &#x7c; funDecl &#x7c; varDecl &#x7c; statement ;                                                                        |
| classDecl      | →   | "class" IDENTIFIER ( "<" IDENTIFIER )? "{" function* "}" ;                                                                  |
| funDecl        | →   | "fun" function ;                                                                                                            |
| function       | →   | IDENTIFIER "(" parameters? ")" block ;                                                                                      |
| parameters     | →   | IDENTIFIER ( "," IDENTIFIER )* ;                                                                                            |
| varDecl        | →   | "var" IDENTIFIER ( "=" expression)? ";" ;                                                                                   |
| statement      | →   | exprStmt &#x7c; forStmt &#x7c; ifStmt &#x7c; printStmt &#x7c; returnStmt &#x7c; whileStmt &#x7c; block ;                                |
| exprStmt       | →   | expression ";" ;                                                                                                            |
| forStmt        | →   | "for" "("(varDecl &#x7c; exprStmt &#x7c; ";")expression? ";" expression? ")" statement ;                         | 
| ifStmt         | →   | "if" "(" expression ")" statement ( "else" statement )? ;                                                                   |
| printStmt      | →   | "print" expression ";" ;                                                                                                    |
| returnStmt     | →   | "return" expression? ";" ;                                                                                                  |
| whileStmt      | →   | "while" "(" expression ")" statement ;                                                                                      |
| block          | →   | "{" declaration "}" ;                                                                                                       |
| expression     | →   | assignment ;                                                                                                                |
| assignment     | →   | IDENTIFIER "=" assignment &#x7c; logic_or ;                                                                       |
| logic_or       | →   | logic_and ( "or" logic_and )* ;                                                                                             |
| logic_and      | →   | equality ( "and" equality )* ;                                                                                              |
| equality       | →   | comparison ( ( "!=" &#x7c; "==" ) comparison )* ;                                                                           |
| comparison     | →   | addition ( ( ">" &#x7c; ">=" &#x7c; "<" &#x7c; "<=" ) addition )* ;                                                         |
| addition       | →   | multiplication ( ( "-" &#x7c; "+" ) multiplication )* ;                                                                     |
| multiplication | →   | unary ( ( "/" &#x7c; "\*" ) unary )\* ;                                                                                       |
| unary          | →   | ( "!" &#x7c; "-" ) unary &#x7c; call ;                                                                                         |
| call           | →   | primary ("(" arguments? ")")? ;                                                                     |
| arguments      | →   | expression ( "," expression )* ;                                                                                            |
| primary        | →   | "true" &#x7c; "false" &#x7c; "nil" &#x7c; NUMBER &#x7c; STRING &#x7c; IDENTIFIER &#x7c; "(" expression ")"; |
