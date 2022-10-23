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
     
   // Atributos
    private String nombre;
    private int idTarea;

    public Tareas(String nombre, int idTarea) {
        this.nombre = nombre;
        this.idTarea = idTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String mostrarDatos(){
        return "--> " + " Nombre de Tarea: " + "-- "+this.nombre + " --";
    }   
      
   
}// fin 
