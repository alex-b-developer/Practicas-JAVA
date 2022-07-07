package ej3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Random Numbers List:");

        ArrayList<Integer> listNumber = new ArrayList<Integer>();


        for(int i = 0; i < 10; i++) {
            double data = Math.random()*100;
            int number = (int)data;
            listNumber.add(i, number);
        }

        for(int i = 0; i < listNumber.size(); i++) {
            System.out.print(listNumber.get(i) + " ");
        }

        System.out.println("\n" + "To order the list");
        System.out.println("Press 1 to order by bubble algorithm method");
        System.out.println("Press 2 to order by quick sort method");


    }
}
