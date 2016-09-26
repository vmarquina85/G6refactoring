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
public class EjercicioGrupo6   {

    
    public void saludarAlumno(){
            alumno estudiante = new alumno("victor","Marquina","955333011",31,"calle los laureles");
         String saludo= "Hola " + estudiante.getNombre() +" "+ estudiante.getApellido() +" tu telefono es:" + estudiante.getTelefono() +" tu direccion es:" + estudiante.getDireccion() + " tienes " +estudiante.getEdad() +" años";
        
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
        
   ejercicio.saludarAlumno();
    }
    
}
