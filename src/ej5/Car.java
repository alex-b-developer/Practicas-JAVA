package ej5;

import ej4.Vehicle;
import java.util.Date;

public class Car extends Vehicle {

    private boolean trunk;

    /**
     *
     * @param wheelsNumber
     * @param passengersNumber
     * @param registrationDate
     * @param trunk
     */
    public Car(int wheelsNumber, int passengersNumber, Date registrationDate, boolean trunk){
        super(Vehicle.Type.EARTH, wheelsNumber, passengersNumber, registrationDate);
        this.trunk = trunk;
    }

    public boolean trunk() {
        return trunk;
    }
}
