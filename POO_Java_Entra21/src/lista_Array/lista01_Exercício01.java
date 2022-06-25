package lista_Array;

public class lista01_Exerc�cio01 {

	public static void main(String[] args) {
		
/* 1 - CRIE UM ARRAY DE INTEIROS DE TAMANHO 10.
 * IMPLEMENTE UM PROGRAMA QUE DEFINA E ESCREVA O ARRAY,
 * BEM COMO A QUANTIDADE DE ELEMENTOS ARMAZENADOS
 * NESTE ARRAY QUE S�O PARES.
 * */
		
		// Criar o Array de 10 inteiros.
		int[] numeros = new int[10];
		int i = 0;
		int quantidadeNumerosPares = 0;
		int quantidadeNumerosImpares = 0;
		
		// Preencher os valores (s� 3 para o exemplo n�o ficar t�o grande, o restante o programa entende '0').
		numeros[0] = 2;
		numeros[1] = 11;
		numeros[5] = 25;

		// Mostrar na tela do console somente os valores pares.
		// Percorrer todo o Array, e se cada item for PAR, mostrar o item na tela.
		for (i = 0; i < numeros.length; i++) { // Sempre � o FOR para 'percorrer o Array'
			if (numeros[i] != 0 && numeros[i] % 2 == 0) {
				quantidadeNumerosPares++;
				System.out.println(numeros[i]);
			} else {
				System.out.println("N�mero " + numeros[i] + " � IMPAR");
				quantidadeNumerosImpares++;
			}
		}
			
		// Mostrar a quantidade de elementos PARES no Array.
		System.out.println("A quantidade de elementos PARES no Array � " + quantidadeNumerosPares);
		System.out.println("A quantidade de elementos IMPARES no Array � " + quantidadeNumerosImpares);
		
	}

}
