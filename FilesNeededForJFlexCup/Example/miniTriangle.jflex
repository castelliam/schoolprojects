/*
RoxAnn H Stalvey
*/

import java_cup.runtime.*;
import java_cup.*;

%%

%class MiniTriangleLexer
%cup
%unicode
%line
%column

%{

/**
 * Return a new Symbol with the given token id, and with the current line and
 * column numbers.
 */
Symbol newSym(int tokenId) {
    return new Symbol(tokenId, yyline, yycolumn);
}


/**
 * Return a new Symbol with the given token id, the current line and column
 * numbers, and the given token value.  The value is used for tokens such as
 * identifiers and numbers.
 */
Symbol newSym(int tokenId, Object value) {
    return new Symbol(tokenId, yyline, yycolumn, value);
}

%}

LETTER = [a-zA-Z]
DIGIT = [0-9]
identifier = {LETTER}({LETTER}|{DIGIT})*
whitespace = ([\n \t\r])+
integer = ({DIGIT})+
operator = "+" | "-"
comment = !.*[\n\r]

%%
begin 			{ System.out.println(yytext());return newSym(mySym.BEGIN); }
end				{ System.out.println(yytext());return newSym(mySym.END);}
"+"				{ System.out.println(yytext());return newSym(mySym.PLUS);}
";"				{ System.out.println(yytext());return newSym(mySym.SEMI);}
"*"				{ System.out.println(yytext());return newSym(mySym.TIMES);}
":="   			{ System.out.println(yytext());return newSym(mySym.ASSIGN);}
{integer} 		{ System.out.println(yytext());return newSym(mySym.INTEGER); } //, new Integer(yytext()));}
{identifier}  	{ System.out.println(yytext());return newSym(mySym.IDENTIFIER);}
{whitespace} 	{ System.out.print("");}  //skip over whitespace
. 				{ System.out.println("Token not found.");}
if 				{ System.out.println(yytext());return newSym(mySym.IF); }
then 			{ System.out.println(yytext());return newSym(mySym.THEN); }
else 			{ System.out.println(yytext());return newSym(mySym.ELSE); }
while 			{ System.out.println(yytext());return newSym(mySym.WHILE); }
do 				{ System.out.println(yytext());return newSym(mySym.DO); }
let 			{ System.out.println(yytext());return newSym(mySym.LET); }
in 				{ System.out.println(yytext());return newSym(mySym.IN); }






