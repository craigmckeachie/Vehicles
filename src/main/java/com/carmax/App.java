package com.carmax;

public class App {
    public static void main(String[] args) {
        Moped moped = new Moped(true);
        moped.setColor("Blue");

        System.out.println(moped.getColor());

//        Car car = new Car();
//        car.setColor("orange");
//        car.setFuelCapacity(16);
//
//        System.out.println("The color of the car is: " + car.getColor() + " The fuel capacity is: " + car.getFuelCapacity());
//
//        SemiTruck truck = new SemiTruck();
//        System.out.println(truck);
//
//        Hovercraft hovercraft = new Hovercraft();
//        System.out.println(hovercraft);

    }
}
