package org.javacloud.inheritance;
//easy
public class TestVehicle {
    public static void main(String[] args) {

        CarServiceImpl myCar = new CarServiceImpl();
        myCar.brand = "Toyota";
        myCar.numberOfDoorOpen=2;
        myCar.startVechicle();
    }
}
