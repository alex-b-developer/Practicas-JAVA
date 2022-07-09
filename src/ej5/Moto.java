package ej5;

import ej4.Vehicle;

public class Moto extends Vehicle {

    private Type motorType;

    public Moto(Type motorType, Date registrationDate){
        super(Type.EARTH, 2, 2, registrationDate);
        this.motorType = motorType;
    }

    public Type motorType() {
        return motorType;
    }

    public enum Type {
        TWOTIMES, FOURTIMES
    }
}
