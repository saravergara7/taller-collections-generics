package Ejercicio6;

import java.util.*;

public class Main {
    public static <T extends Comparable<T>> T maximo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }

        T max = lista.get(0);

        for (T elemento : lista) {
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(3, 8, 2, 10, 5);
        System.out.println("Máximo: " + maximo(numeros));

        List<String> palabras = Arrays.asList("Ana", "Pedro", "Luis");
        System.out.println("Máximo: " + maximo(palabras));
    }
}

