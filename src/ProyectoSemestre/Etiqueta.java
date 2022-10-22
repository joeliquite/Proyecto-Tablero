/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

/**
 *
 * @author Joel
 */
public class Etiqueta {
    
    private String nombreEtiquetas;
    private  int  identificador;
    
    
   
    //constructor 
    public Etiqueta(String nombreEtiquetas, int identificador) {
        this.nombreEtiquetas = nombreEtiquetas;
        this.identificador = identificador;
    }
    
    
   // constructor y modificador del nombre de la etiqueta
    public String getNombreEtiquetas() {
        return nombreEtiquetas;
    }

    public void setNombreEtiquetas(String nombreEtiquetas) {
        this.nombreEtiquetas = nombreEtiquetas;
    }

    //constructor y modificador del nombre del ID
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
    public String mostrarEtiqueta(){
        return "Actividades" + this.nombreEtiquetas;
        
    }
    
    
    
    
}
