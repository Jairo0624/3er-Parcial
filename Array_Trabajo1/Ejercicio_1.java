package Array_Trabajo1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
         

         char[] Alfabeto = new char[26];

         for (int i=0; i< 26; i++){
            Alfabeto[i] = (char) ('A' + i);
        }
         Scanner leer = new Scanner(System.in);
         String cadenaResultante = "";

         System.out.println("Introduce posiciones del array (0-25) para construir una cadena. Ingrese -1 para detener");
         

         while (true){

            int posicion = leer.nextInt();
            if (posicion == -1) {
                  break;
                        }


            if (posicion >= 0 && posicion < 26) {
                cadenaResultante += Alfabeto[posicion];
            } else {
                System.out.println("Posición inválida. Debe estar entre 0 y 25.");
            }
            
            System.out.println("Cadena resultante: " + cadenaResultante);


        }

         }





    }


