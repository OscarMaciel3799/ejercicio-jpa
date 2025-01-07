package logica;

import java.util.ArrayList;
import persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    
    //para respetar la teoria de capas, cuando hagamos un CRUD, aunque le corresponda 
    //a persistencia, debemos solicitarselo a la logica, y la logica a la persistencia
    ControladoraPersistencia controlPersistencia= new ControladoraPersistencia();
    
    //Metodo para crear alumnos en la base de datos
    public void crearAlumno(Alumno alu){
        controlPersistencia.crearAlumno(alu);
    }

    //Metodo para eliminar un alumnos de la base de datos
    public void eliminarAlumno(int id){
        controlPersistencia.eliminarAlumno(id);
    }
    
    //Metodo para editar la informacion de alumnos en la base de datos
    public void editarAlumno(Alumno alu){
        controlPersistencia.editarAlumno(alu);
    }
    
    //Metodo para trear la informacion del alumno en la base de datos
    public Alumno traerAlumno(int id){
        return controlPersistencia.traerAlumno(id);
    }
    
    //Metodo para trear la informacion del TODOS los alumnos de la base de datos
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersistencia.traerListaAlumnos();
        
    }
}
