package AtividadeAvaliativaTres;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		int qntdAlunos,
			ctrlVetor = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de alunos na turma: ");
		qntdAlunos = leitor.nextInt();
		double[][] notasAlunos = new double[qntdAlunos][4];
		double [] vetorNotas = new double[qntdAlunos * 3];
		double mediaTurma = 0;
		
		for(int i = 0; i < qntdAlunos; i++) { //Cria um índice para cada aluno.
			notasAlunos[i][0] = i + 1;
		}
		for (int y = 0; y < qntdAlunos; y++) { //Adiciona as notas de cada aluno.
			for(int x = 1; x < 4; x++) {
				System.out.printf("Insira a %dª nota do %dº aluno: ",x , y + 1);
				notasAlunos[y][x] = leitor.nextDouble();
			}
		}
		for(int y = 0; y < qntdAlunos; y++) { //Armazena notas em um vetor
			double mediaAluno = 0;
			for(int x = 1; x < 4; x++) {
				mediaAluno += notasAlunos[y][x];
				vetorNotas[ctrlVetor] = notasAlunos[y][x];
				ctrlVetor++;
			}
			mediaAluno = mediaAluno / 3;
			System.out.printf("Média do %dº aluno: %.2f%n", y + 1, mediaAluno);
		}
		for(double i: vetorNotas) { //Armazena valores do vetor na varíavel 'mediaTurma'
			mediaTurma += i;
		}
		mediaTurma = mediaTurma / vetorNotas.length;
		System.out.printf("Média da turma: %.2f%n", mediaTurma);
	}

}
