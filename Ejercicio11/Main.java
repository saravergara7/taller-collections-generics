package Ejercicio11;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static <T> Queue<T> mergeQueues(Queue<T> cola1, Queue<T> cola2) {
        Queue<T> resultado = new LinkedList<>();

        while (!cola1.isEmpty() || !cola2.isEmpty()) {
            if (!cola1.isEmpty()) {
                resultado.offer(cola1.poll());
            }
            if (!cola2.isEmpty()) {
                resultado.offer(cola2.poll());
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();

        cola1.offer(1);
        cola1.offer(3);
        cola1.offer(5);

        cola2.offer(2);
        cola2.offer(4);
        cola2.offer(6);

        Queue<Integer> resultado = mergeQueues(cola1, cola2);
        System.out.println(resultado);
    }
}

