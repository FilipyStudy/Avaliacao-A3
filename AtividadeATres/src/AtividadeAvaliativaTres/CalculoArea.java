package AtividadeAvaliativaTres;
import java.util.Scanner;

public class CalculoArea {
	public static void main(String[] args) {
		double hp, lp, ha, la, qntdAzulejos;
		Scanner input = new Scanner(System.in);
		System.out.println("Todos os valores devem ser inseridos em M (metros) e separados por vírgula (,)");
		//Lê valor em M da altura da parede
		System.out.println("Insira abaixo o valor da altura da parede:");
		hp = input.nextDouble();
		//Lê valor em M da largura da parede
		System.out.println("Insira abaixo o valor da largura da parede:");
		lp = input.nextDouble();
		//Lê em M o valor da altura do azulejo
		System.out.println("Insira abaixo o valor da altura do azulejo:");
		ha = input.nextDouble();
		//Lê em M o valor da largura do azulejo
		System.out.println("Insira abaixo o valor da largura do azulejo");
		la = input.nextDouble();
		//Calcula quantidade dos azulejos
		qntdAzulejos = (hp * lp) / (ha * la);
		//Exibe resultado final
		System.out.printf("A quantidade de azulejos necessária será: %.2f %n", qntdAzulejos);
		//Fecha o Scanner
		input.close();
	}
}
