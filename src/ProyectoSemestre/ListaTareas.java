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
   //Atributos
    private String nombreLista;
    private int idList;
    // Constructor
    public ListaTareas( String nombreLista, int idList) {
        this.idList = idList;
        this.nombreLista = nombreLista;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public int getIdList() {
        return idList;
    }

    public void setIdList(int idList) {
        this.idList = idList;
    }

    public String mostrarListas(){
        return " Nombre de Lista: " + "-- "+this.nombreLista + " --";

    }
    
 }// fin


