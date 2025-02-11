package Model;

import java.util.HashMap;

public class AlumnoHashMap {
    // HashMap para almacenar los alumnos
    private static final HashMap<String, Alumno> alumnosMap = new HashMap<>();

    // Metodo para agregar un alumno
    public static void agregarAlumno(Alumno alumno) {
        alumnosMap.put(alumno.getCarnet(), alumno);
    }

    // Metodo para eliminar un alumno usando su carnet
    public static void eliminarAlumno(String carnet) {
        alumnosMap.remove(carnet);
    }

    // Metodo  obtener un alumno usando su carnet
    public static Alumno obtenerAlumno(String carnet) {
        return alumnosMap.get(carnet);
    }

    // Metodo verificar si un alumno existe usando su carnet
    public static boolean existeAlumno(String carnet) {
        return alumnosMap.containsKey(carnet);
    }

    // Metodo imprimir todos los alumnos en el HashMap
    public static void imprimirAlumnos() {
        for (HashMap.Entry<String, Alumno> entry : alumnosMap.entrySet()) {
            Alumno alumno = entry.getValue();
            System.out.println("Carnet: " + alumno.getCarnet() + ", Nombre: " + alumno.getName());
        }
    }
}
