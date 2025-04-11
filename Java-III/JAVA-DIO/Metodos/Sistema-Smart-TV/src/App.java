public class App {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("Canal Atual " + smartTV.canal);
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        smartTV.mudarCanal(13);
        System.out.println("Canal Atual " + smartTV.canal);

        System.out.println("TV ligada? " + smartTV.ligada);

        System.out.println("Volume Atual " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);

}
}
