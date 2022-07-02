package entidade;

public class Conta_principalLista1 {

	private String numeroAgencia;
	private String numeroConta;
	private double saldoConta;
	

	//Contrutores da classe Conta_principalLista1
	public Conta_principalLista1() {
		super(); //A superclasse da Conta � 'object'
	}
	
	public Conta_principalLista1(String numeroAgencia, String numeroConta, double saldoConta) {
		super(); //A superclasse da Conta � 'object'
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
	
	//M�todo - sacar();
	//Defina um m�todo chamado �sacar�, que receba como argumento o valor a ser sacado da conta.
	//Este m�todo dever� verificar se existe saldo. Caso o saldo seja insuficiente, o m�todo dever� retornar apenas o valor que tem na conta.
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

	//M�todo - depositar();
	//Defina um m�todo chamado �depositar�, que receba como argumento o valor a ser depositado. Este valor dever� ser acrescentado ao saldo da conta.
	public void depositar(double valorDeposito) { //M�todo VOID n�o tem RETURN
		this.saldoConta += valorDeposito;
	}

	//M�todo - efetuarRendimento();
	//Defina um m�todo chamado �efetuarRendimento�. O m�todo dever� receber o percentual como argumento e acrescentar na conta o percentual recebido.
	public void efetuarRendimento(double percentualRendimento) {
		double indiceRendimento = percentualRendimento / 100;
		this.saldoConta = saldoConta * (1 + indiceRendimento);
	}
}