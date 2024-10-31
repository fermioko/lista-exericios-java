package com.senac.uc6.animal.Lista4;

import java.util.Scanner;

public class CNumExtenso {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("Digite um numero entre 0 e 10: ");
        int numero = scr.nextInt();

        switch (numero){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            case 4:
                System.out.println("quatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("sete");
                break;
            case 8:
                System.out.println("oito");
                break;
            case 9:
                System.out.println("nove");
                break;
            case 10:
                System.out.println("dez");
                break;
            default:
                System.out.println("Digite um numero entre 0 e 10: ");
        }
    }
}

//3 - Faça um programa que leia um número entre 0 e 10,
// e escreva este número por extenso.
// Use o comando switch.