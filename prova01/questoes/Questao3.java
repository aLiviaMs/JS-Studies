package questoes;

import java.util.*;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        List<String> listaNomeAprovados = new ArrayList<String>();
        List<String> listaNomeReprovados = new ArrayList<String>();
        List<String> listaAprovados = new ArrayList<String>();
        List<String> listaReprovados = new ArrayList<String>();

        String RA;

        float n1, n2, mediaPonderada = 0, notaExame, mediaFinal = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Digite o RA do aluno " + (i + 1) + ".");
            RA = scn.next();
            while (RA.length() != 7) {
                System.out.println("O RA só é válido se possuir 7 dígitos. Digite novamente.");
                RA = scn.next();
            }

            System.out.println("Digite as notas das 2 provas, do aluno com RA: " + RA);
            n1 = scn.nextFloat();
            while (n1 > 10 || n1 < 0) {
                System.out.println("Nota não pode ser maior que 10, ou um número negativo. Digite a nota novamente");
                n1 = scn.nextFloat();
            }

            n2 = scn.nextFloat();
            while (n2 > 10 || n2 < 0) {
                System.out.println("Nota não pode ser maior que 10, ou um número negativo. Digite a nota novamente");
                n2 = scn.nextFloat();
            }

            mediaPonderada = (n1 * 2 + n2 * 3) / 5.0f;

            if (mediaPonderada < 7) {
                System.out.println("O RA: " + RA
                        + " não atingiu a média miníma para a aprovação. Informe a nota do exame deste aluno. ");
                notaExame = scn.nextFloat();

                while (notaExame > 10 || notaExame < 0) {
                    System.out
                            .println("Nota não pode ser maior que 10, ou um número negativo. Digite a nota novamente");
                    notaExame = scn.nextFloat();
                }

                mediaFinal = (n1 * 2 + n2 * 3 + notaExame * 4) / 9;

                if (mediaFinal >= 7) {
                    listaAprovados.add(Float.toString(mediaFinal));
                    listaNomeAprovados.add(RA);
                } else {
                    listaReprovados.add(Float.toString(mediaFinal));
                    listaNomeReprovados.add(RA);
                }

            } else if (mediaPonderada >= 7) {
                listaAprovados.add(Float.toString(mediaPonderada));
                listaNomeAprovados.add(RA);
            }
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("\n");

            if (listaReprovados.size() == 0) {
                System.out.println("Ninguém reprovado. ");
            } else {
                System.out.println("Reprovados: ");
                for (int x = 0; x < listaReprovados.size(); x++) {
                    System.out.println(listaNomeReprovados.get(x) + " - " + listaReprovados.get(x));
                }
            }

            if (listaAprovados.size() == 0) {
                System.out.println("\nNenhum aprovado. ");
            } else {
                System.out.println("\nAprovados: ");
                for (int x = 0; x < listaAprovados.size(); x++) {
                    System.out.println(listaNomeAprovados.get(x) + " - " + listaAprovados.get(x));
                }
            }

        }

    }

}
