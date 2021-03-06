/*
Defines a lexical analyzer for a subset of the language Triangle.  Triangle is a language described in the text
Programming Language Processors in Java by David Watt and Deryck Brown.

author: RoxAnn H Stalvey 
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

%%
begin { System.out.println("begin");}
DIGIT { System.out.println("Keyword - DIGIT"); }
{DIGIT} {System.out.println("Digit"); }
{Operator} {System.out.println("Operator");}
{whitespace} {System.out.println("Whitespace");}