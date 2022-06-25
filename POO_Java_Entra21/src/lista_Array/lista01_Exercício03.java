package lista_Array;

public class lista01_Exerc�cio03 {

	public static void main(String[] args) {
		
/* 3 - CRIE UM ARRAY DE INTEIROS DE TAMANHO 10.
 * IMPLEMENTE UM PROGRAMA QUE DEFINA E ESCREVA O ARRAY,
 * BEM COMO A M�DIA ARITM�TICA DOS ELEMENTOS ARMAZENADOS 
 * NESTE ARRAY QUE S�O �MPARES.
 */
		
		// Criar o Array de 10 inteiros.
		int[] numeros = new int[10];
		int i = 0;
		int somaImpar = 0;
		int quantidadeNumerosImpares = 0;
		
		// Preencher os valores (s� 3 para o exemplo n�o ficar t�o grande, o restante o programa entende '0').
		numeros[0] = 2;
		numeros[1] = 11;
		numeros[5] = 25;

		// Mostrar na tela do console a m�dia dos n�meros IMPARES.
		// Percorrer todo o Array e somar todos os itens IMPARES, jogando na vari�vel somaImpar.
		for (i = 0; i < numeros.length; i++) { // Sempre � o FOR para 'percorrer o Array'
			if (numeros[i] != 0 && numeros[i] % 2 == 1) {
				somaImpar = somaImpar + numeros[i];
				quantidadeNumerosImpares++; // Para poder c�lcular a m�dia.
			} 
		}
		
		// Mostrar a m�dia dos elementos IMPARES no Array.
		System.out.println("A m�dia dos elementos IMPARES � " + (somaImpar / quantidadeNumerosImpares));
				
	}
}