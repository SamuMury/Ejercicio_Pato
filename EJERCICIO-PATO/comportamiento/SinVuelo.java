package comportamiento;
// Deshabilita el vuelo
public class SinVuelo implements ComportamientoDeVuelo {
    @Override
    public void volar() {
        System.out.println("No puedo volar.");
    }
}
