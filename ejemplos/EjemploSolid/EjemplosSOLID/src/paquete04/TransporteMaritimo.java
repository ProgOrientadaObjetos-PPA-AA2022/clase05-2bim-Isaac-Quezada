/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author Matias Quezada
 */
public class TransporteMaritimo extends Transporte {
    
    private String cooperativaMaritima;

    public void establecerCooperativaAerea(String n) {
        cooperativaMaritima = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 5.00 + 1000;
    }

    public String obtenerCooperativaBus() {
        return cooperativaMaritima;
    }
}
