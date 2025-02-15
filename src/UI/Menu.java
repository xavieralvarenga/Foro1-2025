package UI;

import java.util.InputMismatchException;
import java.util.Scanner;
import Model.Alumno;
import Model.AlumnoDesarrollo;

public class Menu {
    static Scanner input = new Scanner(System.in); //

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
                int inputUser = input.nextInt();

                //Válidación para elegir un valor del 1 al 5
                if (inputUser >= 1 && inputUser <= 5){
                    switch (inputUser){
                        case 1:
                            AlumnoDesarrollo.agregarAlumno();
                            break;
                        case 2:
                            AlumnoDesarrollo.BuscarAlumno();
                            break;
                        case 3:
                            AlumnoDesarrollo.eliminarAlumno();
                            break;
                        case 4:
                            AlumnoDesarrollo.mostrarAlumnosTemporal();
                            break;
                        case 5:
                            salir = true;
                    }
                }else {
                    System.out.println("\nValor fuera de rango. Elegir valores entre 1 y 5.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida. Por favor ingresar un valor entero.\n");
                input.next(); // Limpiar el buffer del scanner
            }
        }
    }
}
