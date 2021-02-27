package exerciciosAula2;

import javax.swing.JOptionPane;

public class exercicio_02 {

	public static void main(String[] args) {
		//Faça um programa que receba 3 notas
		// calcule e mostre a média aritimética entre elas
		float n1,n2, n3,media;
		n1 = Float.valueOf(JOptionPane.showInputDialog("Número 1: "));
		n2 = Float.valueOf(JOptionPane.showInputDialog("Número 2: "));
		n3 = Float.valueOf(JOptionPane.showInputDialog("Número 3: "));
		
		
		media = (n1+n2+n3)/3;
		JOptionPane.showMessageDialog(null, "A média dos números é: " + media);

	}

}
