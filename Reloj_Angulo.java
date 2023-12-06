import java.util.Scanner;

public class Reloj_Angulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.println("Ingrese la hora final: ");
        int horaFinal = sc.nextInt();

        System.out.println("Ingrese los minutos iniciales: ");
        int minutosInicial = sc.nextInt();

        System.out.println("Ingrese los minutos finales: ");
        int minutosFinal = sc.nextInt();

        int angulosRectos = (horaFinal - horaInicial) * 4 + (minutosFinal - minutosInicial) / 15;

        int horaimpri = (horaFinal - horaInicial) - 2;
        int minimpri = (minutosFinal - minutosInicial);

        System.out.println("\nEn ese rango de horas y minutos se forman " + angulosRectos + " ángulos rectos.");
        System.out.println("La hora actual: " + horaimpri + " horas con " + minimpri + " minutos");

        System.out.println("\nLas horas en ese rango son:");

        for (int i = horaInicial; i <= horaFinal; i++) {
            for (int j = 0; j < 60; j += 15) {
                System.out.println(i + " horas con " + j + " minutos");
            }
        }

        sc.close();
    }
}
