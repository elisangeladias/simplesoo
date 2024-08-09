package estudocondicional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class scannervalidacao {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int numero = 0;
	        boolean valid = false;

	        while (!valid) {
	            try {
	                System.out.print("Digite um n�mero inteiro: ");
	                numero = scanner.nextInt();
	                valid = true; // Se a entrada for um n�mero, a vari�vel valid ser� verdadeira e o loop ser� encerrado.
	            } catch (InputMismatchException e) {
	                System.out.println("Entrada inv�lida! Por favor, digite um n�mero v�lido.");
	                scanner.next(); // Limpa o buffer do scanner para evitar um loop infinito.
	            }
	        }

	        System.out.println("Voc� digitou o n�mero: " + numero);
	        scanner.close();
	 }

}
