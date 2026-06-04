package patos;

import comportamiento.*;

public class Pato {

    private ComportamientoDeVuelo comportamientoVuelo;
    private ComportamientoDeGraznido comportamientoGraznido;

    protected String tipoVuelo;
    protected String tipoGraznido;

    public Pato(String tipoVuelo, String tipoGraznido) {
        this.tipoVuelo    = tipoVuelo;
        this.tipoGraznido = tipoGraznido;
        establecerComportamientoDeVuelo(tipoVuelo);
        establecerComportamientoDeGraznido(tipoGraznido);
    }

    public void nadar() {
        System.out.println("Todos los patos saben nadar.");
    }

    public void dibujar() {
        System.out.println("Soy un pato genérico.");
    }

    public void hacerQuack() {
        comportamientoGraznido.quack();
    }

    public void emprenderVuelo() {
        comportamientoVuelo.volar();
    }

    protected void establecerComportamientoDeVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
        switch (tipoVuelo) {
            case "VolarConAlas" -> this.comportamientoVuelo = new VolarConAlas();
            case "SinVuelo"     -> this.comportamientoVuelo = new SinVuelo();
            case "Voy soplado, estoy relocoooo!" -> this.comportamientoVuelo = new VolarSoplado();
            default -> throw new IllegalArgumentException("Tipo de vuelo desconocido: " + tipoVuelo);
        }
    }

    protected void establecerComportamientoDeGraznido(String tipoGraznido) {
        this.tipoGraznido = tipoGraznido;
        switch (tipoGraznido) {
            case "Quack"    -> this.comportamientoGraznido = new Quack();
            case "Chillido" -> this.comportamientoGraznido = new Chillido();
            case "Mudo"     -> this.comportamientoGraznido = new Mudo();
            case "WASSAAAAA!" -> this.comportamientoGraznido = new GraznidoSoplado();
            default -> throw new IllegalArgumentException("Tipo de graznido desconocido: " + tipoGraznido);
        }
    }
}