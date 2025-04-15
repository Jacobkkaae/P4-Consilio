grammar Consilio;

@header {
    package antlr;
}

program
    : domain problem EOF
    ;


/*
 * Parser Rules
 */

domain
    : DEFINE DOMAIN IDENTIFIER type* action*
    ;

problem
    : DEFINE PROBLEM IDENTIFIER IMPORT IDENTIFIER objects init goal
    ;

type
    : TYPE IDENTIFIER LBRACE (attribute SEMI)* RBRACE
    ;

attribute
    : IDENTIFIER COLON value
    ;

value
    : valueType
    | valueType OR value
    | IDENTIFIER LSQUARE RSQUARE
    ;

valueType: INT | BOOLEAN | IDENTIFIER;

action
    : ACTION IDENTIFIER LPAREN parameterList RPAREN LBRACE statement* RBRACE
    ;

parameterList
    : parameter (COMMA parameter)*
    ;
parameter
    : IDENTIFIER IDENTIFIER
    ;

/*
actionBody
    : ifBlock
    | (statement SEMI)*
    ;
*/

objects
    : OBJECTS LBRACE objectBody RBRACE
    ;

objectBody
    : (arrayInitializer SEMI)*
    ;

arrayInitializer
    : IDENTIFIER IDENTIFIER LSQUARE RSQUARE ASSIGN LBRACE arrayBody RBRACE
    ;

arrayBody
    : IDENTIFIER (COMMA arrayBody)?
    ;

init
    : INITIALSTATE LBRACE (assignment SEMI)* RBRACE
    ;

goal
    : GOALSTATE LBRACE (expression SEMI)* RBRACE
    ;

ifBlock
    : IF LPAREN expression RPAREN LBRACE statement* RBRACE
    ;

statement
    : ifBlock
    | assignment SEMI
//    | expression        #expressionStatement
//    | SEMI              #semiColon
    ;

assignment
    : IDENTIFIER ASSIGN expression    //Vi kan ikke huske hvorfor denne var med. Eventuelt slet til sidst hvis ikke det bliver brugt
    | dotNotation ASSIGN expression
    ;

dotNotation
    : IDENTIFIER DOT IDENTIFIER
    | IDENTIFIER LSQUARE arrayBodyInt RSQUARE DOT IDENTIFIER
    ;

arrayBodyInt
    : expression (COMMA arrayBodyInt)? // var tidligere: INT_LITERAL (COMMA arrayBodyInt)?
    ;


expression
    : constant
    | IDENTIFIER
    | LPAREN expression RPAREN
    | dotNotation
    | IDENTIFIER LSQUARE arrayBodyInt RSQUARE
    | expression addOp expression
    | expression compOp expression
    | expression locOp expression
    ;


addOp: ADD | SUB;
compOp: GT | LT | GE | LE | EQUAL | NOTEQUAL;
locOp: AND | OR; // LogOp?

constant: INT_LITERAL | BOOLEAN_LITERAL;


/*
 * Lexer Rules
*/
 // TODO: Muligvis tilføj NULL. Hvis det tilføjes, gør det inde i rapporten ligeså.


INT_LITERAL: Digits+;
BOOLEAN_LITERAL: 'true' | 'false';
//NULL_LITERAL: 'null';

//Keyword
IF              : 'if';
INT             : 'int';
BOOLEAN         : 'boolean';
INITIALSTATE    : 'initialState';
GOALSTATE       : 'goalState';
OBJECTS         : 'objects';
TYPE            : 'type';
ACTION          : 'action';
IMPORT          : 'import';
DEFINE          : 'define';
DOMAIN          : 'domain';
PROBLEM         : 'problem';


// Separators
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LSQUARE : '[';
RSQUARE : ']';
SEMI   : ';';
COMMA  : ',';
DOT    : '.';

// Operators
ASSIGN   : '=';
GT       : '>';
LT       : '<';
COLON    : ':';
EQUAL    : '==';
LE       : '<=';
GE       : '>=';
NOTEQUAL : '!=';
AND      : '&&';
OR       : '||';
ADD      : '+';
SUB      : '-';


WS: [ \t\r\n]+ -> skip;

IDENTIFIER: Letter LetterOrDigit*;

fragment Digits: [0-9];

fragment Letter: [a-zA-Z];

fragment LetterOrDigit: Letter | Digits;
