package com.company;

import java.util.Comparator;

public class HeapSortSorterImple implements Sorter<Object>{

    @Override
    public void sort(Object[] arr, Comparator c) {
        int N = arr.length;
        for(int node = N/2; node>=0; node--){
            createHeap(arr, node, N-1, c);
        }
        for(int node = N-1; node>=0; node--) {
            Object tmp = arr[0];
            arr[0]    = arr[node];
            arr[node] = tmp;
            createHeap(arr, 0, node-1, c);
        }
    }

    public static void createHeap(Object[] arr, int node, int fin, Comparator c) {
        int left = 2*node+1;
        int right = left+1;
        int may;
        if(left>fin)
            return;
        if(right>fin)
            may=left;
        else
            may= c.compare(arr[left], arr[right]) > 0 ? left : right;

        if(c.compare(arr[node], arr[may]) < 0) {
            Object tmp = arr[node];
            arr[node] = arr[may];
            arr[may]  = tmp;
            createHeap(arr, may, fin, c);
        }
    }

}
