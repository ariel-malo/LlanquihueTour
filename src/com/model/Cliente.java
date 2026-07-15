package com.model;

/**
 * Representa a un cliente de la empresa Llanquihue Tour.
 * La clase hereda de {@link Persona} e implementa la interfaz
 * {@link Registrable}, permitiendo registrar clientes y mostrar
 * su información. Además, almacena los datos necesarios para
 * gestionar una reserva de un {@link Tour}.
 *
 * @author ariel ramirez
 */
public class Cliente extends Persona implements Registrable {
    private String direccion;
    private int telefono;
    private int personas;
    private Tour tour;


    public Cliente(String nombre, Rut rut) {
        super(nombre, rut);

    }

    /**
     *
     * @param nombre representa el nombre del cliente
     * @param rut representa el id del cliente
     * @param direccion representa donde vive el cliente
     * @param telefono representa el contacto del cliente
     * @param personas representa el numero de personas que van al tour
     * @param tour representa el tour agendado por el cliente
     */
    public Cliente(String nombre, Rut rut, String direccion, int telefono, int personas, Tour tour) {
        super(nombre, rut);
        this.direccion = direccion;
        this.telefono = telefono;
        this.personas = personas;
        this.tour = tour;

    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public String registrar() {
        return "\n Cliente registrado correctamente";
    }
//metodo abstracto del interface para mostrar los datos de la clase
    @Override
    public String mostrarDatos() {
        return "\nNombre del cliente: " + getNombre() +
                ", Rut: " + getRut() +
                ", Direccion: " + direccion +
                ", Telefono: " + telefono +
                ", Personas: " + personas +
                ", Tour reservado: " + (tour != null ? tour.getNombre() : "sin asignar");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", personas=" + personas +
                ", tour=" + tour +
                '}';
    }
}
