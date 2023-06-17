package AtividadeAvaliativaTres;

public class GestaoConta {
	//definição de variáveis usadas pelas operações contidas nesta classe.
	private String nomeConta = "Sem nome", 
			agencia = "0000", 
			dataDeAbertura = "00/00/0000";
	private int numero = 00000;
	private double saldo = 0.00;
	
	//Construtor padrão
	public GestaoConta() {}
	
	//Construtor com atributos.
	public GestaoConta(String nomeConta, String agencia, String dataDeAbertura, int numero, double saldo) {
		this.nomeConta = nomeConta;
		this.agencia = agencia;
		this.dataDeAbertura = dataDeAbertura;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//método para sacar valores da conta, retorna um valor boolean de acordo com resultado.
	public boolean sacaValor(double valor) {
		if(saldo - valor <= 0)
			return false;
		else {
			saldo -= valor;
			return true;
		}
	}
	
	//método para depositar valores na conta, retorna um valor boolean de acordo com o resultado.
	public boolean depositaValor (double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		else
			return false;
	}
	
	//método para calcular o rendimento da conta com a porcentagem de 10% como foi proposto no exercício.
	public double calcRendimento() {
		return saldo * 0.1;
	}
	
	//método para calcular o rendimento por juro composto de acordo com os parâmetros fornecidos para a classe.
	public double calcRendimentoComposto (int meses, float taxa) {
		float taxaJuro = taxa / 100;
		double saldoFinal = saldo * (Math.pow((1 + taxaJuro), meses));
		return saldoFinal;
	}
	public String recuperaDadosParaImpressao () {
		String finalMessage = String.format("Nome do usuário: %s%n", nomeConta) +
							  String.format("Agência: %s%n", agencia) +
							  String.format("Data de Abertura: %s%n", dataDeAbertura) +
							  String.format("Número da conta: %d%n", numero) +
							  String.format("Saldo %.2f", saldo);
		return finalMessage;
	}
}
