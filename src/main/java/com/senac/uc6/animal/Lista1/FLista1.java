package com.senac.uc6.animal.Lista1;

//6 - Tendo como entrada a altura e o sexo
// (codificada da seguinte forma:
// 1:feminino   2:masculino) de uma pessoa,
// construa um programa que calcule e imprima seu peso ideal,
// utilizando as seguintes.
//Fórmulas:
//- para  homens:    (72.7   * Altura) – 58
//- para  mulheres:  (62.1   * Altura) – 44.7

import java.util.Scanner;

public class FLista1 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        float pesoIdeal = 0.00F;

        System.out.print("Digite a altura: ");
        float altura = scr.nextFloat();

        System.out.print("Digite: 1-Feminino e 2-Masculino: ");
        int sexo = scr.nextInt();

        if (sexo == 1){
            pesoIdeal = (float) ((62.1 * altura) - 58);
            System.out.println("Peso ideal Feminino = " + pesoIdeal);
        }else if (sexo == 2){
            pesoIdeal = (float) ((72.7 * altura) - 44.7);
            System.out.println("Peso ideal Masculino = " + pesoIdeal);
        } else{
            System.out.println("Digite: 1-Feminino e 2-Masculino:");
        }

    }
}
