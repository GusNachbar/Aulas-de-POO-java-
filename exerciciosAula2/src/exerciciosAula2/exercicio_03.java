package exerciciosAula2;

import javax.swing.JOptionPane;

public class exercicio_03 {

	public static void main(String[] args) {
		//Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.
		float n1, n2,n3, p1, p2,p3, mediaPond;
		n1 = Float.valueOf(JOptionPane.showInputDialog("Nota 1: "));
		p1 = Float.valueOf(JOptionPane.showInputDialog("Peso 1: "));
		
		n2 = Float.valueOf(JOptionPane.showInputDialog("Nota 2: "));
		p2 = Float.valueOf(JOptionPane.showInputDialog("Peso 2: "));
		
		n3 = Float.valueOf(JOptionPane.showInputDialog("Nota 3: "));
		p3 = Float.valueOf(JOptionPane.showInputDialog("Peso 3: "));
		
		mediaPond = (n1*p1)+(n2*p2)+ (n3*p3)/ (p1+p2+p3);
		JOptionPane.showMessageDialog(null, "A média ponderada é: " + mediaPond);
		
	}

}
