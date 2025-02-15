package Model;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlumnoDesarrollo {
    static Scanner input = new Scanner(System.in);
    private static HashMap<String, Alumno> alumnosMap = new HashMap<>();

    //Método agregar alumnos a el arreglo HashMap
    public static void agregarAlumno() {

        boolean validarAlumno = false;
        while (!validarAlumno){
            System.out.print("Por favor ingrese el carnet del estudiante: ");
            String carnetAlumnoinput = input.nextLine();

            if (alumnosMap.containsKey(carnetAlumnoinput)) { //Se verifica que el alumno no exista para hacer el registro
                System.out.println("\nEl registro del alumno ya existe en la base de datos.\n");
            } else {
                System.out.print("Por favor ingrese nombre/apellido del estudiante: ");
                String nombreAlumnoinput = input.nextLine();
                alumnosMap.put(carnetAlumnoinput, new Alumno(carnetAlumnoinput, nombreAlumnoinput)); //Se instancia un objeto Alumno en cada ingreso
                System.out.println("\nAlumno ingresado correctamente.\n");
                validarAlumno = true;
            }
        }
    }

    //Método temporal para mostrar el arreglo y verificar funcionalidades
    public static void mostrarAlumnosTemporal(){
        for (Map.Entry<String, Alumno> entry :  alumnosMap.entrySet()){
            String showCarnetAlumno = entry.getKey(); //Traer el carnet del alumno
            String showNombreAlumno = entry.getValue().getCarnet(); //Traer el nombre del alumno
            System.out.println("\nCarnet: "+ showCarnetAlumno + " | " + "Nombre: " + showNombreAlumno + "\n");
        }
    }
    //Método para buscar alumno por medio de su numero de carnet
    Public static void BuscarAlumno(){
     System.out.print("Ingrese el número de carnet del alumno que desea buscar: ");
        String buscarAlumno = input.nextLine();
        
        if (alumnosMap.containsKey(buscarAlumno)) {

Alumno alumno = alumnosMap.get(buscarAlumno);          
System.out.println("El alumno con numero de carnet " + alumno.getCarnet + " está registrado como: " + alumno.getNombre()+"\n");
        } else {
System.out.print("Alumno no encontrado, no se puede Mostrar.");
       }
    }
}
