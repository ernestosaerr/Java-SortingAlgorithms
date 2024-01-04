/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortalgorithms;

/**
 *
 * @author Ernesto Saer
 */
public class RadixSort {
    public static void sort(int[] arr, int n) {
        if (arr == null || n <= 1) {
            return; // Si el arreglo es nulo o tiene menos de 2 elementos, ya está ordenado
        }

        int max = getMax(arr, n); // Encuentra el número máximo en el arreglo

        //Ordenamiento comenzando por el dígito menos significativo LSD(least significant digit) a MSD(most significant digit) 
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, n, exp);
        }
        printArray(arr); // Imprime el arreglo ordenado
    }

    private static int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void countingSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10]; // El radix sort es un método de base 10

        // Inicializa el arreglo de conteo
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        // Llena el arreglo de conteo con la cantidad de cada dígito en la posición actual
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Modifica el arreglo de conteo para que contenga las posiciones reales de los dígitos
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construye el arreglo de salida ordenado
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copia el arreglo ordenado de salida de vuelta al arreglo original
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    private static void printArray(int[] arr) {
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " \n");
        }
        System.out.println();
    }
}
