package execiciciosaula3;

import java.util.Random;

public class exemploMatriz {

	public static void main(String[] args) {
		// Matriz de inteiros
		int[][] inteiros = {{1, 2, 3}, 
							{4, 6, 7}, 
							{22, 41, 33},
							};
		
		for(int l=0; l< inteiros.length; l++) {
			for(int c=0; c < inteiros.length; c++) {
				System.out.print(inteiros[l][c]);
				if (c < inteiros[l].length-1) {
					System.out.print(",\t");
				}
			}
		}System.out.println();
		
		System.out.println("Matriz de randomicos");
		Random randomico = new Random();
		float[][] numeros = new float [4][4];
		
		for(int l=0; l< numeros.length; l++) {
			for(int c=0; c < numeros.length; c++) {
				System.out.print(numeros[l][c]);
				if (c < numeros[l].length-1) {
					System.out.print(",\t");
				}
			}
		}System.out.println();
	}

}
