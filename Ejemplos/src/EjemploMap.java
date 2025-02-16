import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
        // 1. Crear un Map (usamos HashMap)
        Map<String, Integer> edades = new HashMap<>();

        // 2. Agregar datos al Map (clave: nombre, valor: edad)
        edades.put("Juan", 25);
        edades.put("Ana", 30);
        edades.put("Luis", 28);

        // 3. Obtener un valor usando una clave
        System.out.println("La edad de Juan es: " + edades.get("Juan"));

        // 4. Verificar si una clave existe
        if (edades.containsKey("Ana")) {
            System.out.println("Ana está en el mapa.");
        }

        // 5. Recorrer el Map (mostrar todas las claves y valores)
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println("Nombre: " + entrada.getKey() + ", Edad: " + entrada.getValue());
        }

        // 6. Eliminar un elemento del Map
        edades.remove("Luis");
        System.out.println("Mapa después de eliminar a Luis: " + edades);
    }
}