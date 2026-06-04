package patos;

public class PatoVendedorRosas extends Pato {
    public PatoVendedorRosas() {
        super("Voy soplado, estoy relocoooo!", "WASSAAAAA!");
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Vendedor de Rosas.");
    }
    
}
