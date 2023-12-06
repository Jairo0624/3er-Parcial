package Projecto_Final ;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        //El usuario ingresa los datos que se le piden como impresión.
        Scanner leer = new Scanner(System.in);

            //Ciclo en el que hay opciones de operaciones, se puede usar hasta que el usuario
            //Seleccione la opcion de salir.
            while (true) {
            // Muestra las opciones al usuario
            System.out.println("¿Que quiere calcular? Seleccione una opcion: ");
            System.out.println("1. Maximo Común Divisor (MCD): ");
            System.out.println("2. Minimo Común Multiplo (mcm): ");
            System.out.println("3. Ecuación de 2° Grado con Formula General: ");
            System.out.println("4. Salir");
            int opcion =  leer.nextInt(); //Lee la opcion ingresada
        
                //Dependiendo el numero ingresado en las opciones, correra el "case" correspondiente
                switch (opcion) {
                    case 1:  // Solicitar dos números para calcular el MCD
                        System.out.println("Ingrese los 2 numeros");
                        int n1 = leer.nextInt();
                        int n2 = leer.nextInt();

                        //Objeto ejecutable del calculo de MCD
                        int mcd = calcularMCD(n1, n2); 

                        System.out.println("El mcm de " + n1 + " y " + n2 + " es " + mcd);
                        
                    break;
        
                    case 2: //Solicita 2 numeros para calcular el mcm
                        System.out.println("Ingrese los 2 numeros");
                        int n3 = leer.nextInt();
                        int n4 = leer.nextInt();

                        //Multiplica los 2 numeros y los divide entre el MCD ya calculado. 
                        int mcm = (n3 * n4) / calcularMCD(n3, n4);

                        
                         System.out.println("El MCM de " + n3 + " y " + n4 + " es " + mcm);
                        
                    break;

                    case 3: 
                    //Sustituye valores de la formula general con los coeficientes y calcula 2 valores de x
                    // Uno sumando y el otro restando
                    System.out.println("Ingrese los 3 terminos de su ecuacion (ax2 + bx +c)");
                    int a = leer.nextInt();
                    int b = leer.nextInt();
                    int c = leer.nextInt();
                    
                    if (Math.sqrt((b*b) - 4 * a * c) >= 0) {
                       double x1= (-b + Math.sqrt((b*b) - 4 * a * c)) / (2 * a);
                    double x2 = (-b - Math.sqrt((b*b) - 4 * a * c)) / (2 * a);
                    System.out.println("Los resulados son de x1 = "+ x1 + " y x2= "+ x2 );
                    }else{
                    System.out.println("La raiz de la operacion es imaginaria");
                }
                    
                    
                    break;
                    
                    // Sale del programa
                    case 4:
                        System.out.println("Terminando el Programa...");
                        System.exit(0);
                        break;
                   
                }
        
        
            } 
        }

        public static int calcularMCD (int a, int b){
            //Función para calcular el MCD
            while (b !=0){
                int residuo = a % b;
                a = b;
                b = residuo;
            
            }
            // Retorna el máximo común divisor
          return a;
        }
}
