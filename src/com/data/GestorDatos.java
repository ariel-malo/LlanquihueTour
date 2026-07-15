package com.data;

import com.model.Cliente;
import com.model.Empleado;
import com.model.Proveedor;
import com.model.Registrable;

import java.util.ArrayList;

/**
 * Gestiona las entidades registrables del sistema.
 * Esta clase administra una colección de objetos que implementan la
 * interfaz {@link Registrable}, permitiendo agregarlos y mostrar la
 * información de cada uno de ellos.
 *
 * @author ariel ramirez
 */
public class GestorDatos {
    private ArrayList<Registrable> entidades;

    public GestorDatos() {
        entidades = new ArrayList<>();
    }
//metodo para agregar un usuario
    public void agregarUsuario(Registrable usuario) {

        entidades.add(usuario);
    }

    public ArrayList<Registrable> getEntidades() {

        return entidades;
    }
//metodo para mostrar los datos con un instanceof para llamar el metodo mostrarDatos y registrar.
    public String mostrar() {
        if (entidades.isEmpty()) {
            return "no hay datos por mostrar";
        }
        String datos = "";
        for (Registrable u : entidades) {
            if (u instanceof Cliente cliente) {
                datos += cliente.registrar();
                datos += cliente.mostrarDatos();
            } else if (u instanceof Empleado empleado) {
                datos += empleado.registrar();
                datos += empleado.mostrarDatos();
            } else if (u instanceof Proveedor proveedor) {
                datos += proveedor.registrar();
                datos += proveedor.mostrarDatos();
            }
        }
        return datos;
    }
}
