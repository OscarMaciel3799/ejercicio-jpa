package logica;

import persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    ControladoraPersistencia controlPersistencia= new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersistencia.crearAlumno(alu);
    }

    
}
