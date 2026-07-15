package com.data;

import com.model.Tour;

import java.util.ArrayList;

/**
 * Gestiona la colección de tours disponibles en el sistema.
 * Esta clase proporciona operaciones para visualizar los tours
 * cargados desde el archivo de datos y filtrar aquellos que
 * pertenecen a un tipo específico.
 *
 * @author ariel ramirez
 */
public class GestorTour {
    ArrayList<Tour> tours=new ArrayList<>();
//constructor de nuestra arraylist
    public GestorTour(ArrayList<Tour> tours) {

        this.tours = tours;
    }



//metodo para recorrer los tours con una validacion.
    public void mostrarTours(){
        System.out.println("-----Tours disponibles-----");
        if(tours.isEmpty()){
            System.out.println("no hay tours disponibles");
        }
        for(Tour t: tours){

            System.out.println(t);
        }
    }
    //metodo para filtrar por tipo de tour solicitado.
public void filtrar(String tipo){
        for(Tour t: tours){
            if(t.getTipoTour().equalsIgnoreCase(tipo)){
                System.out.println(t);
            }
        }
}


}
