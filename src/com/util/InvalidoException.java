package com.util;

/**
 * Esta clase representa una excepcion personalizada
 * que extiende de la clase Exception.
 */
public class InvalidoException extends Exception {


    public InvalidoException(String mensaje) {
        super(mensaje);
    }
}
