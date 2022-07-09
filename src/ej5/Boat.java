package ej5;

import ej4.Vehicle;
import java.util.Date;

public class Boat extends Vehicle {

    public float longSizeMt;

    public Boat(int passengersNumber, Date registrationDate, float longSizeMt){
        super(Vehicle.Type.WATER, 0, passengersNumber, registrationDate);
        this.longSizeMt = longSizeMt;
    }

    public float longSizeMt() {
        return longSizeMt;
    }
}
