/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author Matias Quezada
 */
public class TransporteAereo {
    
    private double tarifa;
 
    public void establecerTarifa(){
        tarifa = 1150 + 50;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
}
