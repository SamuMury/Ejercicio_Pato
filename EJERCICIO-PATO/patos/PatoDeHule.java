package patos;

import comportamiento.SinVuelo;
import comportamiento.Chillido;

public class PatoDeHule extends Pato {

    public PatoDeHule() {
        comportamientoVuelo   = new SinVuelo();
        comportamientoGraznido = new Chillido();
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato de Hule (de juguete).");
    }
}
