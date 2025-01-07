
package com.mycompany.ejerciciojpa;

import java.util.Date;
import logica.Alumno;
import logica.ControladoraLogica;

public class EjercicioJpa {

    public static void main(String[] args) {
        
        ControladoraLogica control= new ControladoraLogica();
        
        
        //Simulamos la creacion de un alumno, que por lo general se hace desde
        //la interfaz grafica(del frontend)
        /*       
        Alumno alu= new Alumno(12, "Esteban", "Quito", new Date());

        */

        //llamamos al metodo para crear un alumno
        control.eliminarAlumno(12);
    }
}
