package entradaDados;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class entradaDados {

	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		
		System.out.println("Entre com seu nome: ");
		String nome = meuScanner.nextLine();
		
		System.out.println("Entre com sua idade: ");
		int idade = meuScanner.nextInt();
		
		System.out.println("Seu nome é: "+ nome);
		System.out.println("Sua idade é: " + idade + "anos");
		
		nome = JOptionPane.showInputDialog("Entre com seu nome: ");
		JOptionPane.showMessageDialog(null,"Olá " + nome + "!!!")
		idade = Integer.valueOf(JOptionPane.showInputDialog("Entre com sua idade: "));
		
	}

}
