package com.github.diegofds92.aula02;


public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();


        Caneta c2 = new Caneta();
        c2.modelo = "Montegrappa";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 100;
        c2.status();
        c2.destampar();
        c2.rabiscar();

    }


}