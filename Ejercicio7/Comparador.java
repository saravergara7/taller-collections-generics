package Ejercicio7;

public interface Comparador<T> {
    int comparar(T a, T b);
}

class ComparadorNumero implements Comparador<Integer> {
    @Override
    public int comparar(Integer a, Integer b) {
        return a.compareTo(b);
    }
}

class ComparadorTexto implements Comparador<String> {
    @Override
    public int comparar(String a, String b) {
        return a.compareTo(b);
    }
}

