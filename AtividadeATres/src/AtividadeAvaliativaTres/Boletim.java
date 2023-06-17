package AtividadeAvaliativaTres;
import java.util.Scanner;
public class Boletim {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		float [] notas = new float [5];
		float media = 0;
		
		System.out.println("Insira abaixo o nome completo do aluno: ");
		name = input.nextLine();
		
		for(int i = 0; i <= 4; i++) {
			System.out.printf("Insira a %dª nota do aluno %s: ", i + 1, name);
			notas[i] = input.nextFloat();
		}
		for(float i: notas) {
			media += i;
		}
		media /= 5;
		if(media >= 60) {
			System.out.printf("O aluno: %s%nFoi aprovado com a nota: %.2f", name, media);
		}
		else if (media >= 40 && media < 60) {
			System.out.printf("O aluno: %s%nFicou em recuperação com a nota: %.2f", name, media);
		}
		else {
			System.out.printf("O aluno: %s%nFoi reprovado com a nota: %.2f", name, media);
		}
	}

}
