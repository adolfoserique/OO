package Principal;

import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sexo;

		System.out.println("digite 'm' para masculino ou 'f' para feminino");
		sexo = scan.nextLine();

		System.out.println((sexo.toUpperCase().charAt(0)) == 'M' ? "MASCULINO"
				: (sexo.toUpperCase().charAt(0)) == 'F' ? "FEMININO" : "Sexo invalido");
		//toUpperCase() muda o caracter para maiusculo e charAt() pega o caracter na posição desejada

	}

}
