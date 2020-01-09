package exercicio1_aula2;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Percentual {

	public static void main(String[] args) {
		
		final int piso = 1000;
		float resultado, percentual;
		DecimalFormat mascara = new DecimalFormat("0.00%");
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o percentual desejado: ");
		percentual = ler.nextFloat();
		
		resultado = (percentual/piso);
		
		System.out.print("O percentual do piso desejado vale: " + mascara.format(resultado));

	}

}