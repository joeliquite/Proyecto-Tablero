/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joel Iquite
 */
public class Main {
    public static void main(String[] args) {//Fin
        
        //Practica de escriruta de archivos
      File fileArchivo1 = new File("C:\\Users\\Joel\\Documents\\POO\\fichero\\archivo1.txt");
        File fileArchivo2 = new File("C:\\Users\\Joel\\Documents\\POO\\fichero\\archivo2.txt");
        File fileArchivo3 = new File("C:\\Users\\Joel\\Documents\\POO\\fichero\\archivo3.txt");
        try
        {
            FileWriter fileArchivo = new FileWriter(fileArchivo1);
            FileWriter Archivo2 = new FileWriter(fileArchivo2);
            FileWriter Archivo3 = new FileWriter(fileArchivo3);
           
           //ARCHIVO 1
            fileArchivo.write("Esto es el primer archivo");
            
            
            //archivo 2
            
            Archivo2.write("Esto es el segundo archivo");
            
            
            //archivo
            Archivo3.write("Esto es el tercero archivo");
            fileArchivo.close();
            Archivo2.close();
            Archivo3.close();
            
        } catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
    }// fin
    
}
