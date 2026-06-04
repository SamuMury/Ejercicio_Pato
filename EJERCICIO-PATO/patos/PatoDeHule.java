package patos;

public class PatoDeHule extends Pato {
    public PatoDeHule() {
        super("SinVuelo", "Chillido");
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato de Hule (de juguete).");
    }
}