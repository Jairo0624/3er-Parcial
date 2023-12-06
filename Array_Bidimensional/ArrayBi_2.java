package Array_Bidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBi_2 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);

      System.out.print("Numero de tabla: ");
      int multi = leer.nextInt();

      int [][] tabla = new int [10][3] ;
      for (int i=0; i<10; i++){
          tabla[i][0] =  multi; 
          tabla[i][1] =  i+1; 
          tabla[i][2] =  multi*(i+1); 
      }
    
    System.out.println(Arrays.deepToString(tabla));
    leer.close();
}
}
