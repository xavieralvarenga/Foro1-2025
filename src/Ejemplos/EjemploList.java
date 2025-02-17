import java.util.ArrayList;
import java.util.List;

public class EjemploList {
    public static void main(String[] args) {
        // para declarar la lista
        List<String> empleados = new ArrayList<>();

        // agregar elementos
        empleados.add("Juan Perez");
        empleados.add("Julissa Roque");
        empleados.add("Carlos Lopez");
        empleados.add("Sofia Rivera");
        empleados.add("Jose Cortez");
        empleados.add("Maria Martinez");
        empleados.add("Carlos Hernandez");

        // Mostrar lista
        System.out.println("Lista inicial: " + empleados);

        // Mostramos un elemento de la lista por indice
        String empleado = empleados.get(0);
        System.out.println("Elemento en no. 1: " + empleado);

        // Eliminar elemento por indice
        empleados.remove(0);
        System.out.println("Lista después de eliminar el primer elemento: " + empleados);

        // Eliminar elemento por valor
        empleados.remove("Carlos Hernandez");
        System.out.println("Lista después de eliminar 'Carlos Hernandez': " + empleados);

        // verificar si un elemento existe en la lista
        boolean existe = empleados.contains("Maria Martinez");
        System.out.println("¿La lista contiene a 'Maria Martinez'?: " + existe);
    }
}
