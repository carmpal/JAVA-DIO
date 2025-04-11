public class AboutMe {
  public static void main(String[] args) {
    
    //os argumentos começam com indice 0
    String nome = args[0];
    String sobrenome = args[1];
    //args[2] é o terceiro argumento, que é a idade
    //args[3] é o quarto argumento, que é a altura
    String idade = args[2];
   
    String altura = args[3];

    System.out.println("Ola, me chamo"+ nome + " " + sobrenome );
    System.out.println("Eu tenho " + idade + " anos");
    System.out.println(" e minha altura é " + altura + "cm.");
  }
}
