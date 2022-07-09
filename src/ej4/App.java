package ej4;

import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the program to create 10 Vehicles");

        ArrayList<Vehicle> listVehicle = new ArrayList<Vehicle>();
        Vehicle v = null;

        Vehicle.Type input_type;
        int input_wheels;
        int input_passengers;
        Date input_date;

        for (int i = 0; i < 10; i++) {
            input_type = KeyReader.readUserType("\nAdd the Displacement Type of the Vehicle # " + (i+1));
            input_wheels = KeyReader.readUserInt("\nAdd the Wheels number of the New Vehicle # " + (i+1));
            input_passengers = KeyReader.readUserInt("\nAdd the passenger number of the New Vehicle # " + (i+1));
            input_date = KeyReader.readUserDate();

            v = new Vehicle(input_type, input_wheels, input_passengers, input_date);
            listVehicle.add(v);
        }

        System.out.println(v.displacementType());
        System.out.println(v.wheelsNumber());
        System.out.println(v.passengersNumber());
        System.out.println(v.registrationDate());
    }
}
