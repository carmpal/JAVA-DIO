package atividade.primeirasemana;
public class MinhaClasse{
  public static void main (String[] args){
   String primeiroNome = "Gleydson";
   String segundoNome = "Sampaio";
   String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
   System.out.println(nomeCompleto);
  }
    
  public static String nomeCompleto(String primeiroNome, String segundoNome){
    // Concatenar os dois nomes
       String nomeCompleto = primeiroNome + " " + segundoNome;
       System.out.println(nomeCompleto); 
       return nomeCompleto;
    // Exibe o nome completo no console}
  
   } 
  }   