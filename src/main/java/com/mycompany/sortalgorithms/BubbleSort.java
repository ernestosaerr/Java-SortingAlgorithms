package com.mycompany.sortalgorithms;

/**
 *
 * @author Ernesto Saer
 */

public class BubbleSort {
     
    static void sort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                     
                    // comienza el swap
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
        for (i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}