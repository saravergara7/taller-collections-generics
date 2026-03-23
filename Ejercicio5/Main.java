package Ejercicio5;


import java.util.Stack;

public class Main {
    public static Stack<Integer> spliceStack(Stack<Integer> s, int i, int j) {
        Stack<Integer> extraidos = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        while (!s.isEmpty()) {
            auxiliar.push(s.pop());
        }

        int posicion = 0;

        while (!auxiliar.isEmpty()) {
            int valor = auxiliar.pop();

            if (posicion >= i && posicion < j) {
                extraidos.push(valor);
            } else {
                s.push(valor);
            }
            posicion++;
        }

        return extraidos;
    }

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        Stack<Integer> resultado = spliceStack(pila, 1, 4);

        System.out.println("Pila original después: " + pila);
        System.out.println("Pila extraída: " + resultado);
    }
}

