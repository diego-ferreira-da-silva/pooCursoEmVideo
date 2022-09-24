package com.github.diegofds92.Aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    public boolean tampada;

    public Caneta(String modelo, String cor,float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
