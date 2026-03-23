package Ejercicio8;

import java.util.Stack;

public class Main {
    public static Pair<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s, int i) {
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

        while (!s.isEmpty()) {
            aux.push(s.pop());
        }

        int posicion = 0;

        while (!aux.isEmpty()) {
            int valor = aux.pop();

            if (posicion < i) {
                pila1.push(valor);
            } else {
                pila2.push(valor);
            }
            posicion++;
        }

        return new Pair<>(pila1, pila2);
    }

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        Pair<Stack<Integer>, Stack<Integer>> resultado = splitStack(pila, 2);

        System.out.println("Primera subpila: " + resultado.getPrimero());
        System.out.println("Segunda subpila: " + resultado.getSegundo());
    }
}

