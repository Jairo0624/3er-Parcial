import java.util.Scanner;


public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor de m: ");
        int m = leer.nextInt();
        System.out.print("Ingrese el valor de n: ");
        int n = leer.nextInt();
        
        int contadorNumerosReflejados = 0;

        char[] mapeo = {
            '0', '1', '5', 'Ɛ', 'µ', '2', '∂', 'Γ', '8', 'p',
            'q', '6', '9', 'ʞ', '7', 'z', 'ʇ', 'ʎ', 'l', 'd'
        };

        for (int num = m; num <= n; num++) {
            String numStr = String.valueOf(num);
            String reflejoStr = "";

           
            for (char c : numStr.toCharArray()) {
                if (c >= '0' && c <= '9') {
                    reflejoStr = mapeo[c - '0'] + reflejoStr;
                } else {
                    reflejoStr = c + reflejoStr;
                }
            }

           
            if (numStr.equals(reflejoStr)) {
                System.out.print(num + " ");
                contadorNumerosReflejados++;
            }
        }

        System.out.println("Cantidad de números reflejados en el espejo en el intervalo: " + contadorNumerosReflejados);
        leer.close();
    }
   

    
}


