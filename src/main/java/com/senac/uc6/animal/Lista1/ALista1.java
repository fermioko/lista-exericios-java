package com.senac.uc6.animal.Lista1;

import java.util.Scanner;

//1. Escreva um	programa para ler 2 valores
// (considere que não serão informados	valores	iguais)
// e escrever o maior deles


public class ALista1 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = scr.nextInt();

        System.out.print("Digite outro numero: ");
        int n2 = scr.nextInt();

        /*if (n1 > n2) {
            System.out.println("O maior numero eh = " + n1);
        } else {
            System.out.println("O maior numero eh = " + n2);
        }*/

        var maiorNumero = n1 > n2 ? n1 : n2;

        System.out.println("O maior numero eh = " + maiorNumero);

    }
}

