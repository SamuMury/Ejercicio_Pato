package comportamiento;
// Sonido de pato producido por un pito
public class Chillido implements ComportamientoDeGraznido {
    @Override
    public void quack() {
        System.out.println("¡Chiiiiiido! (sonido de pito)");
    }
}
