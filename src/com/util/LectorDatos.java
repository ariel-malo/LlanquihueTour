package com.util;

import com.model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Permite cargar la información de los tours desde un archivo de texto.
 * La clase lee un archivo con los datos de los tours, convierte cada
 * línea válida en un objeto {@link Tour} y devuelve una colección con
 * todos los tours cargados. Las líneas con formato incorrecto o con
 * precios no válidos son omitidas durante la lectura.
 *
 * @author ariel ramirez
 */
public class LectorDatos {
//metodo cargar el archivo txt y transformarlo en objetos
    public ArrayList<Tour> cargar(String ruta) {
        ArrayList<Tour> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.isBlank()) {
                    continue;
                }
                String[] datos = linea.split(";");
                if (datos.length == 4) {
                    try {
                        String nombre = datos[0].trim();
                        String lugar = datos[1].trim();
                        String tipo = datos[2].trim();
                        double precio = Double.parseDouble(datos[3].trim());
                        Tour tour = new Tour(nombre, lugar, tipo, precio);
                        lista.add(tour);
                    } catch (NumberFormatException e) {
                        System.out.println("linea con precio invalido, se omite: " + linea);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("error al leer el archivo: " + ruta);
        }
        return lista;
    }
}
