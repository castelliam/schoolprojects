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
begin 			{ System.out.println(yytext());return newSym(mySym.BEGIN, yytext()); }
end				{ System.out.println(yytext());return newSym(mySym.END, yytext());}
"+"				{ System.out.println(yytext());return newSym(mySym.PLUS, yytext());}
";"				{ System.out.println(yytext());return newSym(mySym.SEMI, yytext());}
"*"				{ System.out.println(yytext());return newSym(mySym.TIMES, yytext());}
":="   			{ System.out.println(yytext());return newSym(mySym.ASSIGN, yytext());}
{integer} 		{ System.out.println(yytext());return newSym(mySym.INTEGER, new Integer(yytext())); } 
{identifier}  	{ System.out.println(yytext());return newSym(mySym.IDENTIFIER, yytext());}
{whitespace} 	{ System.out.print("");}  //skip over whitespace
. 				{ System.out.println("Token not found.");}