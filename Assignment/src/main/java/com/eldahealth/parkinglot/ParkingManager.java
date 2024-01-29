package com.eldahealth.parkinglot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParkingManager {
    private ParkingLot parkingLot;

    public ParkingManager(int capacity) {
        parkingLot = new ParkingLot(capacity);
    }

    public void processInputFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                processCommand(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processCommand(String command) {
        // Parse and execute the command
        // Example: "park KA-01-HH-1234 White"
    }

    // Additional methods for other functionalities
}
