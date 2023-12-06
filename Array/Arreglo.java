package Array;
import java.util.Scanner;

public class Arreglo{

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] miArray = new int[10];
        //leer datos
        for (int i=0; i<miArray.length; i++){
            System.out.println("Ingrese un numero: ");
            miArray[i]= leer.nextInt();
        }

        //imprimir posicion y valor
        for (int i=0; i<miArray.length; i++){
            System.out.println("La posicion es " +i+ " y el valor es " + miArray[i]);
            
        }

        
        /*System.out.println("Ingrese 5 numeros entero: ");
        miArray[0]= leer.nextInt();
        //System.out.println("Ingrese un numero entero: ");
        miArray[1]= leer.nextInt();
        //System.out.println("Ingrese un numero entero: ");
        miArray[2]= leer.nextInt();
        //System.out.println("Ingrese un numero entero: ");
        miArray[3]= leer.nextInt();
        //System.out.println("Ingrese un numero entero: ");
        miArray[4]= leer.nextInt();
        

        System.out.println("La posicion es 0 y el primer numero es " + miArray[0]);
        System.out.println("La posicion es 1 y El segundo numero es " + miArray[1]);
        System.out.println("La posicion es 2 y El tercer numero es " + miArray[2]);
        System.out.println("La posicion es 3 y El cuarto numero es " + miArray[3]);
        System.out.println(" es 4 y El quinto numero es " + miArray[4]);
        */

    }



}