package AtividadeAvaliativaTres;
import java.lang.Integer;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Urna {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<Integer, String> candidatos= new HashMap<Integer, String>(); //Cadastro dos candidatos
		int votosValidos = 0, 
				votosBranco = 0, 
				numeroDeVotantes = 10,
				numeroDeVotos = 10;
		int[][] resultadoFinal = new int[5][2]; //Tabela com registro dos votos de cada candidato, primeira coluna armazena o número de cada condaditado
		//Segunda coluna armazena todos os votos de cada candidato.
		int [][] resultadoFinalSegundo = new int [2][2];
		int[][] maiorValor = new int [1][2], //Armazena na primeira coluna número do candidato e na segunda coluna quantidade de votos.
				segundoMaiorValor = new int[1][2];
		String vencedor; //armazena o nome do vencedor.
		boolean novaVotacao = false; //define se haverá outra votação.
		String messageFinal; //define mensagem final exibindo resultados.

		candidatos.put(1, "João");
		candidatos.put(2, "Maria");
		candidatos.put(3, "Madalena");
		candidatos.put(4, "Carlos");
		candidatos.put(5, "Lúcia");

		for(int i = 0; i < 5; i++) {
			resultadoFinal[i][0] = i + 1;
		}

		while(numeroDeVotantes != 0) { //Coleta votos válidos e votos em branco para cada candidato
			int voto;
			System.out.println("Insira abaixo o número do seu candidato: ");
			voto = input.nextInt();
			if(voto > 0 && voto < 6) {
				for(int number: candidatos.keySet()) {
					if(number == voto) {
						votosValidos += 1;
						resultadoFinal[voto - 1][1] += 1; //O valor de voto - 1 é sempre igual ao índice na matriz.
						numeroDeVotantes -= 1;
					}
				}
			}
			else if(voto == 0) {
				votosBranco += 1;
				numeroDeVotantes -= 1;
			}
			else
				System.out.println("Insira uma opção válida.");
		}

		maiorValor[0][1] = resultadoFinal[0][1]; //Define o valor padrão da matriz como sendo o primeiro da matriz de resultado da votação
		for(int y = 1; y < 5; y++) { //Define qual candidato obteve o maior número de votos;
			if (resultadoFinal[y][1] > maiorValor [0][1]) {
				maiorValor [0][1] = resultadoFinal[y][1];
				maiorValor [0][0] = resultadoFinal[y][0];
			}
		}
		for(int i = 0; i < 2; i++) {
			segundoMaiorValor[0][i] = 0;
		}

		for(int y = 0; y < 5; y++) {
			if (resultadoFinal[y][1] > segundoMaiorValor [0][1] && resultadoFinal[y][1] < maiorValor[0][1]) {
				segundoMaiorValor[0][1] = resultadoFinal[y][1];
				segundoMaiorValor[0][0] = resultadoFinal[y][0];
			}
		}
		System.out.println(maiorValor[0][1]);
		System.out.println(segundoMaiorValor[0][1]);

		if((double)maiorValor[0][1] / numeroDeVotos * 100 >= 50) {
			vencedor = candidatos.get(maiorValor[0][0]);
		}
		else {
			novaVotacao = true;
			resultadoFinalSegundo[0][0] = maiorValor [0][0];
			resultadoFinalSegundo[1][0] = segundoMaiorValor[0][0];
			resultadoFinalSegundo[0][1] = maiorValor[0][1];
			resultadoFinalSegundo[1][1] = segundoMaiorValor[0][1];
			votosBranco = 0;
			System.out.printf("Candidato: %s \tNúmero: %d%n" +
					"Candidato: %s \tNúmero: %d%n", candidatos.get(resultadoFinalSegundo[0][0]), resultadoFinalSegundo[0][1], 
					candidatos.get(resultadoFinalSegundo[1][0]), resultadoFinalSegundo[1][1]);

			resultadoFinalSegundo[0][1] = 0;
			resultadoFinalSegundo[1][1] = 0;

			while(numeroDeVotantes < numeroDeVotos) {
				int voto;
				System.out.println("Insira seu candidato:");
				voto = input.nextInt();
				if(voto == resultadoFinalSegundo[0][0]) {
					resultadoFinalSegundo [0][1] += 1;
					numeroDeVotantes++;
				}
				else if(voto == resultadoFinalSegundo[1][0]) {
					resultadoFinalSegundo[1][1] ++;
					numeroDeVotantes ++;
				}
				else if(voto == 0) {
					votosBranco ++;
					numeroDeVotantes ++;
				}
				else {
					System.out.println("Insira um valor válido");
				}
			}
			if (resultadoFinalSegundo[0][1] > resultadoFinalSegundo [1][1]) {
				vencedor = candidatos.get(resultadoFinalSegundo[0][0]);
			}
			else {
				vencedor = candidatos.get(resultadoFinalSegundo [1][0]);
			}
		}
		messageFinal = String.format("Número de votos totais: %s%n", numeroDeVotos)+
				String.format("Vencedor das eleições: %s%n", vencedor) +
				String.format("Número de votos do vencedor: %d%n", resultadoFinalSegundo[1][1]);
		if(novaVotacao) {
			System.out.println("Número de votos por candidato no primeiro turno:");
			for(int i = 1; i <= 5; i++) {
				String message = String.format("Candidato: %s \tNúmero: %d\t Quantidade de votos: %d%n", candidatos.get(i), i, resultadoFinal[i - 1][1]);
				System.out.println(message);
			}
			System.out.println("Número de votos por candidato no segundo turno:");
			for(int i = 1; i <= 2; i++) {
				String message = String.format("Candidato: %s\t Número: %d\t Quantidade de votos: %d%n", candidatos.get(resultadoFinalSegundo[i - 1][0]), resultadoFinalSegundo[i - 1][0], resultadoFinalSegundo[i - 1][1]);
				System.out.println(message);
			}
		}
		else {
			System.out.println("Número de votos por candidato no primeiro turno:");
			for(int i = 1; i <= 5; i++) {
				String message = String.format("Candidato: %s \tNúmero: %d\t Quantidade de votos: %d%n", candidatos.get(i), i, resultadoFinal[i - 1][1]);
				System.out.println(message);
			}
		}
		System.out.println(messageFinal);
	}
}