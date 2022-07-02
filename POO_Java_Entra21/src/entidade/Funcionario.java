package entidade;

public class Funcionario {

	private String nome;
	private String dataNascimento;
	private double salarioBruto;
	private String cpf;
	private String dataAdmiss�o;
	
//Contrutores - vazio e completo
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, String dataNascimento, double salarioBruto, String cpf, String dataAdmiss�o) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salarioBruto = salarioBruto;
		this.cpf = cpf;
		this.dataAdmiss�o = dataAdmiss�o;
	}
	
// M�todos
	
//M�todo CALCULAR IDADE
/*	public int calcularIdade(int anoAtual) {
		int idade = 0;
		// Assumir dd/MM/yyyy
		String anoNascimento = this.dataNascimento.substring(6);
		idade = anoAtual - Integer.valueOf(anoNascimento);
		return idade;
	}
*/
	
	public double calcularPagamento() {
		return this.getSalarioBruto() - this.calcularDesconto();
	}

	private double calcularDesconto() {
		return this.getSalarioBruto() * 0.11;
	}

	
//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataAdmiss�o() {
		return dataAdmiss�o;
	}

	public void setDataAdmiss�o(String dataAdmiss�o) {
		this.dataAdmiss�o = dataAdmiss�o;
	}
}