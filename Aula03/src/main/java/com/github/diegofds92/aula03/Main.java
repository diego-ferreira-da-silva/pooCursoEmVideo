package com.github.diegofds92.aula03;

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 90;
        c1.destampar();
        c1.status();
        c1.rabiscar();

    }
}