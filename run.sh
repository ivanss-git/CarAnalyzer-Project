#!/bin/bash

# Compile all Java files
javac *.java

# If compilation succeeds, run the program
if javac *.java; then
  java Main
else
  echo "Compilation failed."
fi