package UI;

import java.util.InputMismatchException;
import java.util.Scanner;
import Model.Alumno;
import Model.AlumnoHashMap;

public class menu {
    static Scanner input = new Scanner(System.in); // Única instancia de Scanner

    public static void showMenuPrincipal() {
        boolean salir = false; // Variable para controlar la salida del menú

        while (!salir) {
            try {
                System.out.println("-- Bienvenido a la UDB Virtual - POO --");
                System.out.println("-- Por favor elige una de las siguientes opciones: --");
                System.out.println("1. Ingreso de alumno nuevo al sistema.");
                System.out.println("2. Búsqueda de alumno registrado en sistema.");
                System.out.println("3. Eliminar alumno ingresado en sistema.");
                System.out.println("4. Mostrar todos los alumnos ingresados al sistema.");
                System.out.println("5. Salir del sistema.");
                System.out.print("Respuesta: ");
                int opcion = input.nextInt();
                input.nextLine(); // Consumir el salto de línea pendiente

                switch (opcion) {
                    case 1:
                        // Lógica para agregar un alumno
                        System.out.print("Ingrese el nombre del alumno: ");
                        String nombre = input.nextLine(); // Primero preguntar por el nombre
                        System.out.print("Ingrese el carnet del alumno: ");
                        String carnet = input.nextLine(); // Luego preguntar por el carnet

                        // Verificar si el carnet ya existe
                        if (AlumnoHashMap.existeAlumno(carnet)) {
                            System.out.println("Error: Ya existe un alumno con ese carnet.\n");
                        } else {
                            // Crear un nuevo objeto Alumno y agregarlo al HashMap
                            Alumno nuevoAlumno = new Alumno(nombre, carnet);
                            AlumnoHashMap.agregarAlumno(nuevoAlumno);
                            System.out.println("Alumno agregado exitosamente.\n");
                        }
                    case 2:

                        break;
                    case 3:
                        System.out.print("Ingrese el carnet del alumno a eliminar: ");
                        String carnetEliminar = input.nextLine();
                        if (AlumnoHashMap.existeAlumno(carnetEliminar)) {
                            AlumnoHashMap.eliminarAlumno(carnetEliminar);
                            System.out.println("Alumno eliminado exitosamente.\n");
                        } else {
                            System.out.println("Alumno no encontrado.\n");
                        }
                        break;
                    case 4:

                        break;
                    case 5:
                        salir = true;
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida. Por favor ingresar un valor entero.\n");
                input.next(); // Limpiar el buffer del scanner
            }
        }
    }
}
