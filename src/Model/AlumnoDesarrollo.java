package Model;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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

    public static void eliminarAlumno(){
        boolean validarAlumno = false;

        while(!validarAlumno){
            System.out.print("Por favor ingrese el carnet del estudiante a eliminar: ");
            String carnetAlumnoinput = input.nextLine();

            //No necesita iterar, el tipo HashMap permite borrar directamente por clave
            if (alumnosMap.containsKey(carnetAlumnoinput)){
                alumnosMap.remove(carnetAlumnoinput);
                System.out.println("\nAlumno eliminado de manera exitosa.\n");
                validarAlumno = true;
            }else {
                System.out.println("Alumno no encontrado. Pruebe de nuevo.");
            }
        }
    }

    //Método temporal para mostrar el arreglo y verificar funcionalidades
    public static void mostrarAlumnosTemporal(){
        System.out.println("\n");
        for (Map.Entry<String, Alumno> entry :  alumnosMap.entrySet()){
            String showCarnetAlumno = entry.getKey(); //Traer el carnet del alumno
            String showNombreAlumno = entry.getValue().getCarnet(); //Traer el nombre del alumno
            System.out.println("Carnet: "+ showCarnetAlumno + " | " + "Nombre: " + showNombreAlumno);
        }
        System.out.println("\n");
    }

    //Método para buscar alumno por medio de su numero de carnet
    public static void BuscarAlumno(){
     boolean validarAlumno = false;

        while(!validarAlumno){
            System.out.print("Ingrese el número de carnet del alumno que desea buscar: ");
            String carnetAlumnoinput = input.nextLine();

            //No necesita iterar, el tipo HashMap permite borrar directamente por clave
            if (alumnosMap.containsKey(carnetAlumnoinput)){
                String carnetBuscado = alumnosMap.get(carnetAlumnoinput).getCarnet();
                String nombreBuscado = alumnosMap.get(carnetAlumnoinput).getName();
                System.out.println("\nCarnet: "+ carnetBuscado + " | " + "Nombre: " + nombreBuscado + "\n");
                validarAlumno = true;
            }else {
                System.out.println("Alumno no encontrado. Pruebe de nuevo.");
            }
        }
    }
}
