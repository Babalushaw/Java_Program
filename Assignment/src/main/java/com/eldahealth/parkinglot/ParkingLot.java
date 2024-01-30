package com.eldahealth.parkinglot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ParkingLot {
    private List<Slot> slots=new ArrayList<>();
    private int capacity=0;
    public ParkingLot() {
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        System.out.println("Created a parking lot with "+ capacity +" slots");
    }

    public void parkCar(Car car) {
        this.slots.sort(Comparator.comparingInt(Slot::getSlotNumber));
        boolean T=true;
        for(int i=0;i<slots.size();i++){
            if(this.slots.get(i).getSlotNumber()!=i+1){
                slots.add(new Slot(i+1,car));
                T=false;
                System.out.println("Allocated slot number: "+(i+1));
                this.setSlots(slots);
                return;
            }
        }
        if(T && slots.size()<this.getCapacity()){
            slots.add(new Slot(slots.size()+1,car));
            System.out.println("Allocated slot number: "+slots.size());
            this.setSlots(slots);
            return;
        }
        System.out.println("Sorry, parking lot is full");
    }

    public void removeCar(int slotNumber) {
        for(Slot slot: slots){
            if(slot.getSlotNumber()==slotNumber){
                System.out.println("Slot number "+slotNumber +" is free "+ slot.getParkedCar().getRegistrationNumber());
                slots.remove(slot);
                this.setSlots(slots);
                return;
            }
        }
    }

    public void getStatus() {
        System.out.println("Slot No.  Registration No     Colour");
        slots.stream().forEach(slot1 -> {
            System.out.println(slot1.getSlotNumber()+"         "+slot1.getParkedCar().getRegistrationNumber()+"       "+slot1.getParkedCar().getColor());
        });
    }

    public void findRegistrationByColourOfCar(String colour) {
        List<String> responseList=new ArrayList<>();
        slots.stream().forEach(slot2 -> {
            if(slot2.getParkedCar().getColor().compareTo(colour)==0){
                responseList.add(slot2.getParkedCar().getRegistrationNumber());
            }
        });
        if(responseList.size()== 0){
            System.out.println("Not Found");
        }else {
            System.out.println(responseList);
        }
    }

    public void findSlotByColourOfCar(String colour) {
        List<Integer> responseList=new ArrayList<>();
        slots.stream().forEach(slot3 -> {
            if(slot3.getParkedCar().getColor().compareTo(colour)==0){
                responseList.add(slot3.getSlotNumber());
            }
        });
        if(responseList.size()== 0){
            System.out.println("Not Fond");
        }else {
            System.out.println(responseList);
        }
    }
    public void findSlotByRegistrationNumberOfCar(String registrationNumber) {
        for (Slot slot: slots){
            if(slot.getParkedCar().getRegistrationNumber().compareTo(registrationNumber)==0){
                System.out.println(slot.getSlotNumber());
                return;
            }
        }
            System.out.println("Not Fond");
    }
    public void InvalidMessage() {
        System.out.println("Not a Valid Input");
    }
}
