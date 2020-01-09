package aula2exer5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Analise {

	public static void main(String[] args) {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		final int MAX = 20;
		int cont_peso_m = 0, cont_peso_f = 0, cont_m = 0, cont_f = 0, quant_f = 0;
		float peso_m[] = new float[MAX];
		float peso_f[] = new float[MAX];
		float media = 0F, soma_peso = 0F, maior = 0F, menor = 100000000000F;
		String sexo;

		Scanner ler = new Scanner(System.in);
		DecimalFormat mascara_peso = new DecimalFormat("0.00 kg");

		for (int cont_pessoas = 0; cont_pessoas < MAX; cont_pessoas++) {
			System.out.print("Digite o sexo da pessoa " + (cont_pessoas + 1) + "(masculino ou feminino): ");
			sexo = ler.next();
			switch (sexo.toUpperCase()) {

			case "MASCULINO": {
				System.out.print("Digite o peso da pessoa " + (cont_pessoas + 1) + "(em kg): ");
				peso_m[cont_peso_m] = ler.nextFloat();
				if (peso_m[cont_peso_m] <= 0 | peso_m[cont_peso_m] >= 1000) {
					System.out.print("\nErro: peso invalido!\n\n");
					cont_pessoas--;
				}
				else {
					cont_m++;
					cont_peso_m++;
				}
				break;
			}

			case "FEMININO": {
				System.out.print("Digite o peso da pessoa " + (cont_pessoas + 1) + "(em kg): ");
				peso_f[cont_peso_f] = ler.nextFloat();
				if (peso_f[cont_peso_f] <= 0 | peso_m[cont_peso_f] >= 1000) {
					System.out.print("\nErro: peso invalido!\n\n");
					cont_pessoas--;
				}
				else {
					cont_f++;
					cont_peso_f++;
				}
				break;
			}

			default: {
				System.out.print("\nErro: sexo invalido!\n\n");
				cont_pessoas--;
			}

			}

		}

		quant_f = cont_f;

		while (cont_peso_m-- > 0)
			soma_peso = soma_peso + peso_m[cont_peso_m];

		if (cont_m > 0)
			media = soma_peso / cont_m;
		else
			media = 0;

		while (cont_m-- > 0) {

			if (peso_m[cont_m] > maior)
				maior = peso_m[cont_m];

			if (peso_m[cont_m] < menor)
				menor = peso_m[cont_m];
		}

		while (cont_f-- > 0) {

			if (peso_f[cont_f] > maior)
				maior = peso_f[cont_f];

			if (peso_f[cont_f] < menor)
				menor = peso_f[cont_f];
		}

		System.out.print("\nO maior peso vale: " + mascara_peso.format(maior));
		System.out.print("\nO menor peso vale: " + mascara_peso.format(menor));
		System.out.print("\nA media do peso masculino vale: " + mascara_peso.format(media));
		System.out.print("\nO numero de mulheres vale: " + quant_f);
		
	}	

}
