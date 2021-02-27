package execiciciosaula3;

import javax.swing.JOptionPane;

public class lacoDoWhile {

	public static void main(String[] args) {
		int num, i=0;
		do {
		num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um número: "));
		}while(num<1);
		do {
			System.out.println(num + " X " + i + " = " + (num*i));
			i++;
		}while(i<11);

	}

}
