package com.github.diegofds92;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public ContaBanco(float saldo){
        this.saldo = 0;
        this.status = false;
    }
    //Abrir conta e verifica o tipo, caso conta corrente começa com 50 reais caso poupança 150
    public void AbrirConta(String tipo){
        setTipo(tipo);
        this.status = true;
        if (tipo.equals("CC")){
            saldo = 50;
        } else if (tipo.equals("CP")) {
            saldo = 150;
        }
    }
    //Método para fechar conta, verifica se está zerada caso contrário não permite
    public void FecharConta(){
        if(saldo > 0){
            System.out.println("É necessário zerar a conta antes de fechar.");
            System.out.println("Saldo atual: " + getSaldo());
        } else if (saldo < 0) {
            System.out.println("É necessário quitar os débitos.");
            System.out.println("Saldo em conta negativo: " + getSaldo());
        }else{
            System.out.println("Conta encerrada!");
            status = false;
        }
    }

    //Método para depositar dinheiro em conta
    public void Depositar(int valor){
        if (status == false) {
            System.out.println("Conta não existente");
        }else{
            System.out.println("Valor depositado!");
            saldo = saldo + valor;
            System.out.println("Saldo atual: " + getSaldo());
        }
    }

    //Método para Sacar valor
    public void Sacar(float valor){
        if (status){
            if (getSaldo() >= valor){
                saldo = getSaldo() - valor;
            }else{
                System.out.println("Saldo Insuficiente");
            }
         }else{
            System.out.println("Impossível Sacar");
        }
    }

    //Pagar mensalidade verifica se a conta existe, caso sim as condições para saber se tem saldo em conta e cobrar.
    public void PagarMensalidade(){
        if(status){
            if (tipo == "CC"){
                if(getSaldo() > 12){
                    System.out.println("Mensalidade de R$12.00 paga");
                    saldo = getSaldo() - 12;
                    System.out.println("Saldo em conta: " + getSaldo());
                }else{
                    System.out.println("Valor insuficiente para pagamento da mensalidade.");
                    System.out.println("Valor em conta: " + getSaldo());
                }
            } else if (tipo == "CP") {
                if(getSaldo() > 20) {
                    System.out.println("Mensalidade de R$20.00 paga");
                    saldo = getSaldo() - 20;
                    System.out.println("Saldo em conta: " + getSaldo());
                }else{
                    System.out.println("Valor insuficiente para pagamento da mensalidade");
                    System.out.println("Valor em conta: " + getSaldo());
                }
            }
        }else{
            System.out.println("Conta inexistente");
        }
    }


    public void abrirConta(){

    }

    public void fecharConta(){

    }

    public void depositar(){

    }

    public void sacar(){

    }

    public void pagarMensal(){

    }

    //Getter e Setter Num Conta
    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
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
    public void setDono(){
        this.dono = dono;
    }

    //Getter e Setter do saldo
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(){
        this.saldo = saldo;
    }

    // Getter e Setter do Status
    public boolean getStatus(){
        return status;
    }
    public void setStatus(){
        this.status = status;
    }
}
