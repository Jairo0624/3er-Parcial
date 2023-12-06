package Array_Trabajo2;


import java.util.Scanner;


public class Ejercicio_1 {
   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Introduce un número: ");
        int numero = leer.nextInt();

        int numeroOriginal = numero;
        int numeroInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

          if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " es capicúa.");
        } else {
            System.out.println(numeroOriginal + " no es capicúa.");
        }

    }
    
}
        
    



