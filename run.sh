#!/bin/bash

# Compiles all

javac *.java

#if a success

if javac *.java; then
  java Main
else
  echo "Compilation failed."
fi
