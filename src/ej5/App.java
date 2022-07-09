package ej5;

import ej4.KeyReader;
import ej4.Vehicle;
import java.util.ArrayList;
import java.util.Date;

/**
 * [This is the app to create diferrent vehicles.
 *
 * @version [1.01.001 2022-07-04]
 *
 * @author [Alexander Betancur - alexbetbu@gmail.com]
 *
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the program to create 10 Vehicles");

        ArrayList<Vehicle> listVehicle = new ArrayList<Vehicle>();
        Vehicle v = null;

        int input_type;
        int input_wheels;
        int input_passengers;
        Date input_date;

        boolean input_trunk;
        float input_height;
        float input_long;
        Moto.MotorType input_motortype;

        boolean flag;

        for (int i = 0; i < 10; i++) {

            flag = false;

            do{
                input_type = KeyReader.readUserInt("\nTO CREATE NEW VEHICLE # " + (i+1) + "\nPlease select: 1-MOTO 2-CAR 3-TRUCK 4-BOAT ");

                switch(input_type) {
                case 1:
                    input_motortype = KeyReader.readUserMType("Add The type of the motor");
                    input_date = KeyReader.readUserDate();
                    v = new Moto(input_motortype, input_date);
                    System.out.println("Vehicle # " + (i+1) + " was created successfully");
                    flag = true;
                    break;

                case 2:
                    input_wheels = KeyReader.readUserInt("\nAdd the Wheels number of the New Vehicle # " + (i+1));
                    input_passengers = KeyReader.readUserInt("\nAdd the passenger number of the New Vehicle # " + (i+1));
                    input_date = KeyReader.readUserDate();
                    input_trunk = KeyReader.readUserBoolean("\nDoes it have trunk? true/false. New Vehicle # " + (i+1));
                    v = new Car(input_wheels, input_passengers, input_date, input_trunk);
                    System.out.println("Vehicle # " + (i+1) + " was created successfully");
                    flag = true;
                    break;

                case 3:
                    input_wheels = KeyReader.readUserInt("\nAdd the Wheels number of the New Vehicle # " + (i+1));
                    input_passengers = KeyReader.readUserInt("\nAdd the passenger number of the New Vehicle # " + (i+1));
                    input_height = KeyReader.readUserFloat("\nAdd the height of New Vehicle # " + (i+1));
                    input_date = KeyReader.readUserDate();
                    v= new Truck(input_wheels, input_passengers, input_date, input_height);
                    System.out.println("Vehicle # " + (i+1) + " was created successfully");
                    flag = true;
                    break;

                case 4:
                    input_passengers = KeyReader.readUserInt("\nAdd the passenger number of the New Vehicle # " + (i+1));
                    input_long = KeyReader.readUserFloat("\nAdd the long size of the New Vehicle # " + (i+1));
                    input_date = KeyReader.readUserDate();
                    v= new Boat(input_passengers, input_date, input_long);
                    System.out.println("Vehicle # " + (i+1) + " was created successfully");
                    flag = true;
                    break;

                default:
                    System.out.println("Please select a valid data");
                    break;
            }

            }while (!flag);

            listVehicle.add(v);
        }
    }
}
