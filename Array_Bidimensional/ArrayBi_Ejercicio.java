package Array_Bidimensional;

import java.util.Scanner;

public class ArrayBi_Ejercicio {

    public static void main(String[] args) {
        String magenta = "\u001B[35m";
        String blanco = "\u001B[37m";

        Scanner leer = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa el número de filas y columnas para la matriz: ");
        int tamaño = leer.nextInt(); //Que tamaño de la matriz cuadrada tendra (nxn, 5x5)

        int[][] matriz = new int[tamaño][tamaño];

        System.out.println("Ingresa datos: ");
        for (int y = 0; y < tamaño; y++) { // Filas
            for (int x = 0; x < tamaño; x++) { // Columnas
                matriz[y][x] = leer.nextInt();
            }
        }

        System.out.println(magenta + "-----------------------------------------------" +
                "\n\t\t Menu: \n" +
                "\n1 Suma de una fila que se pedirá al usuario" +
                "\n2 Suma de una columna que se pedirá al usuario (controlar que elija una correcta)" +
                "\n3 Sumar la diagonal principal" +
                "\n4 Sumar la diagonal inversa" +
                "\n5 La media de todos los valores de la matriz" +
                "\n6 Salir" +
                "----------------------------------------------" + blanco);

        int respuesta = leer.nextInt();
        int suma = 0;
        switch (respuesta) {
            case 1:
                int f;
                do {
                    System.out.println("Indica la fila:");
                    f = leer.nextInt();
                } while (f < 1 || f > tamaño);

                for (int i = 0; i < tamaño; i++) {
                    suma = suma + matriz[f - 1][i];
                }
                System.out.println("\u001b[43 La suma de la fila " + f + " es " + suma);
                break;

            case 2:
                int c;
                do {
                    System.out.println("Indica la columna:");
                    c = leer.nextInt();
                } while (c < 1 || c > tamaño);

                for (int i = 0; i < tamaño; i++) {
                    suma = suma + matriz[i][c - 1];
                }
                System.out.println("\u001b[43 La suma de la columna " + c + " es " + suma);
                break;

            case 3:
                for (int i = 0; i < tamaño; i++) {
                    suma = suma + matriz[i][i];
                }
                System.out.println("\u001b[43 La suma de la diagonal principal es: " + suma);
                break;

            case 4:
                int inversa = 0;
                for (int i = tamaño - 1; i >= 0; i--) {
                    suma = suma + matriz[inversa][i];
                    inversa = inversa + 1;
                }
                System.out.println("\u001b[43 La suma de la diagonal inversa es: " + suma);
                break;

            case 5:
                for (int y = 0; y < tamaño; y++) {
                    for (int x = 0; x < tamaño; x++) {
                        suma = suma + matriz[y][x];
                    }
                }
                System.out.println("\u001b[43 El Promedio es: " + (double) suma / (tamaño * tamaño));
                break;

            default:
                break;
        }
    }
}
