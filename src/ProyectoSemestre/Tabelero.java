/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Tabelero {
    
    /*Se utilizo el modificador private  los atributos nombre, id,  y fecha 
    sean utilizados dentro de su misma clase */
    
    //atributos, nombreTablero, identificador
    private String NombreTablero;
    private int Identificador;
    private int fecha;
    //le agrege fecha por criterio propio

    
    //constructor
    public Tabelero(String NombreTablero, int Identificador, int fecha) {
        this.NombreTablero = NombreTablero;
        this.Identificador = Identificador;
        this.fecha = fecha;
    }

    
    
    //  consultor 
    public String getNombreTablero() {
        return NombreTablero;
    }
    // metodo modificador
    public void setNombreTablero(String NombreTablero) {
        this.NombreTablero = NombreTablero;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
    
    //clase para las etiquetas
    public class Etiquetas{
        private String nombreEtiquetas;
        private int idEtiquetas;

        public String getNombreEtiquetas() {
            return nombreEtiquetas;
        }

        public void setNombreEtiquetas(String nombreEtiquetas) {
            this.nombreEtiquetas = nombreEtiquetas;
        }

        public int getIdEtiquetas() {
            return idEtiquetas;
        }

        public void setIdEtiquetas(int idEtiquetas) {
            this.idEtiquetas = idEtiquetas;
        }
        
        
        
    }

    

   
    
 
}
