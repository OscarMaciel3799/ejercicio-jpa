
package com.mycompany.ejerciciojpa;

import java.util.ArrayList;
import java.util.Date;
import logica.Alumno;
import logica.ControladoraLogica;

public class EjercicioJpa {

    public static void main(String[] args) {
        
        ControladoraLogica control= new ControladoraLogica();
        
        
        //Simulamos la creacion de un alumno, que por lo general se hace desde
        //la interfaz grafica(del frontend)
        
        Alumno alu= new Alumno(12, "Esteban", "Quito", new Date());
        
        
        //llamamos al metodo para crear un alumno en la base de datos
        control.crearAlumno(alu);
        
        //para editar un valor primero SETeamos el nuevo valor
        alu.setApellido("Cito");
        //llamamos al metodo para editar un alumno en la base de datos
        control.editarAlumno(alu);
        
        
        
        //llamamos al metodo para eliminar un alumno de la base de datos
        control.eliminarAlumno(12);
    }
}
