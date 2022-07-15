/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov)
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        try {
            MenorEdad menor = new MenorEdad("Felipe");
            //System.out.printf("Nombre:%s - Tarjeta:%s\n",
            //        menor.obtenerNombre(), menor.obtenerTarjeta());
            
            System.out.println("Nombre: %s" , menor.obtenerNombre());
            System.out.println("");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
