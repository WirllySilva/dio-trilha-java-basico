public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.ligar();
        smartTv.ligar();
        smartTv.desligar();
        smartTv.desligar();
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.desligar();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();
        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
        smartTv.mudarCanal();

    }
    
}
