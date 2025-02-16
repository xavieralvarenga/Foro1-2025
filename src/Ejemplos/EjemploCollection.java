package Ejemplos;

import java.util.ArrayList;
import java.util.Collection;

public class EjemploCollection {
    public static void main(String[] args) {
        //¿Cómo se declaran?
        Collection<String> paises = new ArrayList<>();

        //¿Cómo se asignan valores?
        paises.add("El Salvador.");
        paises.add("Islandia.");
        paises.add("México.");

        //¿Cómo se eliminan valores?
        System.out.println("Colección antes de remover el registro: " + paises);
        boolean itemRemovido = paises.remove("El Salvador.");
        System.out.println("¿El item seleccionado fue removido?: " + itemRemovido);
        System.out.println("Colección después de remover el registro: " + paises);

        //Recorrer la collection
        System.out.println("\nValores de la colección - Países.");
        for (String pais : paises){
            System.out.println(pais);
        };
    }
}
