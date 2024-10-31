package com.senac.uc6.animal.Lista4;

import java.util.Scanner;
public class BSemana {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println(" Dia da Semana : Escolha numero entre 1 e 7: ");
        System.out.print(" Digite o dia da semana: ");
        int semana = scr.nextInt();

        switch (semana){
            case 1:
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Segunda-Feira");
                break;
            case 3:
                System.out.println("3 - Terça-Feira");
                break;
            case 4:
                System.out.println("4 - Quarta-Feira");
                break;
            case 5:
                System.out.println("5 - Quinta-Feira");
                break;
            case 6:
                System.out.println("6 - Sexta-Feira");
                break;
            case 7:
                System.out.println("7 - Sabado");
                break;
            default:
                System.out.println("Escolha numero entre 1 e 7: ");
        }
    }
}

//2 - Receba um número e imprima o dia correspondente sa semana.
//1-Domingo; 2-Segunda-feira; 3-Terça-feira etc...