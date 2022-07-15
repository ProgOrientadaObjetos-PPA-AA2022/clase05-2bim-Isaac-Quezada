/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author Matias Quezada
 */
public class Tarjeta {
    
    public String nombrebanco ;
    public double CupoMaximo ;
   
    public Tarjeta(String nombreB ,Double cMaximo){
        nombreB = nombrebanco;
        cMaximo = CupoMaximo;
    }
    
    public void establecerNombreBanco(String n){
        nombrebanco = n;
    }
    
    public void establecerCuponesMaximos(double cm){
        CupoMaximo = cm;
    }
    
    public String obtenerNombreBanco(){
        return nombrebanco;
    }
    
    public double obtenerCuponesMaximos(){
        return CupoMaximo;
    }
    
}
