package patos;

import comportamiento.VolarConAlas;
import comportamiento.Quack;

public class PatoMallard extends Pato {

    public PatoMallard() {
        comportamientoVuelo   = new VolarConAlas();
        comportamientoGraznido = new Quack();
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Mallard.");
    }
}
