package logica;

import persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    ControladoraPersistencia controlPersistencia= new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersistencia.crearAlumno(alu);
    }

    public void eliminarAlumno(int id){
        controlPersistencia.eliminarAlumno(id);
    }
}
