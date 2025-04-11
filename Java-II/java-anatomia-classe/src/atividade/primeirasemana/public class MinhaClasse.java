package atividade.primeirasemana;
public class MinhaClasse.Java {

  public static void main (String [] args) {
   
   String primeiroNome = "Gleydson";
   String segundoNome = "Sampaio";
  
   String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

   System.out.println(nomeCompleto); 
  } 

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    //mostra resultado do metodo
    //concatena os dois nomes e retorna o resultado
    return "Resultado do Metodo" + primeiroNome.concat(" ").concat(segundoNome);
}

} 
