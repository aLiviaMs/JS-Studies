package questoes;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, m;

        System.out.println("Tamanho da matriz [n][m]: ");

        n = scn.nextInt();
        m = scn.nextInt();

        int[][] matriz = new int[n][m];

        float vet1[] = new float[n], vet2[] = new float[m];

        funcao(matriz, vet1, vet2, m, n);

    }

    private static void funcao(int[][] matrizMn, float[] vetor1, float[] vetor2, int m, int n) {
        Scanner scn = new Scanner(System.in);
        float soma = 0, numMaior[] = new float[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Insira um valor para a posição (" + (i + 1) + ", " + (j + 1) + ")");
                matrizMn[i][j] = Integer.parseInt(scn.nextLine());
            }
        }

        System.out.println("\nMatriz: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrizMn[i][j] + "        ");
            }
            System.out.print("\n");
        }

        System.out.println("\nVet1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                soma += matrizMn[i][j];
            }
            vetor1[i] = ((float) soma / m);
            soma = 0;

            System.out.println(vetor1[i]);
        }

        System.out.println("\nVet2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numMaior[j] = matrizMn[i][j];

                if (i == 0) {
                    vetor2[j] = numMaior[j];
                }

                if (j == m - 1) {
                    for (int j2 = 0; j2 < m; j2++) {
                        vetor2[j2] = Math.max(numMaior[j2], vetor2[j2]);
                    }
                }
            }
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }
    }

}
