/** Síntese
* Objetivo: armazenar primeiro nome de uma pessoa
* Entrada: primeiro nome
* Saída: confirmação com nome cadastrado
*/

package aula2;
import java.util.Scanner; // importa classe (biblioteca)
public class Nome {
	
	public static void main(String[] args) {
		// Declarações
		String primeiroNome; // variável do tipo String
		Scanner ler = new Scanner(System.in);
		// Instruções
		System.out.print("Digite o primeiro nome:\n");
		primeiroNome = ler.next();
		System.out.println("\n\nNome:\t" + primeiroNome);
		} // termina o método main()

}  // encerra a descrição da classe