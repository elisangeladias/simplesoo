package estudocondicional;

import javax.swing.JOptionPane;

public class mostramaior {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
		int numero1 = Integer.parseInt(valor1);
		int numero2 = Integer.parseInt(valor2);
		
		if (valor1.equals(valor2)) {
			
			JOptionPane.showMessageDialog(null, "Os números não podem ser iguais");
			
			valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
			valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
			
		}
		
		if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "O número 1 é o maior");
						
		} else {
			JOptionPane.showMessageDialog(null, "O número 2 é o maior");
		}

	}

}
