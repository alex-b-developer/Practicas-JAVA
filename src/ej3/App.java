package ej3;

import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println("Press 1 to order by bubble sort method");
        System.out.println("Press 2 to order by quick sort method");


        char data;
        data = readUserChar();

        Sorter sh = new Sorter();

            switch(data) {
                case '1':
                    sh.bubbleSort(listNumber);
                    System.out.println("Array ordered by BubbleSort Method");
                    break;

                case '2':
                    sh.quickSort(listNumber, 0, listNumber.size()-1);
                    System.out.println("Array ordered by QuickSort Method");
                    break;

                default:
                    System.out.println("No valid data. Array not ordered");
            }


        for(int i = 0; i < listNumber.size(); i++) {
            System.out.print(listNumber.get(i) + " ");
        }

    }

    public static char readUserChar(){
        Scanner input_scanner = new Scanner(System.in);
        char data = input_scanner.nextLine().charAt(0);

        return data;
    }

}
