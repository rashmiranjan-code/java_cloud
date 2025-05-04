package org.javacloud.inheritance;

public class CarServiceImpl extends VehicleService{
    Integer numberOfDoorOpen;
    @Override
    public void startVechicle() {
        System.out.println("I Stared my "+brand+" with four wheal and number of door open is " +numberOfDoorOpen);
    }

    @Override
    public void fillFuel() {
        System.out.println("please fill only petrol inside me");

    }
}
