package com.model;

/**
 * Representa a una persona dentro del sistema de Llanquihue Tour.
 * Es la clase base de la jerarquía de personas del proyecto y contiene
 * la información común que comparten todas sus subclases, como el
 * nombre y el {@link Rut}. De esta clase heredan entidades como
 * {@link Cliente}, {@link Empleado} y {@link Proveedor}.
 *
 * @author ariel ramirez
 *
 */

public class Persona {
    private String nombre;
    private Rut rut;

    /**
     * @param nombre representa el nombre del individuo ya sea cliente, empleado o proveedor.
     * @param rut representa el numero de identificacion de cada individuo.
     */
    public Persona(String nombre, Rut rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public Rut getRut() {

        return rut;
    }

    public void setRut(Rut rut) {

        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut=" + rut +
                '}';
    }
}
