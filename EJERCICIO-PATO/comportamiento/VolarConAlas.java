package comportamiento;
// Implementa un vuelo normal con alas
public class VolarConAlas implements ComportamientoDeVuelo {
    @Override
    public void volar() {
        System.out.println("Estoy volando con alas!");
    }
}
