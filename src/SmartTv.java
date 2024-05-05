
public class SmartTv{

  boolean ligada=false;
  int canal=1;
  static int volume= 25;


public void mudarCanal(int novoCanal){

    canal = novoCanal;

}

public static void aumentarCanal(){
     volume++;
     System.out.println("Aumentando o canal para:" + volume);
  }

  public static void diminuirCanal(){
     volume--;

     System.out.println("Diminuir o canal para:" + volume);

  }





  public static void aumentarVolume(){
     volume++;
     System.out.println("Aumentando o volume para:" + volume);
  }

  public static void diminuirVolume(){
     volume--;

     System.out.println("Diminuir o volume para:" + volume);

  }

  public void ligar(){
     ligada=true;
  }

  public void desligar(){
     ligada=false;
  }


}