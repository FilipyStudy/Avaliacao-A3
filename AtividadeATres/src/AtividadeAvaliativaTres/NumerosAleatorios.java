package AtividadeAvaliativaTres;
import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int somaTotal = 0,
				contPares = 0,
				contImpares = 0;
		for(int i = 0; i <= 99; i++) {
			int numeroAleatorio = aleatorio.nextInt(256000);
			somaTotal += numeroAleatorio;
			if(numeroAleatorio % 2 == 0)
				contPares ++;
			else
				contImpares++;
			System.out.printf("Número Gerado: %d%n", numeroAleatorio);
		}

		System.out.printf("%nSoma de todos os números gerados: %d%n", somaTotal);
		System.out.printf("%nContage de quantos são números pares: %d%n", contPares);
		System.out.printf("%nContagem de quantos são ímpares: %d%n", contImpares);

	}

}
