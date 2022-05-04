| Name           |     | Body                                                                                                                        |
|----------------|-----|-----------------------------------------------------------------------------------------------------------------------------|
| program        | →   | declaration* EOF ;                                                                                                          |
| declaration    | →   | classDecl<br/> funDecl<br/> varDecl<br/> statement ;                                                                        |
| classDecl      | →   | "class" IDENTIFIER ( "<" IDENTIFIER )? "{" function* "}" ;                                                                  |
| funDecl        | →   | "fun" function ;                                                                                                            |
| function       | →   | IDENTIFIER "(" parameters? ")" block ;                                                                                      |
| parameters     | →   | IDENTIFIER ( "," IDENTIFIER )* ;                                                                                            |
| varDecl        | →   | "var" IDENTIFIER ( "=" expression)? ";" ;                                                                                   |
| statement      | →   | exprStmt<br/> forStmt<br/> ifStmt<br/> printStmt<br/> returnStmt<br/> whileStmt<br/> block ;                                |
| exprStmt       | →   | expression ";" ;                                                                                                            |
| forStmt        | →   | "for" "(" ( varDecl &#x7c; exprStmt &#x7c; ";" )<br/>expression? ";"<br/expression? ")" statement ;                         | 
| ifStmt         | →   | "if" "(" expression ")" statement ( "else" statement )? ;                                                                   |
| printStmt      | →   | "print" expression ";" ;                                                                                                    |
| returnStmt     | →   | "return" expression? ";" ;                                                                                                  |
| whileStmt      | →   | "while" "(" expression ")" statement ;                                                                                      |
| block          | →   | "{" declaration "}" ;                                                                                                       |
| expression     | →   | assignment ;                                                                                                                |
| assignment     | →   | (call ".")? IDENTIFIER "=" assignment<br/>logic_or ;                                                                       |
| logic_or       | →   | logic_and ( "or" logic_and )* ;                                                                                             |
| logic_and      | →   | equality ( "and" equality )* ;                                                                                              |
| equality       | →   | comparison ( ( "!=" &#x7c; "==" ) comparison )* ;                                                                           |
| comparison     | →   | addition ( ( ">" &#x7c; ">=" &#x7c; "<" &#x7c; "<=" ) addition )* ;                                                         |
| addition       | →   | multiplication ( ( "-" &#x7c; "+" ) multiplication )* ;                                                                     |
| multiplication | →   | unary ( ( "/" &#x7c; "*" )
unary )* ;                                                                                       |
| unary          | →   | ( "!" &#x7c; "-" ) unary<br/>call ;                                                                                         |
| call           | →   | IDENTIFIER "(" arguments? ")" ;                                                                     |
| arguments      | →   | expression ( "," expression )* ;                                                                                            |
| primary        | →   | "true"<br/> "false"<br/> "nil"<br/> NUMBER<br/> STRING<br/> IDENTIFIER<br/> "(" expression ")"<br/> "super" "." IDENTIFIER; |
