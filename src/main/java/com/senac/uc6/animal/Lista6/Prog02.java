package com.senac.uc6.animal.Lista6;

import java.util.Arrays;
import java.util.Scanner;

public class Prog02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};

        System.out.println(Arrays.toString(arr));
        System.out.print("Digite o numero para a busca binaria: ");

        int numero = s.nextInt();

        int resultado = buscaBinaria(arr, numero);

        if (resultado != -1){
            System.out.println("Elemento encontrado na posicao: " + resultado);
        } else {
            System.out.println("Elemento nao encontrado no array.");
        }
        s.close();
    }

    private static int buscaBinaria(int[] arr, int numero) {

        int inicio = 0;
        int fim = arr.length - 1;

        while(inicio <= fim){
            int meio = inicio + (fim - inicio) / 2;

            //verifica num no meio
            if (arr[meio] == numero){
                return meio; // indice do numero
            }

            //se num maior, ignora a metade esquerda
            if (arr[meio] < numero){
                inicio = meio + 1;
            }else{
                //se num menor, ignora a metade direita
                fim = meio - 1;
            }
        }
        return -1; //numero nao encontrado
    }
}


//Escreva um algoritmo que faça a busca de um elemento
// em um array ordenado.
//int[] arr = {10, 15, 20, 25, 30, 35, 40, 45, 50,
// 55, 60, 65, 70, 75, 80, 85, 90, 95, 100}

