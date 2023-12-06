package Array_Trabajo2;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    
    System.out.print("Ingresa el tamaño del arreglo (cantidad de numeros a poner): ");
    int tamano = leer.nextInt();

    int[] arreglo = new int[tamano];

    System.out.println("Ingresa los elementos del arreglo:");
    for (int i = 0; i < tamano; i++) {
        arreglo[i] = leer.nextInt();
    }

    System.out.println("Arreglo original:");
    imprimirArreglo(arreglo);

    ordenarBurbuja(arreglo);

    System.out.println("Arreglo ordenado:");
    imprimirArreglo(arreglo);
}

public static void imprimirArreglo(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i] + " ");
    }
    System.out.println();
}

public static void ordenarBurbuja(int[] arreglo) {
    int n = arreglo.length;
    boolean intercambio;

    do {
        intercambio = false;
        for (int i = 1; i < n; i++) {
            if (arreglo[i - 1] > arreglo[i]) {
                // Intercambio de elementos
                int temp = arreglo[i - 1];
                arreglo[i - 1] = arreglo[i];
                arreglo[i] = temp;
                intercambio = true;
            }
        }
    } while (intercambio);
    
}
}
