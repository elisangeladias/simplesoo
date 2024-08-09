package estudocondicional;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class validarsenha {

	public static void main(String[] args) {
		
		// para pedir a senha abrindo uma janelinha com a biblioteca Java Swing
		String senha = JOptionPane.showInputDialog("Digite sua senha");
		
		// para pedir a senha no pelo console da IDE usando a Classe Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua senha: \n"); 
		String senhaSc = sc.nextLine(); 
		
		if(senha.equals("abcd") && senhaSc.equals("abcd")) {
			
			// para escrever no console
			System.out.println("ACESSO PERMITIDO"); 
			
			// para mostrat a mensagem em uma janelinha
			JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
		}else {
			// para escrever no console
						System.out.println("ACESSO NEGADO"); 
						
						// para mostrat a mensagem em uma janelinha
						JOptionPane.showMessageDialog(null, "ACESSO NEGADO");
		}
		
		

	}

}
