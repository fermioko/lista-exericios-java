package com.senac.uc6.animal.Lista6;

public class Prog03 {

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};

        int numeroDesejado = 70;
        int inicio = 0, fim = arr.length - 1;
        boolean encontrado = false;
        int posicaoDoNumero = 0;

        while (inicio <= fim){
            int meio = (inicio + fim) / 2;
            if(arr[meio] == numeroDesejado){
                encontrado = true;
                posicaoDoNumero = meio;
                break;
            } else if (arr[meio] < numeroDesejado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if(encontrado){
            System.out.println("Numero encontrado na posicao " + posicaoDoNumero);
        } else {
            System.out.println("Numero nao encontrado");
        }
    }

}
