package patos;

import comportamiento.SinVuelo;
import comportamiento.Mudo;

public class PatoDeCasa extends Pato {

    public PatoDeCasa() {
        comportamientoVuelo   = new SinVuelo();
        comportamientoGraznido = new Mudo();
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato de Casa (decorativo).");
    }
}
