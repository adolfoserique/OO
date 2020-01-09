package aula2;

import java.text.DecimalFormat; //formataÃ§Ã£o de nÃºmeros
import java.util.Scanner; //entrada de dados
import java.util.InputMismatchException; //tratamento de execeÃ§Ãµes


public class Main{
	public static void main(String[] args) {
		
		//declaraÃ§Ãµes
		final int MAXIMO = 20;
		int contadorMulheres = 0;
		float somaPesosHomens = 0F;
		float maiorPeso = 0F;
		float menorPeso = 1000F;
		
		//instÃ¢ncias
		Scanner scannerSexo = new Scanner(System.in);
		Scanner scannerPeso = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("0.0");
		
		for(int i = 0; i < MAXIMO; i++) { //repete o cadastro para todas as 20 pessoas
			limparTela();
			//declaraÃ§Ãµes
			String sexo;
			float peso;
			boolean entradaInvalida = true;
			
			
			do { //o loop se manterÃ¡ atÃ© o usuÃ¡rio preencher corretamente todos os dados.
				try {
					System.out.print("Informe o sexo da " + (i+1) + " pessoa (MASCULINO ou FEMININO): ");
					sexo = scannerSexo.nextLine();
					
					if(sexo.equals("FEMININO")){
						contadorMulheres++;
					}else if(!sexo.equals("MASCULINO")){
						System.out.println("Entrada InvÃ¡lida. ComeÃ§e novamente.");
						continue;
					}	
					
					System.out.print("Informe o peso da " + (i+1) + " pessoa (formato xx,x): ");
					peso = scannerPeso.nextFloat();
					
					if(peso > maiorPeso)
						maiorPeso = peso;
					
					if(peso < menorPeso)
						menorPeso = peso;
					
					if(sexo.equals("MASCULINO"))
						somaPesosHomens = somaPesosHomens + peso;
					
					
					entradaInvalida = false;
					
				}catch(InputMismatchException e) {
					System.out.println("Entrada InvÃ¡lida. ComeÃ§e novamente");
					scannerPeso.next(); //evita que o loop rode infinitamente apÃ³s uma execption.
					
				}
				
							
			}while(entradaInvalida);		
		}
		
		scannerPeso.close();
		scannerSexo.close();
		
		limparTela();
		System.out.println("O maior peso Ã©: " + mascara.format(maiorPeso) + "kg.");
		System.out.println("O menor peso Ã©: " + mascara.format(menorPeso) + "kg.");
		System.out.println("O nÃºmero de mulheres Ã©: " + contadorMulheres);
		if(MAXIMO-contadorMulheres == 0) { //evita divisÃ£o por zero. 
			System.out.println("Nenhum homem registrado para realizar mÃ©dia dos pesos");
			
		}else {
			System.out.println("A mÃ©dia do peso dos homens Ã©: " + mascara.format(somaPesosHomens/(MAXIMO-contadorMulheres))+ "kg.");
		}
		
	}
	
	public static void limparTela() {
		for(int i = 0; i < 15; i++) {
			System.out.print("\n");
		}
	}
}