package execiciciosaula3;

import javax.swing.JOptionPane;

public class estruturaCondicional {

	public static void main(String[] args) {
		int num;
		num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um número: "));
		if(num > 0) {
			if (num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "O número é par");
			}else {
				JOptionPane.showMessageDialog(null, "O número é par");
			}
		}
		else if(num < 0) {
			JOptionPane.showMessageDialog(null, "O número é nulo");
		}
		else {
			JOptionPane.showMessageDialog(null, "O número é negativo");
		}
	}

}
