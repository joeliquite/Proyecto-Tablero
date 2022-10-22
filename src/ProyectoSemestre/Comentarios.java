/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

/**
 *
 * @author Joel
 */
public class Comentarios {
    
   private String nombreComent;
   private int identificador;
   private String estado;
   
   
   // constructor

    public Comentarios(String nombreComent, int identificador, String estado) {
        this.nombreComent = nombreComent;
        this.identificador = identificador;
        this.estado = estado;
    }

    
    // Consultor y modificador  de Los nombres
    public String getNombreComent() {
        return nombreComent;
    }

    public void setNombreComent(String nombreComent) {
        this.nombreComent = nombreComent;
    }

     // consultor y modificador de los ID
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    // Consultor y modificador  de los estados
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    
   
    public String mostrarComent(){
        return "Actividades" + this.nombreComent ;
        
    }
}
