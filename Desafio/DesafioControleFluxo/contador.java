import java.util.Scanner;

public class ParametrosInvalidosException extends Exception {
  public ParametrosInvalidosException(String mensagem) {
    super(mensagem);
}
} 
public class contador {
  public static void main(String[] args) {
          
    Scanner scanner = new Scanner(System.in);
  
    try {
       // Recebendo os números inteiros do usuário
      
       System.out.print("Digite o primeiro número inteiro: ");
       int numero1 = scanner.nextInt();
  
       System.out.print("Digite o segundo número inteiro: ");
       int numero2 = scanner.nextInt();
  
      // Verificação dos parâmetros e cálculo
      contar(numero1, numero2);

    } catch (ParametrosInvalidosException e){

      System.out.println(e.getMessage());
     } finally {
              scanner.close();
    }
  }
  
  public static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        
  if (numero1 > numero2) {

      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
  }  
  
      int totalInteracoes = numero2 - numero1;
  
    for (int i = 1; i <= totalInteracoes; i++) {

      System.out.println("Imprimindo o número " + i);
    }
  }
 

}
  