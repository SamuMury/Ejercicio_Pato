package comportamiento;

// Deshabilita el sonido
public class Mudo implements ComportamientoDeGraznido {
    @Override
    public void quack() {
        System.out.println("... (silencio)");
    }
}
