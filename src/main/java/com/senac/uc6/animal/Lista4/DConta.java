package com.senac.uc6.animal.Lista4;

public class DConta {

    private String nome;
    private int conta;
    private Double saldo;

    public DConta(String nome, int conta, Double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void sacar(Double valor){
        this.saldo -= valor;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

}
