package com.company;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter<Object>{
    @Override
    public void sort(Object[] arr, Comparator c) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(c.compare(arr[j],arr[j+1]) > 0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
