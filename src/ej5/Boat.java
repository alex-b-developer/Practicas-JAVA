package ej5;

import ej4.Vehicle;

public class Boat extends Vehicle {

    public float longSizeMt;

    public Boat(int wheelsNumber, int passengersNumber, Date registrationDate, float longSizeMt){
        super(Type.EARTH, wheelsNumber, passengersNumber, registrationDate);
        this.longSizeMt = longSizeMt;
    }

    public float longSizeMt() {
        return longSizeMt;
    }
}
