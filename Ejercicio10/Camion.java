package Ejercicio10;

public class Camion extends Vehiculo {
    @Override
    public void alquilar() {
        System.out.println("Camión alquilado");
    }

    public void cargar() {
        System.out.println("El camión está cargando");
    }
}
