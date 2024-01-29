#!/bin/bash

# This script runs the parking lot program itself.
# It takes an input file as an argument and prints the output on STDOUT.

# Check if the target directory exists
if [ ! -d "target" ]; then
    echo "Please run bin/setup first to build the project."
    exit 1
fi

# Assuming the compiled JAR file is in the target directory
java -jar target/parking_lot.jar "$1"