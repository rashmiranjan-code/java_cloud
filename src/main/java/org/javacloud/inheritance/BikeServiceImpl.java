package org.javacloud.inheritance;

public class BikeServiceImpl  extends VehicleService{
    String helmetName;
    @Override
    public void startVechicle() {
        System.out.println("I Stared my "+brand+" with two wheal and my " +helmetName);
    }

    @Override
    public void fillFuel() {
        System.out.println("please fill only petrol inside me");

    }
}
