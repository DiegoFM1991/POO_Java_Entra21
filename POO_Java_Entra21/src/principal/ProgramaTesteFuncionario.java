package principal;

import entidade.Funcionario;
import entidade.Gerente;

public class ProgramaTestaFuncionario {

	public static void main(String[] args) {
		Gerente gerenteDaFirma = new Gerente("Jo�o", 1000);
		Funcionario funcionarioPedro = new Funcionario("Pedro", 1000);

		System.out.println("O sal�rio do gerente " + gerenteDaFirma.getNome()
		+ " �: " + gerenteDaFirma.calcularPagamento());

		System.out.println("O sal�rio do funcion�rio " + funcionarioPedro.getNome()
		+ " �: " + funcionarioPedro.calcularPagamento());
	}
}