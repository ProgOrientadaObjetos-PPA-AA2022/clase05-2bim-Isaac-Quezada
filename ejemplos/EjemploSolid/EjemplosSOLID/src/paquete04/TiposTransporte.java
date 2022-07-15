/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class TiposTransporte {

    private double promedioTarifas;
    private ArrayList<Transporte> transportes; // puedo tener muchos tipos de Transporte

    public void establecerTransportes(ArrayList<Transporte> t) {
        transportes = t;
    }

    public ArrayList<Transporte> obtenerTransportes() {
        return transportes;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (int i = 0; i < obtenerTransportes().size(); i++) {
            suma = suma + obtenerTransportes().get(i).obtenerTarifa();
        }
        promedioTarifas = suma / obtenerTransportes().size();

    }

    public double obtenerPromedioTarifas() {
        return promedioTarifas;
    }

    @Override
    public String toString() {

        String listado = String.format("Tipos:"
                + "Transporte Bus: %.2f\n"
                + "Transporte Maritimo: %.2f\n"
                + "Transporte Aereo: %.2f\n"
                + "Transporte Taxi: %.2f\n"
                + "Promedio De Tarifas: %.2f\n",
                obtenerPromedioTarifas(),
                obtenerPromedioTarifas(),
                obtenerPromedioTarifas(),
                obtenerPromedioTarifas(),
                promedioTarifas);
        return listado;

    }

}
