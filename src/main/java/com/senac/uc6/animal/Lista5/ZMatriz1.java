package com.senac.uc6.animal.Lista5;

import java.util.Scanner;

public class ZMatriz1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[3][3];

//        int numPositivos = 0;
//        int numNegativos = 0;


        //preencher matriz
        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                System.out.printf("Digie a matriz[%d][%d]", linha,coluna);
                matriz[linha][coluna] = s.nextInt();
            }
        }

        //imprimir matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println();
        }

        //cálculo de positivos e negativos






    }
}

//1 - Leia uma matriz 3X3 com valores positivos e negativos.
// Após a entrada dos dados, deve realizar a soma dos
// positivos e negativos, imprimindo na tela.