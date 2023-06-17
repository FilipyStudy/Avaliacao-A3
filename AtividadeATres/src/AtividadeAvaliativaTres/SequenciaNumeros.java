package AtividadeAvaliativaTres;
import java.util.Scanner;

public class SequenciaNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int qntdPares = 0,
			qntdImpares = 0;
		System.out.println("Insira um valor inteiro para a contagem de pares e ímpares. Digite um valor negativo para sair.");
		while(true) {
			int numero;
			System.out.println("Insira o próximo número inteiro: ");
			numero = leitor.nextInt();
			if(numero % 2 == 0)
				qntdPares++;
			else if(numero < 0) {
				break;
			}
			else
				qntdImpares++;
		}
		System.out.printf("Quantidade de números pares: %d%n" +
						  "Quantidade de números ímpares: %d%n", qntdPares, qntdImpares);
	}

}
