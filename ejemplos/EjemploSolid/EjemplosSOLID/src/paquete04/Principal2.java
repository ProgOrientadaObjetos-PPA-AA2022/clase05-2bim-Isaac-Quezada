/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias Quezada
 */
public class Principal2 {

    public static void main(String[] args) {
        //agregar por teclado N numeros de transporte (El ususario decide cuando termina)
        //BUs Taxi , Aereo , maritimo
        //luego de crear tipo transporte
        // presentar un reporte 

        //transporte Bus: $1.00
        //transporte Maritimo: $1000.01
        //transporte bus: $3.22
        //promedio de tarifa = ?
        
        Scanner leer = new Scanner(System.in);
        TiposTransporte tipos = new TiposTransporte();
        ArrayList<Transporte> lista = new ArrayList<>();
        int dato;
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("--------    Elija una Opcion   --------");
            System.out.println(" ");
            System.out.println("[1]" + "Bus");
            System.out.println("[2]" + "Taxi");
            System.out.println("[3]" + "Aereo");
            System.out.println("[4]" + "Maritimo");
            System.out.println("[5]" + "Fin del Programa");
            System.out.println(" ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n BUS");
                    TransporteBus bus = new TransporteBus();
                    bus.establecerCooperativaBus("24 Mayo");
                    bus.establecerTarifa();
                    lista.add(bus);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("\n TAXI ");
                    TransporteTaxi taxi = new TransporteTaxi();
                    taxi.establecerCooperativaTaxi("Yahuarcuna");
                    taxi.establecerTarifa();
                    lista.add(taxi);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("\nAereo");
                    TransporteAereo aereo = new TransporteAereo();
                    aereo.establecerTarifa();
                    lista.add(aereo);
                    System.out.println(" ");
                    break;    
                case 4:
                    System.out.println("\nMaritimo");
                    TransporteMaritimo maritimo = new TransporteMaritimo();
                    maritimo.establecerTarifa();                    
                    lista.add(maritimo);
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Gracias Por Usar Este Programa ");
                    tipos.establecerTransportes(lista);
                    tipos.establecerPromedioTarifas();
                    System.out.println(tipos);//toString
                    System.out.println("");
                    break;
                default:
                    System.out.println("Escoja la opcion correcta");
            }
        }
    }
}
