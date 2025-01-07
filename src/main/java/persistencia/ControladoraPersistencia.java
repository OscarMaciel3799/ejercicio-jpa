
package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Alumno;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    AlumnoJpaController aluJpa=new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
        

    }

    
}
