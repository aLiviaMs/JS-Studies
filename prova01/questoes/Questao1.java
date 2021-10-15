package questoes;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float distanciaTransportar, pesoMercadoria, freteFixo = 300f, taxaRetorno=0, cada10Km, valorPeloPeso = 0, valorTonelada = 0, totalFrete = 0;
		
		System.out.println("Informe o peso total das mercadorias (kg): ");
		pesoMercadoria = scn.nextFloat();
		
		System.out.println("Informe a distância a percorrer (km): ");
		distanciaTransportar = scn.nextFloat();
		
		pesoMercadoria = pesoMercadoria * 1000;
		cada10Km = distanciaTransportar / 10;
		valorTonelada = pesoMercadoria / 1000000;
		
		valorPeloPeso = (15 * valorTonelada * cada10Km);
		
		if(distanciaTransportar>300) {
			taxaRetorno = 80;
		}
		
		totalFrete = freteFixo + valorPeloPeso + taxaRetorno;
		
		System.out.println("\nViagem(fixo): R$ " + freteFixo);
		System.out.println("Valor pelo peso: R$ " + valorPeloPeso + "( R$ 15 x " + valorTonelada + " x " + cada10Km + ")");
		System.out.println("Taxa de retorno = R$ " + taxaRetorno);
		System.out.println("Total de retorno = R$ " + totalFrete);
		
	}

}
