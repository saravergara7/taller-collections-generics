package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Comparador<Integer> compNum = new ComparadorNumero();
        System.out.println(compNum.comparar(10, 5)); // positivo

        Comparador<String> compTexto = new ComparadorTexto();
        System.out.println(compTexto.comparar("Ana", "Pedro")); // negativo
    }
}

