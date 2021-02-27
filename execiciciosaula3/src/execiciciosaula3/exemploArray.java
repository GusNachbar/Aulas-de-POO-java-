package execiciciosaula3;

import java.util.Random;

public class exemploArray {

	public static void main(String[] args) {
		
		Random randomico = new Random();
		// Array de inteiros ja declarando valores
		int[] inteiros = {2, 4, 6,8, 10, 12, 14, 16, 18};
		System.out.println("Array de inteiro:");
		for (int i=0; i < inteiros.length; i++) {
			System.out.println(inteiros[i]);
			
		}
		
		//Array de floats com tamanho definido
		float[] decimais = new float[5];
		
		/*decimais[0] = 1.2f;
		decimais[1] = 1.3f;
		decimais[2] = 1.4f;
		decimais[3] = 1.5f;
		decimais[4] = 1.6f;*/
		
		for (int i=0; i < decimais.length; i++) {
			decimais[i]= randomico.nextFloat()*10;
			System.out.println(decimais[i]);
		
		}
	}

}
