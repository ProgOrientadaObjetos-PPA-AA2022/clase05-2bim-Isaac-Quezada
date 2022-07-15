/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;

    // promedioEdadesCualitativo
    //promedio jovenes : mayor igual a 0 menor igual a 21
    //promedio adulto : mayor a 21
    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double promedioEdades(ArrayList<Persona> lista) {
        double promedio = 0;
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = lista.get(i).obtenerEdad();
        }
        promedio = suma / lista.size();
        return promedio;
    }

    public void establecerpromedioEdadesCualitativo() {
        if (promedioEdades >= 0 && promedioEdades <= 21) {
            promedioEdadesCualitativo = "Promedio Jovenes";
        } else {
            if (promedioEdades > 21) {
                promedioEdadesCualitativo = "Promedio Adulto";
            }
        }

    }

    public String obtenerpromedioEdadesCualitativo() {
        return promedioEdadesCualitativo;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    @Override
    public String toString() {

        String listado = String.format("");
        for (int i = 0; i < estudiantes.size(); i++) {
            listado = String.format("%s" + "Nombre: %s\n",
                    listado, estudiantes.get(i).obtenerNombre());
        }
        listado = String.format("%s\n"
                + "Promedio: %.2f"
                + "Promedio Edades Cualitativo: %s\n",
                listado, obtenerPromedioEdades(),
                obtenerpromedioEdadesCualitativo());
        return listado;

    }
}
    /*@Override
    public String toString() {
        String cadena = String.format("Lista estudiantes\n");
        for (int i = 0; i < estudiantes.size(); i++) {
            cadena = String.format("%sNombre: %s\n",
                    cadena,
                    estudiantes.get(i).obtenerNombre());
        }
        cadena = String.format("%s\nPromedio Edades:%.2f\n"
                + "Promedio Cualitativo: %s\n",
                cadena, promedioEdades, promedioEdadesCualitativo);
        return cadena;
    }*/

