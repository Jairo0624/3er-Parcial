package Array_Trabajo1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese el tamaño del array: ");
    int tamaño = leer.nextInt();

    int[] numeros = new int[tamaño];
    
    Random random = new Random();
    for (int i = 0; i < tamaño; i++) {
        numeros[i] = random.nextInt(300) + 1;
    }

    int digito;
        do {
            System.out.print("Ingrese el dígito final a buscar (0-9): ");
            digito = leer.nextInt();
        } while (digito < 0 || digito > 9);

        int[] numerosFiltrados = new int[tamaño];
        int contador = 0;

      
        for (int i = 0; i < tamaño; i++) {
            if (numeros[i] % 10 == digito) {
                numerosFiltrados[contador] = numeros[i];
                contador++;
            }
        }

       
        System.out.println("Números que terminan en " + digito + ":");
        for (int i = 0; i < contador; i++) {
            System.out.println(numerosFiltrados[i]);
        }







}
}