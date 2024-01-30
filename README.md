# Parking Lot Management System

This project is a simple implementation of a parking lot management system with both interactive and file-based input.

## Installation

### Prerequisites
- Java Development Kit (JDK) installed (version 8 or higher)
- Apache Maven installed (for building the project)

### Steps

1. Clone the repository:
   ```bash
   git clone <https://github.com/Babalushaw/Java_Program.git>   # But repository is private
   cd Assignment # move to the Assignment Directory
   bin/setup.sh  # Run the setup script to install dependencies, compile the code, and run tests
   bin/parking_lot.sh file_inputs.txt # To run the program with a file input (replace file_inputs.txt with your file name)
   bin/parking_lot.sh  #To run the program in interactive mode (manual input or interactive):
   create_parking_lot 6        # Command to create a parking lot with 6 slots
   park KA-01-HH-1234 White    # Command to park a car with registration KA-01-HH-1234 and color White
   park KA-01-HH-9999 White    # Command to park a car with registration KA-01-HH-9999 and color White
   park KA-01-BB-0001 Black    # Command to park a car with registration KA-01-BB-0001 and color Black
   park KA-01-HH-7777 Red      # Command to park a car with registration KA-01-HH-7777 and color Red
   park KA-01-HH-2701 Blue     # Command to park a car with registration KA-01-HH-2701 and color Blue
   park KA-01-HH-3141 Black    # Command to park a car with registration KA-01-HH-3141 and color Black
   leave 4                     # Command to vacate parking slot number 4
   status                      # Command to display the current status of the parking lot
   park KA-01-P-333 White      # Command to park a car with registration KA-01-P-333 and color White
   park DL-12-AA-9999 White    # Command to park a car with registration DL-12-AA-9999 and color White
   registration_numbers_for_cars_with_colour White    # Command to list registration numbers of cars with color White
   slot_numbers_for_cars_with_colour White            # Command to list slot numbers of cars with color White
   slot_number_for_registration_number KA-01-HH-3141  # Command to find the slot number for registration KA-01-HH-3141
   slot_number_for_registration_number MH-04-AY-1111  # Command to find the slot number for registration MH-04-AY-1111
<!-- ## Command Descriptions

- `create_parking_lot <number>`: Creates a parking lot with the specified number of slots.
- `park <registration_number> <color>`: Parks a car with the given registration number and color.
- `leave <slot_number>`: Vacates the specified parking slot.
- `status`: Displays the current status of the parking lot.
- `registration_numbers_for_cars_with_colour <color>`: Lists registration numbers of cars with the given color.
- `slot_numbers_for_cars_with_colour <color>`: Lists slot numbers of cars with the given color.
- `slot_number_for_registration_number <registration_number>`: Finds the slot number for the specified registration number. -->
<
