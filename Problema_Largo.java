import java.util.Scanner;

public class Problema_Largo {

    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
    
            
            System.out.print("Ingrese los metros cuadrados del estadio: ");
            double metrosCuadradosEstadio = scanner.nextDouble();
            
            System.out.print("Ingrese la capacidad de personas en las tribunas: ");
            int capacidadTribunas = scanner.nextInt();
            
            System.out.print("Ingrese el porcentaje del espacio ocupado por el escenario (0-100): ");
            double porcentajeEscenario = scanner.nextDouble();
            
            System.out.print("Ingrese el precio de las entradas VIP: ");
            double precioEntradaVIP = scanner.nextDouble();
            
            System.out.print("Ingrese el precio de las entradas comunes: ");
            double precioEntradaComun = scanner.nextDouble();
            
            
            double metrosCuadradosDisponiblesEscenario = metrosCuadradosEstadio - (0.2 * metrosCuadradosEstadio) - (porcentajeEscenario / 100 * metrosCuadradosEstadio);
    
            
            int capacidadTotal = (int) (metrosCuadradosDisponiblesEscenario * 4) + capacidadTribunas;
    
            
            int personasConEntradasVIP = (int) (0.3 * capacidadTotal);
            int personasConEntradasComunes = capacidadTotal - personasConEntradasVIP;
            double ingresosVIP = personasConEntradasVIP * precioEntradaVIP;
            double ingresosComunes = personasConEntradasComunes * precioEntradaComun;
            double ingresosTotales = ingresosVIP + ingresosComunes;
    
            
            System.out.println("Capacidad total del estadio: " + capacidadTotal + " personas");
            System.out.println("Ingresos por entradas VIP: $" + ingresosVIP);
            System.out.println("Ingresos por entradas comunes: $" + ingresosComunes);
            System.out.println("Ingresos totales: $" + ingresosTotales);
    
            scanner.close();
        }
        
    



}

