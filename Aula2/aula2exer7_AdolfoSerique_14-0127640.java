package pricipal;

import java.util.Scanner;

public class Senha {

	private String cadastro;

	public static void main(String[] args) {
		// Declaracoes
		final int MAXIMO = 9;
		int tentativas = 0;
		Senha cadastro1 = new Senha();

		// Instrucoes
		System.out.print(
				"Crie uma nova senha(não podendo ter menos de 3 caracteres, mais de 5 caracteres ou espacos em branco): ");
		cadastro1.cadastro = validaSenha();
		limpaTela(22);
		System.out.print("Digite a senha cadastrada: ");
		validaTentativas(cadastro1.cadastro, MAXIMO);
	}

	// Subprogramas

	public static void limpaTela(int i) {
		for (int linha = 1; linha <= i; linha++)
			System.out.println();
	}

	public static String leSenha() {
		// Declaracoes
		Scanner ler = new Scanner(System.in);

		// Instrucoes
		return (ler.nextLine());
	}

	public static int tamanhoSenha(String senha) {
		// Declaracoes
		int tamanho = 0;

		// Instrucoes
		tamanho = senha.length();
		return (tamanho);
	}

	public static String validaSenha() {
		// Declaracoes
		String senha;
		int tamanho = 0;

		// Instrucoes
		senha = leSenha();
		tamanho = tamanhoSenha(senha);

		for (int i = 0; i < tamanho; i++) {
			char caractere;

			while (tamanho < 3 || tamanho > 5) {
				System.out.println(
						"ERRO: A senha nao pode conter menos de 3 caracteres ou mais de 5 caracteres! Por favor, digite uma senha valida!");
				senha = leSenha();
				tamanho = tamanhoSenha(senha);
			}
			caractere = senha.charAt(i);
			if (caractere == ' ') {
				System.out.println(
						"ERRO: A senha nao pode conter espacos em branco! Por favor, digite uma senha valida!");
				senha = leSenha();
				tamanho = tamanhoSenha(senha);
				i = -1;
			}
		}
		return (senha);
	}

	public static int validaCadastro(String cadastro, final int MAX) {
		// Declaracoes
		String confere;
		char caractere1;
		char caractere2;
		int tamanho1 = 0;
		int tamanho2 = 0;
		int cont = 0;

		// Instrucoes
		confere = leSenha();
		tamanho1 = tamanhoSenha(confere);
		tamanho2 = tamanhoSenha(cadastro);

		for (int i = 0; i < tamanho2; i++) {
			while (tamanho1 != tamanho2) {
				System.out.println("ERRO: Senha nao corresponde! Por favor, digite a senha novamente! Restam "
						+ (MAX - cont - 1) + " tentativas para a autodestruicao!");
				confere = leSenha();
				tamanho1 = tamanhoSenha(confere);
				cont++;
				if ((MAX - cont - 1) == 0)
					return (-1);
			}

			caractere1 = confere.charAt(i);
			caractere2 = cadastro.charAt(i);

			if (caractere1 != caractere2 && (MAX - cont - 1) != 0) {
				System.out.println("\"ERRO: Senha nao corresponde! Por favor, digite a senha novamente! Restam "
						+ (MAX - cont - 1) + " tentativas para a autodestruicao!");
				confere = leSenha();
				tamanho1 = tamanhoSenha(confere);
				cont++;
				i = -1;
			}
			if (caractere1 == caractere2 && (MAX - cont - 1) == 0) {
				return (cont + 1);
			}
		}
		return (-1);
	}

	public static void validaTentativas(String cadastro, final int MAX) {
		// Declaracoes
		int tentativas = 0;
		// Instrucoes
		tentativas = validaCadastro(cadastro, MAX);
		if (tentativas == -1) {
			for (int segundos = 10; segundos > 0; segundos--) {
				System.out.println("O computador ira se autodestruir em " + segundos + " segundos");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			}
		}
		else {
			limpaTela(22);
			System.out.println("\t\t\t\tParabens! Voce digitou a senha corretamente!");
		}
	}
	
}