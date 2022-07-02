package entidade;

public class Conta_principalLista1 {

	private String numeroAgencia;
	private String numeroConta;
	private double saldoConta;
	

	//Contrutores da classe Conta_principalLista1
	public Conta_principalLista1() {
		super(); //A superclasse da Conta é 'object'
	}
	
	public Conta_principalLista1(String numeroAgencia, String numeroConta, double saldoConta) {
		super(); //A superclasse da Conta é 'object'
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
	}

	//Getters and Setters
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	
	//Método - sacar();
	//Defina um método chamado “sacar”, que receba como argumento o valor a ser sacado da conta.
	//Este método deverá verificar se existe saldo. Caso o saldo seja insuficiente, o método deverá retornar apenas o valor que tem na conta.
	public double sacar(double valorSaque) {
		double valorSaqueEfetivo = 0;
			if (this.saldoConta >= valorSaque) {
				valorSaqueEfetivo = valorSaque;
			} else {
				valorSaqueEfetivo = this.saldoConta;
			}
		this.saldoConta = this.saldoConta - valorSaqueEfetivo; // Descontando o valor do saque do saldo inicial.
		return valorSaqueEfetivo;
	}

	//Método - depositar();
	//Defina um método chamado “depositar”, que receba como argumento o valor a ser depositado. Este valor deverá ser acrescentado ao saldo da conta.
	public void depositar(double valorDeposito) { //Método VOID não tem RETURN
		this.saldoConta += valorDeposito;
	}

	//Método - efetuarRendimento();
	//Defina um método chamado “efetuarRendimento”. O método deverá receber o percentual como argumento e acrescentar na conta o percentual recebido.
	public void efetuarRendimento(double percentualRendimento) {
		double indiceRendimento = percentualRendimento / 100;
		this.saldoConta = saldoConta * (1 + indiceRendimento);
	}
}