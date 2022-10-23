/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

/**
 *
 * @author Joel
 */
public class ListaActividades {//inicio
  private String nombre;
    private int id;

    public ListaActividades(String nombre, int id) {
        this.id = id;
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String mostrarDatos(){
        return "--> " + " Nombre de Tarea: " + "-- "+this.nombre + " --";
    }
  
} //fin
