package com.eldahealth.parkinglot;

public class Slot {
    private int slotNumber;
    private Car parkedCar;

    public Slot() {
    }

    public Slot(int slotNumber, Car parkedCar) {
        this.slotNumber = slotNumber;
        this.parkedCar = parkedCar;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void setParkedCar(Car parkedCar) {
        this.parkedCar = parkedCar;
    }
}

