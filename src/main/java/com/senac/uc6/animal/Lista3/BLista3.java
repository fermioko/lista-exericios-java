package com.senac.uc6.animal.Lista3;

//2) Escreva um algoritmo que calcule a soma dos números de 1 a 15.

public class BLista3 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i <= 15 ; i++) {
            soma = soma + i;
            System.out.println((i) + " , " +(soma));//testando
        }
        System.out.println("A soma de 1 a 15 = " + soma);
    }
}

