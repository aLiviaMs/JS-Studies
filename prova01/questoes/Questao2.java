package questoes;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float peso = 0, percentualHomens, percentualMulheres, percentualHomensMais60eMais95Kg,
                percentualMulheresEntre20e30Menos45Kg;
        int idade = 0, quantidadeDePessoasAtendidas = 0, mulheresAtendidas = 0, homensAtendidos = 0,
                homensMais60eMais95Kg = 0, mulheresEntre20e30Menos45Kg = 0;

        String sexo = "";

        while (!sexo.equals("X")) {
            System.out.println("Digite M para masculino, F para feminino ou X para parar a execução do processo. ");
            sexo = scn.next();

            if (sexo.equals("M") || sexo.equals("m") || sexo.equals("F") || sexo.equals("f")) {
                System.out.println("Digite o peso. ");
                peso = scn.nextFloat();

                System.out.println("Digite a idade. ");
                idade = scn.nextInt();
            }

            if (sexo.equals("M") || sexo.equals("m")) {
                quantidadeDePessoasAtendidas++;
                homensAtendidos++;

                if (idade >= 60 && peso > 95) {
                    homensMais60eMais95Kg++;
                }

            } else if (sexo.equals("F") || sexo.equals("f")) {
                quantidadeDePessoasAtendidas++;
                mulheresAtendidas++;

                if (idade >= 20 && idade <= 30 && peso < 45) {
                    mulheresEntre20e30Menos45Kg++;
                }

            }

        }

        percentualHomens = ((float) homensAtendidos / quantidadeDePessoasAtendidas) * 100;
        percentualMulheres = ((float) mulheresAtendidas / quantidadeDePessoasAtendidas) * 100;
        percentualHomensMais60eMais95Kg = ((float) homensMais60eMais95Kg / quantidadeDePessoasAtendidas) * 100;
        percentualMulheresEntre20e30Menos45Kg = ((float) mulheresEntre20e30Menos45Kg / quantidadeDePessoasAtendidas)
                * 100;

        System.out.println("a) O número total de pessoas atendidas: " + quantidadeDePessoasAtendidas
                + ". O número de homens atendidos: " + homensAtendidos + ". O número de mulheres atendidas: "
                + mulheresAtendidas + ". O percentual de homens atendidos: " + percentualHomens + "% "
                + ". O percentual de mulheres atendidas: " + percentualMulheres + "% ");
        System.out.println("b) O número de homens com 60 anos ou mais, que pesam mais de 95kg: " + homensMais60eMais95Kg
                + ". O percentual de homens com 60 anos ou mais, que pesam mais de 95kg: "
                + percentualHomensMais60eMais95Kg + "%");
        System.out.println("c) O número de mulheres com idade entre 20 e 30 anos, que pesam menos de 45kg: "
                + mulheresEntre20e30Menos45Kg
                + ". O percentual de mulheres com idade entre 20 e 30 anos, que pesam menos de 45kg: "
                + percentualMulheresEntre20e30Menos45Kg + "%");
    }

}
