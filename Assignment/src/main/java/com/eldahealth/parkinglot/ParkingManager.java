package com.eldahealth.parkinglot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParkingManager {
    private ParkingLot parkingLot;
    public ParkingManager() {
        parkingLot=new ParkingLot();
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
        String[] parts = command.trim().split("\\s+");

        switch (parts[0].toLowerCase()) {
            case "create_parking_lot":
                int capacity = Integer.parseInt(parts[1]);
                this.parkingLot.setCapacity(capacity);
                break;
            case "park":
                String registrationNumber = parts[1];
                String color = parts[2];
                this.parkingLot.parkCar(new Car(registrationNumber, color));
                break;
            case "leave":
                int slotNumber = Integer.parseInt(parts[1]);
                this.parkingLot.removeCar(slotNumber);
                break;
            case "status":
                this.parkingLot.getStatus();
                break;
            case "registration_numbers_for_cars_with_colour":
                String searchColor = parts[1];
                this.parkingLot.findRegistrationByColourOfCar(searchColor);
                break;
            case "slot_numbers_for_cars_with_colour":
                searchColor = parts[1];
                this.parkingLot.findSlotByColourOfCar(searchColor);
                break;
            case "slot_number_for_registration_number":
                String searchRegistrationNumber = parts[1];
                this.parkingLot.findSlotByRegistrationNumberOfCar(searchRegistrationNumber);
                break;
            default:
                this.parkingLot.InvalidMessage();
        }
    }
}
