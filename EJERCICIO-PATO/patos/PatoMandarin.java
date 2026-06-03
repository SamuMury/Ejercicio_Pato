package patos;

import comportamiento.VolarConAlas;
import comportamiento.Quack;

public class PatoMandarin extends Pato {

    public PatoMandarin() {
        comportamientoVuelo   = new VolarConAlas();
        comportamientoGraznido = new Quack();
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Mandarín.");
    }
}
