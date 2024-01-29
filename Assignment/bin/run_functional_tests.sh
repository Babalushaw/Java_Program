#!/bin/bash

# This script runs the functional test suite for the parking lot program.

# Assuming the compiled JAR file is in the target directory
java -jar target/parking_lot.jar functional_spec/input.txt
