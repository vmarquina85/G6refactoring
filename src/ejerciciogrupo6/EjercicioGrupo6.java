/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogrupo6;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Administrator
 */
public class EjercicioGrupo6 {
    public void saludarAlumno(String nombre,String apellido,String telefono,String direccion,int edad){
         String saludo= "Hola " + nombre +" "+ apellido +" tu telefono es:" + telefono +" tu direccion es:" + direccion + " tienes " +edad +" años";
        
        try
{
//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
File archivo=new File("texto.txt");

//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
FileWriter escribir=new FileWriter(archivo,true);

//Escribimos en el archivo con el metodo write 
escribir.write(saludo);

//Cerramos la conexion
escribir.close();
}

//Si existe un problema al escribir cae aqui
catch(Exception e)
{
System.out.println("Error al escribir");
}
       }
  
    public static void main(String[] args) {
        EjercicioGrupo6 ejercicio= new EjercicioGrupo6();
        
   ejercicio.saludarAlumno("Stefanny","Poma","955333011","calle los laureles",20);
    }
    
}
