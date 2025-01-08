
package com.mycompany.ejerciciojpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import logica.Alumno;
import logica.Carrera;
import logica.ControladoraLogica;
import logica.Materia;

public class EjercicioJpa {

    public static void main(String[] args) {
        
        ControladoraLogica control= new ControladoraLogica();
        
        
        //Simulamos la creacion de una lista de Materias, una carrera y un alumno, 
        //que por lo general se hace desde la interfaz grafica(del frontend)
        
        //Creamos lista de materias para usarla mas adelante
        LinkedList<Materia> listaMaterias=new LinkedList<Materia>();
        
        //Creacion de Carrera con lista de materias
        Carrera carre=new Carrera(25, "Ingenieria en Sistemas",listaMaterias);
        
        //Guardamos la Carrera en la base de datos
        control.crearCarrera(carre);
        
        //Creamos las materias materia
        Materia mate1=new Materia(1, "Algoritmo y estructura de datos", "Anual",carre);
        Materia mate2=new Materia(2, "Arquitectura de computadoras", "Cuatrimestral",carre);
        Materia mate3=new Materia(3, "Sistemas Operativos", "Anual",carre);
        
        //Guardamos las materias en la base de datos
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Agregamos las materias a la lista
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        //Agregamos la lista de materias a la carrera
        carre.setListaMaterias(listaMaterias);
        
        //Actualizamos la carrera con la lista cargada en la base de datos
        control.editarCarrera(carre);        
        
        //Creamos un alumno
        Alumno alu= new Alumno(10, "Elon", "Musk", new Date(),carre);
        
        //llamamos al metodo para guardar al alumno con una carrera en la base de datos
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
        System.out.println("Cursa las materias: ");
        for(Materia mate:listaMaterias){
            System.out.println(mate.getNombre());
        }
        System.out.println("De la carrera: "+alu2.getCarre().getNombre());
    }
}
