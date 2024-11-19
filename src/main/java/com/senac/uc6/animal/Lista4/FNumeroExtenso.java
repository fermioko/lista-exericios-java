package com.senac.uc6.animal.Lista4;

import java.util.Scanner;

public class FNumeroExtenso  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 100: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 100) {
            System.out.println("Número fora do intervalo permitido.");
            return;
        }

        System.out.println("Por extenso: " + numeroPorExtenso(numero));
    }

    public static String numeroPorExtenso(int numero) {
        String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
                "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete",
                "dezoito", "dezenove"};

        String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta",
                "oitenta", "noventa"};

        if (numero <= 19) {
            return unidades[numero];
        } else if (numero == 100) {
            return "cem";
        } else {
            int dezena = numero / 10;
            int unidade = numero % 10;
            String extenso = dezenas[dezena];

            if (unidade != 0) {
                extenso += " e " + unidades[unidade];
            }

            return extenso;
        }
    }

/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número entre 0 e 100: ");
    int numero = scanner.nextInt();

    if (numero < 0 || numero > 100) {
        System.out.println("Número fora do intervalo permitido.");
    } else {
        System.out.println("Por extenso: " + numeroPorExtenso(numero));
    }
}

    public static String numeroPorExtenso(int numero) {
        String extenso = "";

        switch (numero) {
            case 0: return "zero";
            case 1: return "um";
            case 2: return "dois";
            case 3: return "três";
            case 4: return "quatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "sete";
            case 8: return "oito";
            case 9: return "nove";
            case 10: return "dez";
            case 11: return "onze";
            case 12: return "doze";
            case 13: return "treze";
            case 14: return "quatorze";
            case 15: return "quinze";
            case 16: return "dezesseis";
            case 17: return "dezessete";
            case 18: return "dezoito";
            case 19: return "dezenove";
            case 100: return "cem";
        }

        int dezena = numero / 10;
        int unidade = numero % 10;

        switch (dezena) {
            case 2: extenso = "vinte"; break;
            case 3: extenso = "trinta"; break;
            case 4: extenso = "quarenta"; break;
            case 5: extenso = "cinquenta"; break;
            case 6: extenso = "sessenta"; break;
            case 7: extenso = "setenta"; break;
            case 8: extenso = "oitenta"; break;
            case 9: extenso = "noventa"; break;
        }

        if (unidade != 0) {
            switch (unidade) {
                case 1: extenso += " e um"; break;
                case 2: extenso += " e dois"; break;
                case 3: extenso += " e três"; break;
                case 4: extenso += " e quatro"; break;
                case 5: extenso += " e cinco"; break;
                case 6: extenso += " e seis"; break;
                case 7: extenso += " e sete"; break;
                case 8: extenso += " e oito"; break;
                case 9: extenso += " e nove"; break;
            }
        }

        return extenso;
    }
*/
}





//Criar um algoritmo que leia um nº de 0 a 100 e o escreva por extenso.
