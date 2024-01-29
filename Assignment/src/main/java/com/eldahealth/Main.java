package com.eldahealth;

import com.eldahealth.parkinglot.ParkingManager;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar parking_lot.jar <input_file>");
            System.exit(1);
        }

        String inputFile = args[0];
        ParkingManager parkingManager = new ParkingManager(10);
        parkingManager.processInputFile(inputFile);
    }
}