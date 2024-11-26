package com.senac.uc6.animal.Lista5;

import java.util.Scanner;
public class MatrizJogo {

//    String[][] hortifruti = { {"acerola", "maca", "jaboticaba", "figo"},
//            { "manga", "banana", "laranja", "limao" } };
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char[][] tabuleiro = {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
            };
            String jogador1, jogador2;
            char simboloAtual = 'X';
            boolean jogoAtivo = true;
            int jogadas = 0;

            // Ler os nomes dos jogadores
            System.out.print("Nome do Jogador 1 (X): ");
            jogador1 = scanner.nextLine();
            System.out.print("Nome do Jogador 2 (O): ");
            jogador2 = scanner.nextLine();

            // Loop do jogo
            while (jogoAtivo) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("É a vez de " + (simboloAtual == 'X' ? jogador1 : jogador2) + " (" + simboloAtual + ")");

                int linha, coluna;
                while (true) {
                    System.out.print("Digite a linha (0-2): ");
                    linha = scanner.nextInt();
                    System.out.print("Digite a coluna (0-2): ");
                    coluna = scanner.nextInt();

                    if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                        tabuleiro[linha][coluna] = simboloAtual;
                        break;
                    } else {
                        System.out.println("Posição inválida ou já ocupada. Tente novamente.");
                    }
                }

                jogadas++;
                if (verificarVitoria(tabuleiro, simboloAtual)) {
                    imprimirTabuleiro(tabuleiro);
                    System.out.println("Parabéns, " + (simboloAtual == 'X' ? jogador1 : jogador2) + "! Você venceu!");
                    jogoAtivo = false;
                } else if (jogadas == 9) {
                    imprimirTabuleiro(tabuleiro);
                    System.out.println("Empate! O jogo terminou.");
                    jogoAtivo = false;
                } else {
                    simboloAtual = (simboloAtual == 'X') ? 'O' : 'X';
                }
            }

            scanner.close();
        }

        // Função para imprimir o tabuleiro
        public static void imprimirTabuleiro(char[][] tabuleiro) {
            System.out.println("   0   1   2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + tabuleiro[i][j] + " ");
                    if (j < 2) System.out.print("|");
                }
                System.out.println();
                if (i < 2) System.out.println("  ---+---+---");
            }
        }

        // Função para verificar vitória
        public static boolean verificarVitoria(char[][] tabuleiro, char simbolo) {
            // Verificar linhas, colunas e diagonais
            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo)
                    return true;
                if (tabuleiro[0][i] == simbolo && tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo)
                    return true;
            }
            if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo)
                return true;
            if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo)
                return true;

            return false;
        }
}


//FAÇA UM JOGO DA VELHA:
// Leia o nome dos 2 participantes (p1 = x, p2 = o)
// Leia a posição da marcação.
// Não pode colocar na mesma posição já preenchida.
// Quando alguém ganhar, informar quem ganhou, ou se foi empate.
//Bônus: A cada inserção. exibir o jogo da velha.







