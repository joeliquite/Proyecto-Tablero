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
        
        
        String error = "Eror en la seleccion";
        String nombre = "";
        String opcionTableros  = "";
        int contador = 1;
        int identificador = 1;
        int valorIdentificador = 0;
        int opcion = 0 ,i= 1;
        int opcionLista = 0;
        String opcionEliminarTablero = "";
        
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
          
           System.out.println("1) ver  Tablero");
           System.out.println("2) Crear Tablero");
           System.out.println("3)  Salir");
           System.out.println("Seleccione una Opcion ");
           opcion = teclado.nextInt();
           
           // menu de las opciones que se le muestra al ausurio
           switch(opcion){
               case 1:
                   if (!archivoTablero.isFile()){
                       System.out.println("No Existe tablero Disponibles");
                       System.out.println("Crea un tablero disponible");
                       
                   }else{//inicio else
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
                     for (int j = 0; j < tableros.size(); j++) {//inicio for
                     // el casting para extraer los objetos de tipo tablero
                       
                      tab = (Tabelero)tableros.elementAt(j);
                         System.out.println(contador  + ") " + tab.toString());
                         contador++;
                       }//fin for
                       contador =1;
                       
                       System.out.println("Seleccione si desea ingresar a los tableros existentes");
                       System.out.println("ingrese la palabra con  con minuscula");
                       System.out.println(" si\nno");
                       opcionTableros =teclado.next();
                       
                       if(opcionTableros.equals("si") ){// incio if
                           
                         System.out.println("Ingrese el ID de  opcion del tablero  que desee ingresar");
                         valorIdentificador = teclado.nextInt();
                           if(valorIdentificador < tableros.size()){
                               valorIdentificador --;
                               do{ /// incio do
                                   System.out.println("Ingrese una opcion");
                                   System.out.println("1) ver lista de tareas");
                                   System.out.println("2) Crear lista de tareas");
                                   System.out.println("3) Cambiar nombre del tablero");
                                   System.out.println("4) Borrar tablero");
                                   System.out.println("5) Regresar el menu principal");
                                   opcionLista = teclado.nextInt();
                                   //*******************************************
                                   switch(opcionLista){ // Menu de lista de opciones
                                       case 1:
                                           break;
                                       case 2:
                                           break;
                                       case 3:
                                           break;
                                       case 4:
                                           System.out.println("Desea eliminar el tablero!\n Desea continuar");
                                           System.out.println("si\nno");
                                           opcionEliminarTablero = teclado.next();
                                           if (opcionEliminarTablero.equals("si")){
                                               // eliminar el objeto  del tablero seleccionada
                                               tableros.remove(valorIdentificador);
                                               System.out.println("Se ha eliminado el tablero exitosamente");
                                               System.out.println("Se ha actulizado su tablero");
                                               // reinscribir los tableros
                                               try{
                                                   
                                                FileOutputStream input = new FileOutputStream(archivoTablero);
                                                ObjectOutputStream write = new ObjectOutputStream(input);
                                                write.writeObject(tableros);
                                                
                                               }catch(FileNotFoundException e){
                                                    e.printStackTrace();
                                                }catch (IOException e ){
                                                    e.printStackTrace();
                                                }
                                               
                                               
                                               for (int j = 0; j < tableros.size(); j++) {//inicio for
                                                 // el casting para extraer los objetos de tipo tablero
                       
                                                  tab = (Tabelero)tableros.elementAt(j);
                                                  System.out.println(contador  + ") " + tab.toString());
                                                  contador++;
                                                   }//fin for
                                                  contador =1;
                                                  
                                                  opcionLista = 5;
                                           
                                               
                                           }else{
                                               opcionLista = 5;
                                           }
                                           break;
                                       case 5:
                                           System.out.println("regresando al menu principal");
                                           opcionLista = 5;
                                           System.out.println(" ");
                                           break;
                                       default:
                                       System.out.println(error);   
                                           
                                   }// fin del menu de las opciones
                                   
                                   //**********************
                               } while (opcionLista != 5); // fin while
                                  
                           }else{
                               System.out.println("****La opcion ingresada no existe****");
                           }
                   
                           
                       }else{
                           System.out.println("Volver a iniciar las opciones");
                 
                       } // fin del else
                       
                   }//fin else, de la condicion si existe
                   break;
                   //caso 2
               case 2:
                   System.out.println("Ingrese el nombre del tablero a crear");
                   System.out.println(" ");
                   System.out.println(" ");
                   nombre= teclado.next();
                   try{
                       
                       //evalua la posicion de los objetos y a su posicion le aumenta uno para que no entre con la misma posicion 
                       if (identificador != tableros.size()){
                       identificador = tableros.size() + 1;
                           
                       }
                      tab = new  Tabelero(nombre, identificador ); 
                      identificador++;
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
