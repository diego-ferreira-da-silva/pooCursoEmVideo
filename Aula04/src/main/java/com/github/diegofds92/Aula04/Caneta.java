package com.github.diegofds92.Aula04;

import javax.xml.transform.OutputKeys;

public class Caneta {

    private String modelo;
    private float ponta;

    public String getModelo(){

        return this.modelo;
    }
    public void setModelo(String m){

        this.modelo = m;
    }

    public Float getPonta(){

        return this.ponta;
    }
    public void setPonta(Float p){

        this.ponta = p;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());

    }

}
