package org.example;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + SmartTv.ligada);
        System.out.println("Canal atual: " + SmartTv.canal);
        System.out.println("volune atual: " + SmartTv.volune);

        smartTv.ligar();
        System.out.println("novo status -> TV LIGADA: " + SmartTv.ligada);

        smartTv.desligar();
        System.out.println("novo status -> TV LIGADA:  " + SmartTv.ligada);

        smartTv.diminuirVolune();
        smartTv.diminuirVolune();
        smartTv.diminuirVolune();
        smartTv.aumentarVolune();

        System.out.println("volune atual: "+ smartTv.volune);

        smartTv.mudarCanal(13);

        System.out.println("canal atual:" + smartTv.canal);


    }
}