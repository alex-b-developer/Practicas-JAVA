package ej6;

import ej4.KeyReader;
import java.util.*;

/**
 * [This is the app to read numbers form keyboard.
 *
 * @version [1.01.001 2022-07-04]
 *
 * @author [Alexander Betancur - alexbetbu@gmail.com]
 *
 */

public class App {
    public static void main(String[] args) {
        System.out.println("_");

        Vector <Integer> vector = new Vector();
        Integer input;
        boolean flag = false;
        vector.addElement(null);

        do
        {
            input = KeyReader.readUserInt("Please Add a number ");

            if(vector.lastElement() == input){
                flag = true;
            }
            vector.addElement(input);

        }while(!flag);

        for (int i=1; vector.size() > i; i++){
            System.out.print(vector.elementAt(i) + " ");
        }
    }
}
