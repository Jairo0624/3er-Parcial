
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la secuencia del codigo genetico modificado: ");
        String secuenciaModificada = leer.next().toUpperCase();

        char[] letrasEncontradas = new char[secuenciaModificada.length()] ;

        int contador = 0;
        int tripletasCompletas = 0;
        int letrasCompletas = 0;
        int letrasFaltantes = 0;
        

        for (int i = 0; i < secuenciaModificada.length(); i++) {
            letrasEncontradas[i] = secuenciaModificada.charAt(i);
            if (letrasEncontradas[i] == 'A' || letrasEncontradas [i] == 'C' || letrasEncontradas [i] == 'G' || letrasEncontradas [i] == 'T'){
               contador++;

            }
            tripletasCompletas = contador/3;
            letrasCompletas = contador % 3;

            if (contador % 3 <= 0){
                letrasFaltantes = 0;
            } else{ 
            letrasFaltantes = 3-letrasCompletas;


        }

        
    }
        System.out.println("Tripletes formadas correctamente: " + tripletasCompletas);
        
        System.out.println("Cantidad de letras faltantes para un código genético válido: " + letrasFaltantes);

    }
}

