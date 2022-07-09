package ej5;

import ej4.Vehicle;

public class Truck extends Vehicle {

    private float heightMt;

    public Truck(int wheelsNumber, int passengersNumber, Date registrationDate, float heightMt){
        super(Type.EARTH, wheelsNumber, passengersNumber, registrationDate);
        this.heightMt = heightMt;
    }

    public float HeightMt() {
        return heightMt;
    }
}
