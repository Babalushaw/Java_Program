package com.eldahealth;

//import com.eldahealth.parkinglot.ParkingManager;
//
//public class Main {
//    public static void main(String[] args) {
////        ParkingManager parkingManager = new ParkingManager();
////        parkingManager.processInputFile("C:\\Users\\babal\\Java_Program\\Assignment\\file_inputs.txt");
//        if (args.length != 1) {
//            System.out.println("Usage: java -jar parking_lot.jar <input_file>");
//            System.exit(1);
//        }
//
//        String inputFile = args[0];
//        ParkingManager parkingManager = new ParkingManager();
//        parkingManager.processInputFile(inputFile);
//    }
//}



import com.eldahealth.parkinglot.ParkingManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ParkingManager parkingManager = new ParkingManager();

        if (args.length == 1) {
            String inputFile = args[0];
            parkingManager.processInputFile(inputFile);
        }
        else {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String command = scanner.nextLine();
                if (command.equalsIgnoreCase("exit")) {
                    break;
                }
                parkingManager.processCommand(command);
            }
            scanner.close();
        }
    }
}
