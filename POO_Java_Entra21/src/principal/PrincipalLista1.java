package principal;

import entidade.Conta_principalLista1;

public class PrincipalLista1 {

/*		Desenvolva uma aplicação (uma classe PrincipalLista1, com método main) que efetue as seguintes operações:
		• Crie uma conta chamada “conta1”, com agência 123-7, conta 12345-6 e saldo inicial de 300;
		• Efetue um saque de 250 e mostre o valor sacado na tela;
		• Efetue outro saque de 300 e mostre o valor sacado na tela;
		• Faça um depósito de 200;
		• Faça um rendimento de 0.5%;
		• Faça um rendimento de 0,8%;
		• Mostre o valor do saldo atual na tela.
*/
	
	public static void main(String[] args) {
		
		double valorParaSacar = 250;
		
		//Desenvolva uma aplicação (uma classe PrincipalLista1, com método main) que efetue as seguintes operações:
		//Crie uma conta chamada “conta1”, com agência 123-7, conta 12345-6 e saldo inicial de 300.
		Conta_principalLista1 conta1 = new Conta_principalLista1("123-7", "12345-6", 300);
		System.out.println("Saldo da conta: R$" + conta1.getSaldoConta());
		
		System.out.println("Solicitado o saque de R$" + valorParaSacar);
		
		//Efetue um saque de 250 e mostre o valor sacado na tela.
		double valorSacadoDeFato = conta1.sacar(valorParaSacar);
		System.out.println("Sacado R$" + valorSacadoDeFato);
		System.out.println("Saldo da conta: R$" + conta1.getSaldoConta());
		
		//Faça um depósito de 200.
		System.out.println("Solicitado o depósito de R$200");
		conta1.depositar(200);
		System.out.println("Saldo da conta: R$" + conta1.getSaldoConta());
		
		//Efetue outro saque de 300 e mostre o valor sacado na tela.
		System.out.println("Solicitado o saque de R$300");
		System.out.println("Sacado R$" + conta1.sacar(300));
		System.out.println("Saldo da conta: R$" + conta1.getSaldoConta());

		//Faça um depósito de 200.
		System.out.println("Solicitado o depósito de R$200");
		conta1.depositar(200);
		System.out.println("Saldo da conta: R$" + conta1.getSaldoConta());
	
		//Faça um rendimento de 0.5%.
		System.out.println("Solicitado o rendimento de 0.5%");
		conta1.efetuarRendimento(0.5);
		System.out.println("Saldo da conta: R$" + conta1.getSaldoConta());
	
		//Faça um rendimento de 0.8%.
		System.out.println("Solicitado o rendimento de 0.8%");
		conta1.efetuarRendimento(0.8);
		System.out.println("Saldo da conta: R$" + conta1.getSaldoConta());

		//Mostre o valor do saldo atual na tela.
		System.out.println("Saldo da conta: R$" + conta1.getSaldoConta());
	}
}