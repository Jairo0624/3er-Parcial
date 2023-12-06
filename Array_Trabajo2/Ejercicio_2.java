package Array_Trabajo2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_2 {
    
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

System.out.print("Introduce una palabra: ");
        String palabra = leer.nextLine();

        char[] arrayInvertido = new char[palabra.length()];
        for (int i = palabra.length() - 1; i >= 0; i--) {
            arrayInvertido[i] = palabra.charAt(i);
        }

        if (Arrays.equals(palabra.toCharArray(), arrayInvertido)) {
            System.out.println(palabra + " es palíndroma.");
        } else {
            System.out.println(palabra + " no es palíndroma.");
        }

}
}
