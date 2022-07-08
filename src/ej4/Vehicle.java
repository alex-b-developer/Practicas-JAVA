package ej4;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Vehicle {

    private Type displacementType;
    private int wheelsNumber;
    private int passengersNumber;
    private Date registrationDate;
    private boolean hasCrew;

    public Vehicle(Type displacementType, int wheelsNumber, int passengersNumber, Date registrationDate){
        this.displacementType = displacementType;
        this.wheelsNumber = wheelsNumber;
        this.passengersNumber = passengersNumber;
        this.registrationDate = registrationDate;
        this.hasCrew = false;
    }

    public Type displacementType() {
        return displacementType;
    }

    public int wheelsNumber() {
        return wheelsNumber;
    }

    public int passengersNumber() {
        return passengersNumber;
    }

    public Date registrationDate() {
        return registrationDate;
    }

    public boolean hasCrew(){
        return hasCrew;
    }

    public void setHasCrew(boolean hasCrew) {
        this.hasCrew = hasCrew;
    }

    public enum Type {
        EARTH, WATER, AIR
    }
}
