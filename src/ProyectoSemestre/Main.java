/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSemestre;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joel Iquite
 */
public class Main {
    public static void main(String[] args) {//Fin
        
        int opcion = 0 ,i= 1;
        String error = "Eror en la seleccion";
        String nombre = "";
        
        //entrada por teclado
       Scanner teclado = new Scanner(System.in);
       
       //crear Archivos
       File archivoTablero = new File("C:\\Users\\Joel\\Documents\\proyecto\\Organizador-de-Tareas\\Tableros\\archivotxt");
       
       
       //crear la referencia objeto de tipo tablero
       
       // se crean las instacias del tablero
       
       Tabelero tab;
       
       
       // lugar donde se almacenaran las intancias del tipo tablero
       Vector tableros  = new Vector();
       
       do{
          
           System.out.println("1) Crear Tablero");
           System.out.println("2) ver  Tablero");
           System.out.println("3)  Salir");
           System.out.println("Seleccione una Opcion ");
           opcion = teclado.nextInt();
           
           
           switch(opcion){ //inicio menu
               case 1:
                   System.out.println("Ingrese el nombre del tablero a crear");
                   System.out.println(" ");
                   System.out.println(" ");
                   nombre= teclado.next();
                   try{
                      
                      tab = new  Tabelero(nombre, i); 
                      i++;
                       //instaciar nuestro objeto tablero
                     
                       
                       //cada vez que  se crea una isntacia la a;ada al vector
                       tableros.add(tab);
                       
                       // Escribir en nuestro archivo
                       FileOutputStream flujo = new FileOutputStream(archivoTablero);
                       ObjectOutputStream write = new ObjectOutputStream(flujo);
                       
                       
                       //escribir nuestro vector en nuestro archivo.txt
                       
                       write.writeObject(tableros); // Esto es el vecto que contiene elementos de tipo vecto
                   }catch(FileNotFoundException e){
                       e.printStackTrace();
                   }catch(IOException e){
                       e.printStackTrace();
                   }
                   
                   break;
                   //caso 2
               case 2:
                   try{
                       
                       // cambia de bytecode a texto 
                       FileInputStream flujo2 = new FileInputStream(archivoTablero);
                       ObjectInputStream read = new ObjectInputStream(flujo2);
                       
                       //lee al objeto traducido
                       tableros =(Vector)read.readObject();  //casting
                   }catch(FileNotFoundException e){
                       e.printStackTrace();
                   }catch(IOException e){
                       
                   }catch(ClassNotFoundException e){
                       e.printStackTrace();
                   }
                   
                   //leer objeto e imprimir lo que tenga ese objeto en texto plano
                   Iterator it = tableros.iterator();
                   // el while se va a detener hasta que ya no hay objetos, se va a detener cuando haya un false, espacio vacio
                   while(it.hasNext()){
                       tab = (Tabelero)it.next(); // se desea leer objetos de tipo tablero
                       
                       // metodo analizador para que muestre en pantalla solo lo que necesitao
                       System.out.println(tab.toString());
                       
                   }
                   
                   break;
                   
                   
                   
               case 3:
                   System.out.println("Saludos :");
                   opcion = 2;
                   System.exit(0);
                   break;
               default:
                   System.out.println(error);
                   
                   
               
           }// fin menu
       }while(opcion != 2);
        
       
       
       
       
       
    }// fin
    
}
