/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

/**
 *
 * @author Joel
 */
public class ListaActividades {
  private String nombreActividades;
  private int idList;
  private int porcentajeAvance;
  private String fechaVencimiento;

    public String getNombreActividades() {
        return nombreActividades;
    }

    public void setNombreActividades(String nombreActividades) {
        this.nombreActividades = nombreActividades;
    }

    public int getIdList() {
        return idList;
    }

    public void setIdList(int idList) {
        this.idList = idList;
    }

    public int getPorcentajeAvance() {
        return porcentajeAvance;
    }

    public void setPorcentajeAvance(int porcentajeAvance) {
        this.porcentajeAvance = porcentajeAvance;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
  
  
  
  
 
  //clase actividades
  public class actividades{
      private String nombre;
      private int  idActividades;
      private String estado;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getIdActividades() {
            return idActividades;
        }

        public void setIdActividades(int idActividades) {
            this.idActividades = idActividades;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
      
      
      
  }
  
}
