/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

/**
 *
 * @author Joel
 */
public class Tareas {
    
    private String nombre;
    private int idTareas;
    private String descriTareas;
    private  String fechaVecimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTareas() {
        return idTareas;
    }

    public void setIdTareas(int idTareas) {
        this.idTareas = idTareas;
    }

    public String getDescriTareas() {
        return descriTareas;
    }

    public void setDescriTareas(String descriTareas) {
        this.descriTareas = descriTareas;
    }

    public String getFechaVecimiento() {
        return fechaVecimiento;
    }

    public void setFechaVecimiento(String fechaVecimiento) {
        this.fechaVecimiento = fechaVecimiento;
    }
    
    
    
    
    // clase para las etiquetas
    public class Comentarios{
        private String nombreComentario;
        private int idComentario;
        private String estado;

        public String getNombreComentario() {
            return nombreComentario;
        }

        public void setNombreComentario(String nombreComentario) {
            this.nombreComentario = nombreComentario;
        }

        public int getIdComentario() {
            return idComentario;
        }

        public void setIdComentario(int idComentario) {
            this.idComentario = idComentario;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
        
        
        
        
    }
    
    
}
