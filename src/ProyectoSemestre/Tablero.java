/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Tablero  implements Serializable{ //inicio
   // Atributos de cada tablero
    private String nombre;
    private int id;
    
    // Constructor
    public Tablero(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    // M？todo consultor
    public String getNombre() {
        return nombre;
    }
    //M？todo modificador
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // M？todo consultor
    public int getId() {
        return id;
    }
    // M？todo modificador
    public void setId(int id) {
        this.id = id;
    } 
    
    @Override
     public String toString(){

        return "--> " + " Nombre de Tablero: " + "-- "+this.nombre + " --";
    } 
    

}//fin
   
    
    
    
    

    

