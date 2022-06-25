package lista_Array;

public class lista01_Exercício02 {

	public static void main(String[] args) {
		
/* 2 - CRIE UM ARRAY DE INTEIROS DE TAMANHO 10.
 * IMPLEMENTE UM PROGRAMA QUE DEFINA E ESCREVA O ARRAY,
 * BEM COMO A SOMA DOS ELEMENTOS ARMAZENADOS NESTE ARRAY.
 */
		
		// Criar o Array de 10 inteiros.
		int[] numeros = new int[10];
		int i = 0;
		int somaPar = 0;
				
		// Preencher os valores (só 3 para o exemplo não ficar tão grande, o restante o programa entende '0').
		numeros[0] = 2;
		numeros[1] = 11;
		numeros[5] = 22;

		// Mostrar na tela do console a soma dos valores PARES.
		// Percorrer todo o Array, e se cada item for PAR, mostrar o item na tela.
		for (i = 0; i < numeros.length; i++) { // Sempre é o FOR para 'percorrer o Array'
			if (numeros[i] != 0 && numeros[i] % 2 == 0) {
				somaPar = somaPar + numeros[i];
			}
		}
			
		// Mostrar a soma dos elementos PARES no Array.
		System.out.println("A soma de elementos PARES no Array é " + somaPar);
				
	}
}