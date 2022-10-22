/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Tabelero  implements Serializable{
    
    /*Se utilizo el modificador private  los atributos nombre, id,  y fecha 
    sean utilizados dentro de su misma clase */
    
    //atributos, nombreTablero, identificador
    private String NombreTablero;
    private int Identificador;
    
    //le agrege fecha por criterio propio

    
    //constructor
    public Tabelero(String NombreTablero, int Identificador) {
        this.NombreTablero = NombreTablero;
        this.Identificador = Identificador;
       
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
    
    
    //metodo analizador
    public String toString(){
        return "nombre del tablero" + "  " + this.NombreTablero ;
     }
    
    

}
   
    
    
    
    

    

