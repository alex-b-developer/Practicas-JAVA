package ej5;

import ej4.Vehicle;
import java.util.Date;

public class Truck extends Vehicle {

    private float heightMt;

    /**
     *
     * @param wheelsNumber
     * @param passengersNumber
     * @param registrationDate
     * @param heightMt
     */
    public Truck(int wheelsNumber, int passengersNumber, Date registrationDate, float heightMt){
        super(Vehicle.Type.EARTH, wheelsNumber, passengersNumber, registrationDate);
        this.heightMt = heightMt;
    }

    public float HeightMt() {
        return heightMt;
    }
}
