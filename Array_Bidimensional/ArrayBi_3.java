package Array_Bidimensional;

import java.util.Arrays;
import java.util.Scanner;

/*Usando: Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos piden hacer un menú con estas opciones:

 

Rellenar TODA la matriz de números, debes pedírselo al usuario.S
Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
Sumar la diagonal principal (ver ejemplo)
Sumar la diagonal inversa (ver ejemplo)
x = columna y = fila
La media de todos los valores de la matriz*/

public class ArrayBi_3 {
    
    public static void main(String[] args) {
        String magenta = "\u001B[35m";
        String blanco = "\u001B[37m";

       int [][] matriz = new int [4][4];
       Scanner leer = new Scanner(System.in);
       int numero; 

       System.out.println("Ingresa datos: ");
       for(int y=0; y<4; y++){ //Filas
            for(int x=0; x<4; x++){//Columnas
            
            matriz[y][x]= leer.nextInt();
            }


       }
       
       //System.out.println(Arrays.deepToString(matriz));  
       System.out.println(//"/u001B[31m"
      magenta+"-----------------------------------------------"+
       "\n\t\t Menu: \n"+ 
       "\n1 Suma de una fila que se pedirá al usuario"+
       "\n2 Suma de una columna que se pedirá al usuario (controlar que elija una correcta)"+
       "\n3 Sumar la diagonal principal"+
       "\n4 Sumar la diagonal inversa"+
       "\n5 La media de todos los valores de la matriz"+
       "\n6 Salir"+
       "----------------------------------------------"+blanco);

       int respuesta = leer.nextInt();
       int suma = 0;
       switch (respuesta) {
        case 1:
           int f;
           
           do{
              System.out.println("Indica la fila:");
              f = leer.nextInt();
           }while (f<1 ||f>4);
           for(int i=0; i<4;i++){
              suma = suma + matriz[f-1][i];
             
           }
           System.out.println("\u001b[43 La suma de la fila " +f+ " es " + suma);
            
            break;
        case 2:
        int c;
           
           do{
              System.out.println("Indica la columna:");
              c = leer.nextInt();
           }while (c<1 ||c>4);
           for(int i=0; i<4;i++){
              suma = suma + matriz[i] [c-1];
             
           }
           System.out.println("\u001b[43 La suma de la fila " +c+ " es " + suma);

            break;
            case 3: 
            for (int i =0; i < 4; i++){
                suma = suma + matriz [i][i];
            }
            System.out.println("\u001b[43La suma de la diagonal P es: " + suma);

            break;
            
            case 4:
            int inversa = 0;
             for (int i = 3; i > -1; i--){
                suma = suma + matriz[inversa][i];
                inversa = inversa + 1;
            }
            System.out.println("\u001b[43La suma de la diagonal Inversa es: " + suma);
            break;

           case 5:
           for (int y = 0; y < 4 ; y++){
            for (int x = 0; x < 4; x++){
            suma = suma + matriz [y][x];
              }
           }
           System.out.println("\u001bEl Promedio es: " + suma/16);
            break;
            default:
            break;

           } 
       }


    }
    

