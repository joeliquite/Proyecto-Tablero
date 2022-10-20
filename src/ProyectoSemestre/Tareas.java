/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

/**
 *
 * @author Joel
 */
public class Tareas { //Inicio de clase
      private String NombreTareas;
      private int identificador;
      private String descripcion;
      
      
      //constructor

    public Tareas(String NombreTareas, int identificador, String descripcion) {
        this.NombreTareas = NombreTareas;
        this.identificador = identificador;
        this.descripcion = descripcion;
    }

    
    // consultor y modificador Nombre
    public String getNombreTareas() {
        return NombreTareas;
    }

    public void setNombreTareas(String NombreTareas) {
        this.NombreTareas = NombreTareas;
    }
     
    
    //Consultor y modificar de ID
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    
    // consultor y modificador de descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
      
    
    
    
    
      
   
}// fin 
