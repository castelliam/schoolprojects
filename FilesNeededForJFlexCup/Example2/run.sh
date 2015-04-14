#!/bin/bash

java java_cup.Main -parser MiniTriangleParser -symbols mySym < miniTriangleParser.cup

jflex miniTriangle.jflex 

javac MiniTriangleParser.java mySym.java MiniTriangleParserTest.java

java MiniTriangleParserTest basic.tri