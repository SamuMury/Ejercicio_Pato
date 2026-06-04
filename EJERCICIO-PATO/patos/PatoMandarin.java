package patos;

public class PatoMandarin extends Pato {
    public PatoMandarin() {
        super("VolarConAlas", "Quack");
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Mandarín.");
    }
}