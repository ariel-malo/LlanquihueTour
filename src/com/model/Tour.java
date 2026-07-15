package com.model;

/**
 * Representa un tour ofrecido por la empresa Llanquihue Tour.
 * La clase almacena la información principal de un tour, como su
 * nombre, lugar de realización, tipo y precio por persona. Los
 * objetos de esta clase pueden ser asociados a clientes, empleados
 * y proveedores para gestionar las reservas y la asignación de
 * recursos dentro del sistema.
 *
 * @author ariel ramirez
 */
public class Tour {
    private String nombre;
    private String lugar;
    private String tipoTour;
    private double precio;

    /**
     * @param nombre representa el nombre del tour
     * @param lugar representa donde se celebra el tour
     * @param tipoTour representa de que tipo es el tour
     * @param precio representa el precio por persona del tour
     */
    public Tour(String nombre, String lugar, String tipoTour, double precio) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.tipoTour = tipoTour;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipoTour() {
        return tipoTour;
    }

    public void setTipoTour(String tipoTour) {
        this.tipoTour = tipoTour;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", lugar='" + lugar + '\'' +
                ", tipoTour='" + tipoTour + '\'' +
                ", precio=" + precio +
                '}';
    }
}
