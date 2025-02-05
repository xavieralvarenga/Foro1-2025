package UI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in); // Objeto Scanner para recibir la entrada del usuario

    //Estructura de menu principal a través de un método estático
    public static void showMenuPrincipal() {
        boolean option = false; //Varible de salida del menu
        Scanner input = new Scanner(System.in); // Objeto Scanner para recibir la entrada del usuario

        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("-- Bienvenido a la UDB Virtual - POO --");
                System.out.println("-- Por favor elige una de las siguientes opciones: --");
                System.out.println("1. Ingreso de alumno nuevo al sistema.");
                System.out.println("2. Búsqueda de alumno registrado en sistema.");
                System.out.println("3. Eliminar alumnos ingresado en sistema.");
                System.out.println("4. Mostrar todos los alumnos ingresados al sistema.");
                System.out.println("5. Salir del sistema.");
                System.out.print("Respuesta: ");
                int inputUser = input.nextInt();
                entradaValida = true;
                switch (inputUser) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        option = true;
                        break;
                }
            } catch (InputMismatchException e) { //Excepción para manejar datos diferentes a los esperados
                System.out.println("\nEntrada inválida. Por favor ingresar un valor entero.\n");
                input.next();
            }
        }
    }
}