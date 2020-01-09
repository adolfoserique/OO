package aula2exer2;

import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		String sexo;
		int n;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.print("Digite o seu sexo(m ou f): ");
			sexo = ler.next();
			System.out.println((sexo.equals("M") || sexo.equals("m") || sexo.equals("f") || sexo.equals("F")) ? (sexo.equals("f") || sexo.equals("F")) ? "\n\n\t\t\t\tFEMININO" : "\n\n\t\t\t\tMASCULINO" : "\n\n\t\t\t\tErro: sexo nao corresponde!");	
		}
			
		while((!sexo.equals("M") && !sexo.equals("m") && !sexo.equals("f") && !sexo.equals("F")));
	}

}