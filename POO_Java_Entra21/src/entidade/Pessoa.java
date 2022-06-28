package entidade;

public class Pessoa {

	// Atributos
	private String cpf;
	private String nome;
	private String dataNascimento;
	private double alturaEmMetros;
	private char sexo;
	
	//Construtores
	public Pessoa (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	// Métodos
	public int calcularIdade(int anoAtual) {
		int idade = 0;

		// Assumir dd/MM/yyyy
		String anoNascimento = this.dataNascimento.substring(6);
		idade = anoAtual - Integer.valueOf(anoNascimento);

		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// Métodos Getters e Setters
	public String getNome() {
		return this.nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAlturaEmMetros() {
		return alturaEmMetros;
	}

	public void setAlturaEmMetros(double alturaEmMetros) {
		this.alturaEmMetros = alturaEmMetros;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}