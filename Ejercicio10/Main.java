package Ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void alquilarVehiculos(List<? extends Vehiculo> lista) {
        for (Vehiculo v : lista) {
            v.alquilar();
        }
    }

    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto());
        autos.add(new Auto());

        List<Moto> motos = new ArrayList<>();
        motos.add(new Moto());

        List<Camion> camiones = new ArrayList<>();
        camiones.add(new Camion());

        alquilarVehiculos(autos);
        alquilarVehiculos(motos);
        alquilarVehiculos(camiones);
    }
}
