#!/bin/bash

PROGFOLD="miniTriangleExample"
JFLEXPROGNAME="triangle.jflex"
LANGLEXER="TriangleLexer.java"
LANGLEXERTEST="TriangleLexerTest"
DOTJAVA=$LANGLEXERTEST+".java"
TRIANGLEPROG="sample.tri"


cd /Users/a_mcastelli/Documents/SeniorSemester2/CS420/FilesNeededForJFlexCup/$PROGFOLD
sudo jflex $JFLEXPROGNAME
javac $LANGLEXER
javac $DOTJAVA
java $LANGLEXERTEST $TRIANGLEPROG