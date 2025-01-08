
package com.mycompany.ejerciciojpa;

import java.util.ArrayList;
import java.util.Date;
import logica.Alumno;
import logica.Carrera;
import logica.ControladoraLogica;

public class EjercicioJpa {

    public static void main(String[] args) {
        
        ControladoraLogica control= new ControladoraLogica();
        
        
        //Simulamos la creacion de una carrera y un alumno, que por lo general 
        //se hace desde la interfaz grafica(del frontend)
        
        //Creacion de Carrera
        Carrera carre=new Carrera(25, "Ingenieria en Sistemas");
        
        //Guardamos la Carrera en la base de datos
        control.crearCarrera(carre);
        
        
        //Creamos un alumno
        Alumno alu= new Alumno(10, "Elon", "Musk", new Date(),carre);
        
        //llamamos al metodo para crear un alumno con una carrera en la base de datos
        control.crearAlumno(alu);
        
        /*
        //para editar un valor primero SETeamos el nuevo valor
        alu.setApellido("Cito");
        //llamamos al metodo para editar un alumno en la base de datos
        control.editarAlumno(alu);
        
        //Si tenemos que buscar un alumno para ver su info podemos usar el metodo
        Alumno alu2=control.traerAlumno(12);
        System.out.println("EL alumno es: "+alu2.toString());
        
        //llamamos al metodo para eliminar un alumno de la base de datos
        control.eliminarAlumno(12);
        

        //Si no conocemos el id del alumno que queremos editar podemos trar a todos
        ArrayList<Alumno> listaAlumnos=control.traerListaAlumnos();
        for(Alumno al:listaAlumnos){
            System.out.println("El alumno es: "+al.toString());
        }
        */
        Alumno alu2=control.traerAlumno(10);
        System.out.println("El alumno: "+alu2.getNombre()+" "+alu2.getApellido());
        System.out.println("Cursa la carrera: "+alu2.getCarre().getNombre());
    }
}
