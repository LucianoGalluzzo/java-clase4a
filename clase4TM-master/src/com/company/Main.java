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
        Integer[] enteros = new Integer[100];
        for (int i = 0; i < enteros.length; i++){
            enteros[i] = ThreadLocalRandom.current().nextInt(1, 80);
            System.out.println(enteros[i]);
        }
        Comparator<Integer> comparadores = (a,b)->a - b;

        //QuickSortSorterImple quick = new QuickSortSorterImple();
        //quick.sort(enteros, comparadores);
        //System.out.println("------");
        //for (int i = 0; i < enteros.length; i++){
        //    System.out.println(enteros[i]);
        //}
//
        //HeapSortSorterImple heap = new HeapSortSorterImple();
        //heap.sort(enteros, comparadores);
        //System.out.println("------");
        //for (int i = 0; i < enteros.length; i++){
        //    System.out.println(enteros[i]);
        //}

        //BubbleSortSorterImple bubble = new BubbleSortSorterImple();
        //bubble.sort(enteros, comparadores);
        //System.out.println("------");
        //for (int i = 0; i < enteros.length; i++){
        //    System.out.println(enteros[i]);
        //}
        try {
            MyFactory factory = new MyFactory();
            Sorter instancia = (Sorter)factory.getInstance("sorter");
            instancia.sort(enteros, comparadores);
            for (int i = 0; i < enteros.length; i++){
                System.out.println(enteros[i]);
            }
        }catch (Exception e){

        }

    }
}
