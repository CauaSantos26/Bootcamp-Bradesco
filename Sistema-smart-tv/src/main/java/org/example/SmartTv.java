package org.example;

public class SmartTv {

    static boolean ligada = false;
    static int canal = 1;
    static int volune = 25;


    public void ligar(){

        ligada = true;

    }

    public void desligar(){

        ligada = false;

    }

    public void aumentarVolune(){

        volune++;

    }

    public void diminuirVolune(){

        volune--;

    }

    public void aumentarCanal(){

        canal++;

    }

    public void diminuirCanal(){

        canal--;
    }

    public void mudarCanal(int novoCanal){

        canal = novoCanal;

    }

}
