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
  private String nombreActividades;
  private int identificador;
  private int porcentajeAvance;
  
  
  //constructor

    public ListaActividades(String nombreActividades, int identificador, int porcentajeAvance) {
        this.nombreActividades = nombreActividades;
        this.identificador = identificador;
        this.porcentajeAvance = porcentajeAvance;
    }

    
    //consultor y modificador del nombre de las actividades
    public String getNombreActividades() {
        return nombreActividades;
    }

    public void setNombreActividades(String nombreActividades) {
        this.nombreActividades = nombreActividades;
    }
    
    
    //consultor y modificador del identificador
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getPorcentajeAvance() {
        return porcentajeAvance;
    }

    public void setPorcentajeAvance(int porcentajeAvance) {
        this.porcentajeAvance = porcentajeAvance;
    }
   
  
} //fin
