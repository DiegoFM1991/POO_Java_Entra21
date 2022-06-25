package lista_Array;

public class lista01_Exercício03 {

	public static void main(String[] args) {
		
/* 3 - CRIE UM ARRAY DE INTEIROS DE TAMANHO 10.
 * IMPLEMENTE UM PROGRAMA QUE DEFINA E ESCREVA O ARRAY,
 * BEM COMO A MÉDIA ARITMÉTICA DOS ELEMENTOS ARMAZENADOS 
 * NESTE ARRAY QUE SÃO ÍMPARES.
 */
		
		// Criar o Array de 10 inteiros.
		int[] numeros = new int[10];
		int i = 0;
		int somaImpar = 0;
		int quantidadeNumerosImpares = 0;
		
		// Preencher os valores (só 3 para o exemplo não ficar tão grande, o restante o programa entende '0').
		numeros[0] = 2;
		numeros[1] = 11;
		numeros[5] = 25;

		// Mostrar na tela do console a média dos números IMPARES.
		// Percorrer todo o Array e somar todos os itens IMPARES, jogando na variável somaImpar.
		for (i = 0; i < numeros.length; i++) { // Sempre é o FOR para 'percorrer o Array'
			if (numeros[i] != 0 && numeros[i] % 2 == 1) {
				somaImpar = somaImpar + numeros[i];
				quantidadeNumerosImpares++; // Para poder cálcular a média.
			} 
		}
		
		// Mostrar a média dos elementos IMPARES no Array.
		System.out.println("A média dos elementos IMPARES é " + (somaImpar / quantidadeNumerosImpares));
				
	}
}