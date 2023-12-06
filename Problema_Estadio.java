import java.util.Scanner;

public class Problema_Estadio {
public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in);

     System.out.print("Ingrese los metros cuadrados del estadio: ");
     double MetrosEstadio = leer.nextDouble();

     System.out.print("Ingrese la capacidad de personas del tribunal ");
     int capacidadTribunas = leer.nextInt();

     System.out.print("Ingrese el porcentaje del espacio ocupado por el escenario (0-100): ");
     int PorcentajeEscenarioBanda = leer.nextInt();

     System.out.print("Ingrese el precio de las entradas VIP :  ");
     double PrecioBoletoVIP = leer.nextDouble();

     System.out.print("Ingrese el precio de las entradas normales :  ");
     double PrecioBoleto = leer.nextDouble();

     double MetrosDisponiblesEscenario = MetrosEstadio - (0.2 * MetrosEstadio) - (PorcentajeEscenarioBanda / 100 * MetrosEstadio);

     int capacidadTotal = (int) (MetrosDisponiblesEscenario * 4) + capacidadTribunas;

     int personasConEntradasVIP = (int) (0.3 * capacidadTotal);
     int PersonasConEntradasNormales = capacidadTotal - personasConEntradasVIP;
     double ingresosVIP =  personasConEntradasVIP * PrecioBoletoVIP;
     double ingresosNormales = PersonasConEntradasNormales * PrecioBoleto;
     double ingresosTotales = ingresosNormales + ingresosVIP;

     System.out.println("Capacidad total del estadio: " + capacidadTotal + " personas");
     System.out.println("Ingresos por entradas VIP: $" + ingresosVIP);
     System.out.println("Ingresos por entradas comunes: $" + ingresosNormales);
     System.out.println("Ingresos totales: $" + ingresosTotales);

     leer.close();
}
}