package Array_Bidimensional;

import java.util.Arrays;

public class ArrayBi_1 {
    public static void main(String[] args) {
      int [][] tabla = new int [10][3] ;
      for (int i=0; i<10; i++){
          tabla[i][0] =  3; 
          tabla[i][1] =  i+1; 
          tabla[i][2] =  3*(i+1); 
      }
    
    System.out.println(Arrays.deepToString(tabla));
    
}


}
