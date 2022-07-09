package ej4;

import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the program to create 10 Vehicles");

        ArrayList<Vehicle> listVehicle = new ArrayList<Vehicle>();
        Vehicle v = null;

        Vehicle.Type input1;
        int input2;
        int input3;
        Date input4;

        for (int i = 0; i < 10; i++) {
            input1 = KeyReader.readUserType("\nAdd the Displacement Type of the Vehicle # " + (i+1));
            input2 = KeyReader.readUserInt("\nAdd the Wheels number of the New Vehicle # " + (i+1));
            input3 = KeyReader.readUserInt("\nAdd the passenger number of the New Vehicle # " + (i+1));
            input4 = KeyReader.readUserDate();

            v = new Vehicle(input1, input2, input3, input4);
            listVehicle.add(v);
        }

        System.out.println(v.displacementType());
        System.out.println(v.wheelsNumber());
        System.out.println(v.passengersNumber());
        System.out.println(v.registrationDate());
    }
}
