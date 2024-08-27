public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("tv esta ligada? " + smartTv.ligado );
        System.out.println("volume? " + smartTv.volume);
        System.out.println("canal? " + smartTv.canal );
       

        smartTv.ligarTv();
        System.out.println(" Novo tv esta ligada? " + smartTv.ligado);

        smartTv.aumentaVolume();
       
        
        smartTv.mudarCanal(13);
        System.out.println("Novo canal : " + smartTv.canal);
    }

}
