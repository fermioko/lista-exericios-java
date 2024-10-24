package com.senac.uc6.animal.Lista3;

//3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

import java.util.Scanner;

public class CLista3 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("Digite o nome do usuario: ");
        String nomeUsuario = scr.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - Usuario: " + nomeUsuario);
        }

    }
}
