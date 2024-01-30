#!/bin/bash

# Navigate to the project root
cd "$(dirname "$0")/.."

# Verify the presence of the compiled JAR file
if [ ! -f "target/Assignment-1.0-SNAPSHOT.jar" ]; then
  echo "Error: The compiled JAR file is not found. Run bin/setup.sh first."
  exit 1
fi

# Run the parking_lot program with the input file as an argument
java -jar target/Assignment-1.0-SNAPSHOT.jar "$1" bin/parking_lot input.txt
