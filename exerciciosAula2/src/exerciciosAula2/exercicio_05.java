package exerciciosAula2;

import javax.swing.JOptionPane;

public class exercicio_05 {

	public static void main(String[] args) {
		// Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.
		float salario, novoSalario, aumento;
		salario = Float.valueOf(JOptionPane.showInputDialog("Insira seu sálario: "));
		aumento = Float.valueOf(JOptionPane.showInputDialog("Insira o aumento: "));
		
		novoSalario = (salario * aumento) + salario;
		JOptionPane.showMessageDialog(null,"O seu novo sálario será de: " + novoSalario);
	
	}

}
