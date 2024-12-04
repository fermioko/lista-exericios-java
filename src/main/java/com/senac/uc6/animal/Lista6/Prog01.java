package com.senac.uc6.animal.Lista6;

import java.util.Scanner;

public class Prog01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um texto a ser Invertido: ");
        String inverter = s.next();

        String textoInvertido = new StringBuilder(inverter).reverse().toString();

        System.out.println("Original: " +inverter);
        System.out.println("Invertido: " +textoInvertido);

    }

}
