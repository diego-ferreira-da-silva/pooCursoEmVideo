package com.github.diegofds92;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    //Construtor
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Métodos
    //Abrir conta e verifica o tipo, caso conta corrente começa com 50 reais caso poupança 150
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    //Método para fechar conta, verifica se está zerada caso contrário não permite
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
            System.out.println("Saldo atual: " + getSaldo());
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débito");
            System.out.println("Saldo em conta negativo: " + getSaldo());
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    //Método para depositar dinheiro em conta
    public void depositar(int v){
        if (status == false) {
            System.out.println("Impossível depositar em uma conta fechada!");
        }else{
            this.setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono() + " No valor de R$" + v) ;
        }
    }

    //Método para Sacar valor
    public void sacar(float v){
        if (status){
            if (this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono() + " no valor de R$" + v);
            }else{
                System.out.println("Saldo Insuficiente para saque");
            }
         }else{
            System.out.println("Impossível Sacar de uma conta fechada!");
        }
    }

    //Pagar mensalidade verifica se a conta existe, caso sim as condições para saber se tem saldo em conta e cobrar.
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }


    //Getter e Setter Num Conta
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }

    //Getter e Setter do tipo
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    //Getter e Setter do Dono
    public String getDono() {
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }

    //Getter e Setter do saldo
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float valor){
        this.saldo = valor;
    }

    // Getter e Setter do Status
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean b){
        this.status = b;
    }
}
