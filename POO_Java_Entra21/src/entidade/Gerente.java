package entidade;

public class Gerente extends Funcionario { //extends significa que 'Gerente' parte da classe 'Funcionáro'.

	private String setor;

	public Gerente(String nome, double salario, String setor) {
		super(nome, salario); // Puxou da superclasse.
		this.setor = setor; // Puxou desta classe, pois declaramos 'setor' aqui nesta classe.
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override // Muda os parâmetros gerais herdados das orientações (métodos) aos objetos específicos.
	public double calcularPagamento() {
		return super.calcularPagamento() + this.calcularComissao();
	}

	private double calcularComissao() {
		return this.getSalario() * 0.25;
	}
}