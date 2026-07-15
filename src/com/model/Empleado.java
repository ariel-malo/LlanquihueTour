package com.model;

/**
 * Representa a un empleado de la empresa Llanquihue Tour.
 * La clase hereda de {@link Persona} e implementa la interfaz
 * {@link Registrable}, permitiendo registrar empleados y mostrar
 * su información. Además, almacena el cargo del empleado, su
 * identificador dentro de la empresa y el {@link Tour} que tiene
 * asignado.
 *
 * @author ariel ramirez
 */
public class Empleado extends Persona implements Registrable {
    private String cargo;
    private int id;
    private Tour tour;

    public Empleado(String nombre, Rut rut) {
        super(nombre, rut);
    }

    /**
     *
     * @param nombre representa el nombre del empleado
     * @param rut representa el rut del empleado
     * @param cargo representa su cargo en la empresa de LlanquihueTour
     * @param id representa el numero identificador del empleado en la empresa.
     * @param tour representa el tour asignado al empleado
     */

    public Empleado(String nombre, Rut rut, String cargo, int id, Tour tour) {
        super(nombre, rut);
        this.cargo = cargo;
        this.id = id;
        this.tour = tour;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo='" + cargo + '\'' +
                ", id=" + id +
                ", tour=" + tour +
                '}';
    }

    @Override
    public String registrar() {
        return "\nEmpleado registrado correctamente.";
    }
    //metodo abstracto del interface para mostrar los datos de la clase
    @Override
    public String mostrarDatos() {
        return "\nNombre del empleado: " + getNombre() +
                ", Rut: " + getRut() +
                ", Cargo: " + cargo +
                ", Numero de identificacion: " + id +
                ", Tour a cargo: " + (tour != null ? tour.getNombre() : "sin asignar");
    }
}
