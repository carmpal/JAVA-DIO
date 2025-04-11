public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        int numeroCurto = 1;
        int numeroNormal = numeroCurto; // conversao implicita
        short numeroCurto2 = (short) numeroNormal; // conversao explicita
    }   
}
