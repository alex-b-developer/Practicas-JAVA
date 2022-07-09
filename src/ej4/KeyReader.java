package ej4;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;

public class KeyReader {

    public static String readUserString(String message){
        System.out.println(message);
        Scanner input_scanner = new Scanner(System.in);
        String data = input_scanner.nextLine();

        return data;
    }

    public static Vehicle.Type readUserType(String message){

        boolean flag = true;
        Vehicle.Type data = null;

        do {
            System.out.println(message);
            Scanner input_scanner = new Scanner(System.in);
            String s = input_scanner.nextLine();

            try {
                data = Vehicle.Type.valueOf(s);
                flag = false;
            } catch (Exception e) {
                System.out.println("\nEnter a valid data: ");
                System.out.println(java.util.Arrays.asList(Vehicle.Type.values()));
            }

        }while(flag);
        return data;
    }

    public static int readUserInt(String message){
        String data = "";
        boolean flag = true;

        while(flag){
            System.out.println(message);
            Scanner input_scanner = new Scanner(System.in);
            data = input_scanner.nextLine();

            if(isNumeric(data)){
                flag = false;
            }else{
                System.out.println("Enter a valid data");
            }
        }

        return Integer.parseInt(data);
    }
    public static Date readUserDate(){
        boolean flag = true;
        Date date = new Date();
        String input;

        do {
            input = readUserString("\nRegistration Date: format DD/MM/YYYY ");

            try {
                DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
                date = format.parse(input);
                flag = false;
            } catch (ParseException e) {
                System.out.println("\nEnter a valid data");
            }
        }while (flag);

        return date;
    }

    public static boolean isNumeric(String number){
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}
