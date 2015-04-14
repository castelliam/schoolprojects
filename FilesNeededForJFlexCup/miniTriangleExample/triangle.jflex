/*
JFlex input file that will recognize tokens in Triangle language and print to the console the tokens found
Error is displayed if not found
Programming Language Processors in Java by David Watt and Deryck Brown.

author: Alex Castelli
*/

import java_cup.runtime.*;
import java_cup.*;

%%

%class TriangleLexer
%cup
%unicode
%line
%column

Operator = [+*-/<\\>=]
DIGIT = [0-9]
whitespace = [\n \t\r]
letter = [a-zA-Z]
TerminalSymbols = [;:{}]
Comment = \!.*
EqualColon = [:]
Equal = [=]

%%
begin { System.out.println("begin");}
const { System.out.println("const");}
do { System.out.println("do");}
else { System.out.println("else");}
end { System.out.println("end");}
if { System.out.println("if");}
in { System.out.println("in");}
let { System.out.println("let");}
var { System.out.println("var");}
while { System.out.println("while");}
DIGIT { System.out.println("Keyword - DIGIT"); }
{DIGIT} {System.out.println("Digit"); }
{Operator} {System.out.println("Operator");}
{whitespace} {System.out.println("Whitespace");}
{letter} {System.out.println("Letter");}
{TerminalSymbols} {System.out.println("Terminal Symbols");}
{EqualColon}{Equal} {System.out.println("Equals");}
{Comment} {System.out.println("Comment");}
{letter}({letter}|{DIGIT})* {System.out.println("Identifier");}
{DIGIT}+ {System.out.println("Integer-Literal");}
. {System.out.println("Token Not Recognized");}
