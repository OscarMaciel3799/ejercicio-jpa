<h1>📚 Práctica de JPA con Java, MySQL y EclipseLink</h1>
Este proyecto es una práctica básica que implementa JPA (Java Persistence API) para gestionar una base de datos MySQL utilizando EclipseLink como proveedor de persistencia. El objetivo principal es aprender a modelar relaciones entre entidades y realizar operaciones CRUD con ellas.

<h3>📝 Descripción del Proyecto</h3>
El proyecto modela un sistema académico sencillo que contiene las siguientes entidades y relaciones:
<ul>
<li>Alumno
    <ul>
      <li>Representa a los estudiantes.</li>
      <li>Tiene una relación OneToOne con Carrera.</li>
  </ul>
</li>
<li>Carrera
    <ul>
      <li>Representa las carreras disponibles.</li>
      <li>Tiene una relación OneToMany con Materias (una carrera puede tener varias materias).</li>
  </ul>
</li>
<li>Materia
    <ul>
      <li>Representa las materias que forman parte de una carrera.</li>
  </ul>
</li>
</ul>


<h3>🤝 Relación entre Entidades</h3>
<ul>
  <li>Alumno ↔ Carrera: Cada alumno está asociado a una sola carrera, y cada carrera puede tener un único alumno asignado en este modelo.</li>
  <li>Carrera ↔ Materias: Una carrera puede tener muchas materias, pero cada materia pertenece a una única carrera.</li>
</ul>

<h3>🛠️ Tecnologías utilizadas</h3>
Java: Lenguaje principal del proyecto.
JPA (Java Persistence API): Para manejar las operaciones de persistencia.
EclipseLink: Implementación de JPA.
MySQL: Base de datos relacional.
Maven: Herramienta para la gestión de dependencias y construcción del proyecto.

<h3>🛠️ Funcionalidades-Operaciones CRUD</h3>
<ul>
  <li>Alumno:
    <ul>
      <li>Crear, leer, actualizar y eliminar un alumno asociado a una carrera.</li>
    </ul>
  </li>
  <li>Carrera:
    <ul>
      <li>Crear, leer, actualizar y eliminar una carrera con sus materias.</li>
    </ul>
  </li>
  <li>Materia:
    <ul>
      <li>Crear, leer, actualizar y eliminar materias asociadas a una carrera.</li>
    </ul>
  </li>
</ul>

<h3>📝 Ejemplo de Uso</h3>

```bash
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
        Alumno alu2=control.traerAlumno(10);
        System.out.println("El alumno: "+alu2.getNombre()+" "+alu2.getApellido());
        System.out.println("Cursa las materias: ");
        for(Materia mate:listaMaterias){
            System.out.println(mate.getNombre());
        }
        System.out.println("De la carrera: "+alu2.getCarre().getNombre());
```
Salida por pantalla
```bash
      El alumno: Elon Musk
      Cursa las materias: 
      Algoritmo y estructura de datos
      Arquitectura de computadoras
      Sistemas Operativos
      De la carrera: Ingenieria en Sistemas
```



<h3>Contribuciones</h3>
¡Son bienvenidas! Si tienes ideas para mejorar este proyecto, no dudes en abrir un pull request o crear un issue.

<h3>Licencia</h3>
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.
