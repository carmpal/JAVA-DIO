public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Continue: " + i);
                continue; // Pula para a próxima iteração
            }
            System.out.println("Valor: " + i);
        }

        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Break: " + j);
                break; // Sai do loop
            }
            System.out.println("Valor: " + j);
        }
  
    }
  }
