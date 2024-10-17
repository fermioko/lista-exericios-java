package com.senac.uc6.animal.Lista1;

//2. Escreva um programa para ler o ano	de nascimento de uma pessoa
// e escrever uma mensagem que diga se ela poderá ou não votar este ano
// (não é necessário considerar	o mês em que ela nasceu).

import java.util.Scanner;

public class BLista1 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scr.nextInt();

        int anoVotar = 2024 - anoNascimento;

        if (anoVotar < 16) {
            System.out.println("Voce nao pode votar: " +anoVotar + " anos");
        }else{
            System.out.println("Voce pode votar: " +anoVotar + " anos");
        }

    }
}
