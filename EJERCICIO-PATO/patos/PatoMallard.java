package patos;

public class PatoMallard extends Pato {
    public PatoMallard() {
        super("VolarConAlas", "Quack");
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Mallard.");
    }
}