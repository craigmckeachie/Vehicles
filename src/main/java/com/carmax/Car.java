package com.carmax;

public class Car extends Vehicle{
    private Trunk trunk;

    public Car(){

    }


//    public Car(Trunk trunk) {
//        this.trunk = trunk;
//    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }
}
