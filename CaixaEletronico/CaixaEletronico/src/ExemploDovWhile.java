// Exemplo de uso do do while
  import java.util.Random;
  public class ExemploDovWhile {
  public static void main(String[] args) {
    //exemplo de uso do do while
    //simulando um telefone tocando         
      System.out.println("Discando...");
      
      do {
        //excutando repetidas vezes até alguém atender
        System.out.println("Telefone tocando");
      
      }while(tocando());
      
      System.out.println("Alô !!!");
    }
    private static boolean tocando() {
      boolean atendeu = new Random().nextInt(3)==1;
      System.out.println("Atendeu? " + atendeu);
      //negando o ato de continuar tocando
      return ! atendeu;
    }
  }
// Exemplo de uso do do while
// simulando um telefone tocando
