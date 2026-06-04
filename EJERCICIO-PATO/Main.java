import patos.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pato> patos = List.of(
            new PatoMallard(),
            new PatoMandarin(),
            new PatoDeHule(),
            new PatoDeCasa()
        );

        for (Pato pato : patos) {
            pato.dibujar();
            pato.nadar();
            pato.emprenderVuelo();
            pato.hacerQuack();
            System.out.println();
        }
    }
}