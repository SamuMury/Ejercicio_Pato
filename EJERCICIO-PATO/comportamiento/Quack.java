package comportamiento;
// Sonido normal de pato
public class Quack implements ComportamientoDeGraznido {
    @Override
    public void quack() {
        System.out.println("¡Quack!");
    }
}
