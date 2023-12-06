package Array;

import java.util.Scanner;

public class Arreglo_3 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);


        String[] Nombres = new String[3];
        int[] calificacion = new int[Nombres.length];
        double[] decimal = new double[Nombres.length];
        String[] numeroletras = {"cero","uno", "dos", "tres", "cuatro", 
        "cinco", "seis", "siete", "ocho", "nueve", "diez"};

        for (int i=0; i<Nombres.length; i++){
            System.out.println("Ingrese el nombre del alumno: ");
            Nombres[i]= leer.next();
            System.out.println("Ingrese la calificacion (decimal): ");
            
            decimal[i]=leer.nextDouble();
            calificacion[i]= (int) Math.round(decimal[i]);
        }

        for (int i=0; i<Nombres.length; i++){
            System.out.println("El alumno " + Nombres[i]+ " tiene de calificacion: "
             + decimal[i]+ " letra: " + numeroletras[calificacion[i]] );
        }





    }
    
}
