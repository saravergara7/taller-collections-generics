package Ejercicio1;

import java.util.*;

public class Tarea<T> {
    private String descripcion;
    private int prioridad;
    private Date fechaVencimiento;
    private T datoExtra;

    public Tarea(String descripcion, int prioridad, Date fechaVencimiento, T datoExtra) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
        this.datoExtra = datoExtra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public T getDatoExtra() {
        return datoExtra;
    }

    @Override
    public String toString() {
        return "Tarea: " + descripcion +
               ", prioridad=" + prioridad +
               ", fechaVencimiento=" + fechaVencimiento +
               ", datoExtra=" + datoExtra;
    }
}