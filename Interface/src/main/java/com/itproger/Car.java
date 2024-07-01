package com.itproger;

public class Car extends Vehicle {

    public Car(String model, int year) {
        super(model, year);

    }

    @Override
    public void move() {
        System.out.println("move brrrrr......");
    }

}
