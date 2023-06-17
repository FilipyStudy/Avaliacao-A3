package AtividadeAvaliativaTres;
import java.util.Scanner;

public class SomaMatrizes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int ordemMatriz;
		System.out.println("Insira o tamanho das matrizes logo abaixo:");
		ordemMatriz = leitor.nextInt();
		int [][] matrizA = new int[ordemMatriz][ordemMatriz];
		int [][] matrizB = new int[ordemMatriz][ordemMatriz];
		int [][] matrizC = new int[ordemMatriz][ordemMatriz];
		for(int i = 0; i < 2; i++) {
			for(int y = 0; y < ordemMatriz; y++) {
				for(int x = 0; x < ordemMatriz; x++) {
					int valorEntrada;
					System.out.printf("Insira o valor da %dª linha, %dª coluna da %dª matriz: ",y + 1, x + 1, i + 1);
					valorEntrada = leitor.nextInt();
					if(i == 0)
						matrizA[y][x] = valorEntrada;
					else
						matrizB[y][x] = valorEntrada;
				}
			}
		}
		for(int y = 0; y < ordemMatriz; y++) {
			for(int x = 0; x < ordemMatriz; x++) {
				matrizC[y][x] = matrizA[y][x] + matrizB[y][x];
			}
		}
		System.out.println("Matriz resultado:");
		for(int i = 0; i < ordemMatriz; i++) {
			System.out.printf("%d coluna\t", i + 1);
		}
		System.out.println("");
		for(int y = 0; y < ordemMatriz; y++) {
			for(int x = 0; x < ordemMatriz; x++) {
				System.out.printf("%d\t\t", matrizC[y][x]);
			}
			System.out.println("");
		}
	}

}
