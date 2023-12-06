import java.util.Scanner;

public class Reloj {

    private static final int GRADO_POR_HORA = 30;
    private static final int GRADO_POR_MINUTO = 6;

    public static int calcularAngulo(int horas, int minutos) {
        int angulo = (int) (GRADO_POR_MINUTO * minutos - GRADO_POR_HORA * horas);

        // Actualizamos la posición de la manecilla de las horas
        horas += minutos / 60;

        // Calculamos el nuevo ángulo
        angulo = (int) (GRADO_POR_MINUTO * minutos - GRADO_POR_HORA * horas);

        if (angulo < 0) {
            angulo += 360;
        }

        return angulo;
    }

    public static int contarAngulos(int inicio, int fin) {
        int contador = 0;

        for (int horas = inicio; horas <= fin; horas++) {
            for (int minutos = 0; minutos <= 59; minutos++) {
                int angulo = calcularAngulo(horas, minutos);
                if (angulo == 90) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la hora: ");
        int horas = scanner.nextInt();

        System.out.println("Introduce los minutos: ");
        int minutos = scanner.nextInt();

        int angulo = calcularAngulo(horas, minutos);

        System.out.println("El ángulo entre las agujas del reloj es de " + angulo + " grados");

        System.out.println("El número de ángulos de 90 grados es de " + contarAngulos(12, 13));
    }
}
