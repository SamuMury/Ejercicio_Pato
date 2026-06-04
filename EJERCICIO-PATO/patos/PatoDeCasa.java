package patos;

public class PatoDeCasa extends Pato {
    public PatoDeCasa() {
        super("SinVuelo", "Mudo");
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato de Casa (decorativo).");
    }
}