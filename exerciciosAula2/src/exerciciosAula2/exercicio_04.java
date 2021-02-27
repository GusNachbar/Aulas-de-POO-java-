package exerciciosAula2;

import javax.swing.JOptionPane;

public class exercicio_04 {

	public static void main(String[] args) {
		// Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.
		Float salario,novoSalario;
		salario = Float.valueOf(JOptionPane.showInputDialog("Insira seu salário: ")); 
	
		novoSalario = (salario * 0.25f)+ salario;
		
		JOptionPane.showMessageDialog(null,"Seu salario com aumento de 25% é: " + novoSalario);
	}

}
