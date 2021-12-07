package com.company.Sorting;

import java.util.Arrays;

/*
    Find minimum element from the pile and place it in correct place
 */
public class SelectionSort {

    public void Selection_Sort(int[] arr) {

        for(int i=0; i<arr.length; i++) {

            int element1 = i;

            for(int j=i+1; j<arr.length; j++) {

                if(arr[j] < arr[element1]) {
                    element1 = j;
                }

                if(i != element1)
                    swap(arr, i, element1);
            }
        }

    }

    public void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {

        int[] arr = {4, 5, 3, 2, 1};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.Selection_Sort(arr);

        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}
