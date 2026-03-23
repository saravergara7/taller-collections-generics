package Ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaTareas<T> {
    private List<Tarea<T>> tareas;

    public ListaTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea<T> tarea) {
        tareas.add(tarea);
    }

    public List<Tarea<T>> obtenerPorPrioridad(int prioridad) {
        List<Tarea<T>> resultado = new ArrayList<>();

        for (Tarea<T> t : tareas) {
            if (t.getPrioridad() == prioridad) {
                resultado.add(t);
            }
        }

        return resultado;
    }

    public void mostrarOrdenadasPorFecha() {
        tareas.sort(new Comparator<Tarea<T>>() {
            @Override
            public int compare(Tarea<T> t1, Tarea<T> t2) {
                return t1.getFechaVencimiento().compareTo(t2.getFechaVencimiento());
            }
        });

        for (Tarea<T> t : tareas) {
            System.out.println(t);
        }
    }
}

