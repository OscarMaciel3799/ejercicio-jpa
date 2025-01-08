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
    
    //Carrera
    
    //Metodo para crear alumnos en la base de datos
    public void crearCarrera(Carrera carre){
        controlPersistencia.crearCarrera(carre);
    }

    //Metodo para eliminar un alumnos de la base de datos
    public void eliminarCarrera(int id){
        controlPersistencia.eliminarCarrera(id);
    }
    
    //Metodo para editar la informacion de alumnos en la base de datos
    public void editarCarrera(Carrera carre){
        controlPersistencia.editarCarrera(carre);
    }
    
    //Metodo para trear la informacion del alumno en la base de datos
    public Carrera traerCarrera(int id){
        return controlPersistencia.traerCarrera(id);
    }
    
    //Metodo para trear la informacion del TODOS los alumnos de la base de datos
    public ArrayList<Carrera> traerListaCarrera(){
        return controlPersistencia.traerListaCarrera();
        
    }
    
    //Materias
    
    //Metodo para crear alumnos en la base de datos
    public void crearMateria(Materia mate){
        controlPersistencia.crearMateria(mate);
    }

    //Metodo para eliminar un alumnos de la base de datos
    public void eliminarMateria(int id){
        controlPersistencia.eliminarMateria(id);
    }
    
    //Metodo para editar la informacion de alumnos en la base de datos
    public void editarMateria(Materia mate){
        controlPersistencia.editarMateria(mate);
    }
    
    //Metodo para trear la informacion del alumno en la base de datos
    public Materia traerMateria(int id){
        return controlPersistencia.traerMateria(id);
    }
    
    //Metodo para trear la informacion del TODOS los alumnos de la base de datos
    public ArrayList<Materia> traerListaMateria(){
        return controlPersistencia.traerListaMateria();
        
    }
    
}
