package com.model;

import com.util.InvalidoException;

/**
 * Representa el RUT de una persona dentro del sistema de Llanquihue Tour.
 * Esta clase forma parte de una relación de composición con la clase
 * {@link Persona}, ya que cada persona posee un único RUT que la identifica.
 * Durante la creación del objeto se valida el formato del RUT y, si este no
 * cumple con el patrón esperado, se lanza una excepción personalizada.
 *
 * @author ariel ramirez
 */


public class Rut {
    private String numero;

    //constructor con la validacion personalizada.
    public Rut(String numero) throws InvalidoException {
        if (!numero.matches("[0-9]+-[0-9Kk]")) {
            throw new InvalidoException("Formato de RUT no válido: " + numero);
        }
        this.numero = numero;
    }

    public Rut() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}
