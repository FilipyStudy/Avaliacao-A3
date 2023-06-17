package AtividadeAvaliativaTres;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		int numeroRandomico,
		tentativa;
		Random randomizer = new Random();
		numeroRandomico = randomizer.nextInt(100);
		Scanner leitor = new Scanner(System.in);
		System.out.printf("Bem vindo ao jogo da adivinhação!%n");

		while(true) {
			System.out.println("Insira um número de 0 a 100: ");
			tentativa = leitor.nextInt();
			if (tentativa != numeroRandomico && tentativa < numeroRandomico) {
				System.out.println("Você errou! O número é um pouco maior.");
			}
			else if (tentativa != numeroRandomico && tentativa > numeroRandomico) {
				System.out.println("Você errou! O número é um pouco menor.");
			}
			else {
				System.out.println("Você ganhou!");
				System.out.printf("O número é: %d%n", numeroRandomico);
				break;
			}
		}
	}

}
