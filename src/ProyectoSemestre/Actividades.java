/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

/**
 *
 * @author Joel
 */
public class Actividades {
    private String nombre ;
    private int identificador;
    private String estado;
    
    
    //constructor

    public Actividades(String nombre, int identificador, String estado) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.estado = estado;
    }

        //consultor  y modificador del nombre de las actividades
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //consultor del id
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    // consultor y modificador del estado de las actividades
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String mostrarActividades(){
        return "Actividades" + this.nombre ;
        
    }
    
    
    
    
}
