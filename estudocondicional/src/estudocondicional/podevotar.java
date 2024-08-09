package estudocondicional;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class podevotar {

	public static void main(String[] args) {
		String anoNascimento = JOptionPane.showInputDialog("Digite seu ano de nascimento");
		int ano = Integer.parseInt(anoNascimento);
		Calendar cal = GregorianCalendar.getInstance();
		int podeVotar = cal.get(Calendar.YEAR) - ano;
		
		if(podeVotar >= 16 ) {
			
			JOptionPane.showMessageDialog(null, "Pode votar");
			
		} else
			JOptionPane.showMessageDialog(null, "Não pode votar");
		
		
		

	}

}
