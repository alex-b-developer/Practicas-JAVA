package ej3;

import java.util.ArrayList;

public class Sorter {

    public static void bubbleSort(ArrayList<Integer> listNumber){

        Integer aux;
        boolean changes = false;

        while(true){

            changes = false;
            for (int i = 1; i< listNumber.size(); i++){
                if(listNumber.get(i) < listNumber.get(i-1)){
                    aux = listNumber.get(i);
                    listNumber.set(i, listNumber.get(i-1) );
                    listNumber.set(i-1, aux);
                    changes = true;
                }
            }
            if (changes == false){
                break;
            }
        }
    }

    public static void quickSort(ArrayList<Integer> listNumber, int left, int right){
        if(left>=right) return;
        int pivote=listNumber.get(left);
        int elemIzq=left+1;
        int elemDer=right;
        while(elemIzq<=elemDer){
            while(elemIzq<=right && listNumber.get(elemIzq)<pivote){
                elemIzq++;
            }
            while(elemDer>left && listNumber.get(elemDer)>=pivote){
                elemDer--;
            }
            if(elemIzq<elemDer){
                int temp=listNumber.get(elemIzq);
                listNumber.set(elemIzq, listNumber.get(elemDer));
                listNumber.set(elemDer, temp);
            }
        }

        if(elemDer>left){
            int temp=listNumber.get(left);
            listNumber.set(left, listNumber.get(elemDer));
            listNumber.set(elemDer, temp);

        }
        quickSort(listNumber, left, elemDer-1);
        quickSort(listNumber, elemDer+1, right);

    }

}
