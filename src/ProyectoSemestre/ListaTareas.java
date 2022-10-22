/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

import java.io.Serializable;

/**
 *
 * @author Joel
 */
public class ListaTareas implements Serializable { // Inicio 
    private String NombreTareas;
    private int identificador;
    
    
    
    
    
    
    
    
    //Constructor

    public ListaTareas(String NombreTareas, int identificador) {
        this.NombreTareas = NombreTareas;
        this.identificador = identificador;
    }

        //consultor y modificador  del atributo nombre
    public String getNombreTareas() {
        return NombreTareas;
    }

    public void setNombreTareas(String NombreTareas) {
        this.NombreTareas = NombreTareas;
    }
    
    // consultor y modificador del atributo id
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
    
    public String mostraListTarea(){
        return "Actividades" + this.NombreTareas ;
        
    }
    
    
    
    
 }// fin


