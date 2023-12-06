package Array_Trabajo1;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Double[] notas = new Double[10];
        String[] alumnos = new String[10];
        String[] resultados = new String[10];

       
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = leer.nextDouble();
        }

       
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("La nota " + notas[i] + " no es válida.");
                return;
            }
        }

        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 9) {
                resultados[i] = "EXENTO";
            } else if (notas[i] >= 7) {
                resultados[i] = "APROBADO";
            } else if (notas[i] >= 5) {
                resultados[i] = "REPROBADO";
            } else {
                resultados[i] = "EXTRA DIRECTO";
            }
        }

        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno: " + alumnos[i] + ", nota: " + notas[i] + ", resultado: " + resultados[i]);
        }

}

}
