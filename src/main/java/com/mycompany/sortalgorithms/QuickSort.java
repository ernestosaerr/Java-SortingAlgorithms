
package com.mycompany.sortalgorithms;

/**
 *
 * @author Ernesto Saer
 */
public class QuickSort {
    public static void sort(int[] arr, int n) {
        if (arr == null || n <= 1) {
            return; // Si el array es null o o no tiene mas de un elemento ya esta ordenado
        }
        quickSort(arr, 0, n - 1);
        printArray(arr);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Ordenar recursivamente los elementos 
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Elegir el último elemento como pivote
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Colocar el pivote en su posición correcta
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void printArray(int[] arr) {
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " \n");
        }
        System.out.println();
    }
}
