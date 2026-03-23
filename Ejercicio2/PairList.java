package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class PairList<K,V> {
    private List<Par<K, V>> lista;

    public PairList() {
        lista = new ArrayList<>();
    }

    public void agregar(K clave, V valor) {
        lista.add(new Par<>(clave, valor));
    }

    public void eliminar(K clave) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getClave().equals(clave)) {
                lista.remove(i);
                break;
            }
        }
    }

    public Par<K, V> obtener(K clave) {
        for (Par<K, V> par : lista) {
            if (par.getClave().equals(clave)) {
                return par;
            }
        }
        return null;
    }

    public void mostrar() {
        for (Par<K, V> par : lista) {
            System.out.println(par);
        }
    }
}


