package patos;

import comportamiento.ComportamientoDeVuelo;
import comportamiento.ComportamientoDeGraznido;

public abstract class Pato {

    protected ComportamientoDeVuelo comportamientoVuelo;
    protected ComportamientoDeGraznido comportamientoGraznido;

    public void nadar() {
        System.out.println("Todos los patos saben nadar.");
    }

    public abstract void dibujar();

    public void hacerQuack() {
        comportamientoGraznido.quack();
    }

    public void emprenderVuelo() {
        comportamientoVuelo.volar();
    }

    // Permite cambiar el comportamiento en tiempo de ejecución (patrón Strategy)
    public void establecerComportamientoDeVuelo(ComportamientoDeVuelo cv) {
        this.comportamientoVuelo = cv;
    }

    public void establecerComportamientoDeGraznido(ComportamientoDeGraznido cg) {
        this.comportamientoGraznido = cg;
    }
}
