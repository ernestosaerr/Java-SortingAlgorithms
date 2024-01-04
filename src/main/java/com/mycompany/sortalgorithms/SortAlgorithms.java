/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sortalgorithms;
import java.util.Scanner;

/**
 *
 * @author Ernesto Saer
 */
public class SortAlgorithms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seleccion,cantidadNumeros;
        do{
            System.out.println("Ingrese la cantidad de numeros a ordenar");
            cantidadNumeros = scanner.nextInt();
            int[] numeros = new int[cantidadNumeros];
            for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            }
            System.out.println("Ingresa que numero que algoritmo de ordenamiento deseas");
            System.out.println("1->Bubble Sort\n2->Quick Sort\n3->Radix Sort");
            seleccion = scanner.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.println("********Bubble Sort********");
                    BubbleSort.sort(numeros,cantidadNumeros);
                    break;
                case 2:
                    System.out.println("********Quick Sort********");
                    QuickSort.sort(numeros,cantidadNumeros);
                    break;
                case 3:
                    System.out.println("********Radix Sort********");
                    RadixSort.sort(numeros,cantidadNumeros);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while(seleccion < 1 || seleccion > 3);
            scanner.close();
    }
}
