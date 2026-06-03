import patos.*;
import comportamiento.VolarConAlas;
import comportamiento.Quack;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Pato Mallard ===");
        Pato mallard = new PatoMallard();
        mallard.dibujar();
        mallard.nadar();
        mallard.emprenderVuelo();
        mallard.hacerQuack();

        System.out.println("\n=== Pato Mandarín ===");
        Pato mandarin = new PatoMandarin();
        mandarin.dibujar();
        mandarin.nadar();
        mandarin.emprenderVuelo();
        mandarin.hacerQuack();

        System.out.println("\n=== Pato de Hule ===");
        Pato hule = new PatoDeHule();
        hule.dibujar();
        hule.nadar();
        hule.emprenderVuelo();
        hule.hacerQuack();

        System.out.println("\n=== Pato de Casa ===");
        Pato casa = new PatoDeCasa();
        casa.dibujar();
        casa.nadar();
        casa.emprenderVuelo();
        casa.hacerQuack();

        // Demostración del patrón Strategy: cambiar comportamiento en tiempo de ejecución
        System.out.println("\n=== Cambiando comportamiento del Pato de Casa en tiempo de ejecución ===");
        casa.establecerComportamientoDeVuelo(new VolarConAlas());
        casa.establecerComportamientoDeGraznido(new Quack());
        casa.emprenderVuelo();
        casa.hacerQuack();
    }
}