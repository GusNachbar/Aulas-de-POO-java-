package execiciciosaula3;

import javax.swing.JOptionPane;

public class lacoWhile {

	public static void main(String[] args) {
		int num=0, i=0;
		while(num < 1 || num > 100) {
		num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um número: "));
		}
		while(i<11){
			System.out.println(num + " X " + i + " = " + (num*i));
			i++;
		}

	}

}
