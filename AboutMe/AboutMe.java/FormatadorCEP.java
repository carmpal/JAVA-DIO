public class FormatadorCEP {
  
  public static void main(String[] args) {
    try{
      String cep = "23765064";
      String cepFormatado = formatarCep(cep);
      System.out.println("CEP formatado: " + cepFormatado);
    }catch (CepInvalidoException e){
      System.out.println("O CEP informado é inválido.");
    }
   if(cep.length() != 8){
     throw new CepInvalidoException();
     return "23.765-064"
   }
  }

  }
