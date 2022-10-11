package com.github.diegofds92;

public class Aula05 {
    public static void main(String[] args) {

        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1111);
        pessoa1.setDono("Rodolfin");
        pessoa1.abrirConta("CC");

        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(2222);
        pessoa2.setDono("Cleuza");
        pessoa2.abrirConta("CP");

        pessoa2.depositar(300);
        pessoa2.sacar(700);

        pessoa1.sacar(50);
        pessoa1.fecharConta();

        pessoa1.estadoAtual();
        System.out.println("----------------------");
        pessoa2.estadoAtual();
    }
}
