public class SmartTv {

    boolean ligado = false;
    int volume = 15;
    int canal = 1;


    public void  ligarTv(){
       ligado = true;
    }
    public void  desligarTv(){
        ligado = false;
     }
    

    public void  aumentaVolume(){
        volume ++;
        System.out.println("Aumentou volume para: " + volume);
    }

    public void  diminuirVolume(){
        volume --;
        System.out.println("Diminuiu volume para: " + volume);
    }

    public void  mudarCanal(int novocanal){
        canal  = novocanal;
    }

    public void  aumentarCanal(){
        canal ++;
    }

    public void  diminuirCanal(){
        canal --;
    }

}
