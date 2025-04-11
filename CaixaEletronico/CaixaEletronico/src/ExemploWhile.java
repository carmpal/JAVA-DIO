
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
          double valorDoce = valorAleatrorio();
          if (valorDoce > mesada) {
            valorDoce = mesada;

            System.out.println("Doce do valor" + valorDoce);
            mesada = mesada - valorDoce;
          }
          System.out.println("Mesada restante: " + mesada);
          System.out.println("Joao gastou " + valorDoce + " reais em doces.");
        }
    }
    private static double valorAleatrorio() {
        return ThreadLocalRandom.current().nextDouble(2,8); // Gera um valor aleatório entre 2 e 8

    }
}
