#!/bin/bash

# Navigate to the project root
cd "$(dirname "$0")/.."

# Verify the presence of the pom.xml file
if [ ! -f "pom.xml" ]; then
  echo "Error: The pom.xml file is not found in the project directory."
  exit 1
fi

# Run Maven commands to install dependencies and compile
mvn clean install

# Run unit tests
mvn test

echo "Setup complete"


