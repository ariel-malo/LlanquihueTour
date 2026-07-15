package com.model;

/**
 * Representa a un proveedor de servicios de la empresa Llanquihue Tour.
 * La clase hereda de {@link Persona} e implementa la interfaz
 * {@link Registrable}, permitiendo registrar proveedores y mostrar
 * su información. Además, almacena la empresa a la que pertenece,
 * el servicio que ofrece y el {@link Tour} al que ha sido asignado.
 *
 * @author ariel ramirez
 */
public class Proveedor extends Persona implements Registrable {
    private String empresa;
    private String servicio;
    private Tour tour;

    public Proveedor(String nombre, Rut rut) {
        super(nombre, rut);
    }

    /**
     *
     * @param nombre representa el nombre del proveedor
     * @param rut representa el rut del proveedor
     * @param empresa representa a que empresa pertenece
     * @param servicio representa el servicio que prestara a la empresa
     * @param tour representa el tour asignado para prestar servicios.
     */
    public Proveedor(String nombre, Rut rut, String empresa, String servicio, Tour tour) {
        super(nombre, rut);
        this.empresa = empresa;
        this.servicio = servicio;
        this.tour = tour;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "empresa='" + empresa + '\'' +
                ", servicio='" + servicio + '\'' +
                ", tour=" + tour +
                '}';
    }

    @Override
    public String registrar() {
        return "\nProveedor registrado con exito";
    }
    //metodo abstracto del interface para mostrar los datos de la clase
    @Override
    public String mostrarDatos() {
        return "\nNombre del proveedor: " + getNombre() +
                ", Rut: " + getRut() +
                ", Empresa: " + empresa +
                ", Servicio que ofrece: " + servicio +
                ", Tour en el que trabajara: " + (tour != null ? tour.getNombre() : "sin asignar");
    }
}
