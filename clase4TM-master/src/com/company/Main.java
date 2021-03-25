package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.util.Comparator;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] enteros = new Integer[100000];
        for (int i = 0; i < enteros.length; i++){
            enteros[i] = ThreadLocalRandom.current().nextInt(1, 100000);
            //System.out.println(enteros[i]);
        }
        String[] cadenas = {"Casa", "Gato", "Vaca", "Hola", "Sol", "Arbol"};
        Comparator<Integer> c1 = (a,b)->a - b;
        Comparator<String> c2 = (a,b)->a.compareTo(b);

        try {
            MyFactory factory = new MyFactory();
            Sorter instancia = (Sorter)factory.getInstance("sorter");
            Time time = new Time();
            time.start();
            instancia.sort(enteros, c1);
            time.stop();
            System.out.println("El tiempo transcurrido es de " + time.elapsedTime() + " milisegundos");
            //instancia.sort(cadenas, c2);
            for (int i = 0; i < enteros.length; i++){
                System.out.println(enteros[i]);
            }
            /*for (int i = 0; i < cadenas.length; i++){
                System.out.println(cadenas[i]);
            }*/
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
