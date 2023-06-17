package AtividadeAvaliativaTres;
import java.util.Scanner;
public class ConversorTemp {

	public static void main(String[] args) {
		int opcao;
		Scanner input = new Scanner(System.in);


		while(true) {
			System.out.printf("Insira abaixo uma opção de conversão:%n" +
					"1 - Celsius para Fahrenheit%n" +
					"2 - Fahrenheint para Celsius%n" +
					"3 - Sair%n");
			opcao = input.nextInt();
			if (opcao == 1) {
				double tempEntrada,
				tempSaida;
				System.out.println("Insira abaixo a temperatura inicial:");
				tempEntrada = input.nextDouble();
				tempSaida = tempEntrada  * 1.8 + 32;
				System.out.printf("Temperatura inicial em Celsius: %.2f%n" +
						"Temperatura final em Fahrenheit: %.2f%n", tempEntrada, tempSaida);
			}
			else if (opcao == 2) {
				double tempEntrada,
				tempSaida;
				System.out.println("Insira abaixo a temperatura inicial:");
				tempEntrada = input.nextDouble();
				tempSaida = (tempEntrada - 32) / 1.8;
				System.out.printf("Temperatura inicial em Fahrenheit: %.2f%n" +
						"Temperatura final em Celsius: %.2f%n", tempEntrada, tempSaida);
			}
			else if (opcao == 3) {
				break;
			}
			else
				System.out.println("Insira uma opção válida!");
		}
	}

}
