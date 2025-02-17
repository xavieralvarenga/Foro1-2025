
import java.util.ArrayList;
import java.util.List;

public class EjemploList {
    public static void main(String[] args) {
        // Se declara el list
        List<String> nombres = new ArrayList<>();

        // Como agregamos elementos a la lista
        nombres.add("Juan Perez");
        nombres.add("Maria Martinez");
        nombres.add("Carlos Hernandez");

        // Mostramos la lista creada
        System.out.println("Lista inicial: " + nombres);

        // Mostramos un elemento de la lista por indice
        String nombre = nombres.get(0);
        System.out.println("Elemento en indice 1: " + nombre);

        // Como se eliminan los elementos de la lista
        nombres.remove(0);
        System.out.println("Lista después de eliminar el primer elemento: " + nombres);

        // Eliminar un elemento por valor
        nombres.remove("Carlos Hernandez");
        System.out.println("Lista después de eliminar 'Carlos Hernandez': " + nombres);

        // Procedemos a verificar si un elemento existe en la lista
        boolean existe = nombres.contains("Maria Martinez");
        System.out.println("¿La lista contiene a 'Maria Martinez'?: " + existe);
    }
}
