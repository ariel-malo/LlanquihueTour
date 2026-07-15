package com.app;

import com.data.GestorDatos;
import com.data.GestorTour;
import com.model.Cliente;
import com.model.Empleado;
import com.model.Proveedor;
import com.model.Rut;
import com.model.Tour;
import com.util.InvalidoException;
import com.util.LectorDatos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String ruta = "datos.txt";

        //cargar los tours desde el archivo de datos
        LectorDatos lector = new LectorDatos();
        ArrayList<Tour> tours = lector.cargar(ruta);
        //crear el gestor de lo tours, para mostrar o filtrar los tours disponibles.
        GestorTour service=new GestorTour(tours);
        //service.mostrarTours();
        //service.filtrar("cultural");




        //crear el gestor de entidades registrables
        GestorDatos gestor = new GestorDatos();

        // crear algunas entidades de ejemplo y registrarlas,
        // validando el RUT mediante la excepcion personalizada InvalidoException
        try {
            Cliente cliente = new Cliente("Mariana Perez", new Rut("12345678-9"), "Av. Siempre Viva 123", 987654321, 4, tours.get(0));
            gestor.agregarUsuario(cliente);

            Empleado empleado = new Empleado("Juan Soto", new Rut("9876543-2"), "Guia turistico", 101, tours.get(1));
            gestor.agregarUsuario(empleado);

            Proveedor proveedor = new Proveedor("Transportes Andes Ltda.", new Rut("11222333-4"), "Transportes Andes", "Transporte de pasajeros", tours.get(2));
            gestor.agregarUsuario(proveedor);

        } catch (InvalidoException e) {
            System.out.println("Error al crear una entidad: " + e.getMessage());
        }

        // mostrar todas las entidades registradas usando la lista polimorfica
        System.out.println("\n=== Entidades registradas ===");
        System.out.println(gestor.mostrar());


    }

}
