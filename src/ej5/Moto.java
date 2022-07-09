package ej5;

import ej4.Vehicle;
import java.util.Date;

public class Moto extends Vehicle {

    private MotorType motorType;

    public Moto(MotorType motorType, Date registrationDate){
        super(Vehicle.Type.EARTH, 2, 2, registrationDate);
        this.motorType = motorType;
    }

    public MotorType motorType() {
        return motorType;
    }

    public enum MotorType {
        TWOTIMES, FOURTIMES
    }
}
