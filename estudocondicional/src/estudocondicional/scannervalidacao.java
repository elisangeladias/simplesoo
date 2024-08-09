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
	                System.out.print("Digite um número inteiro: ");
	                numero = scanner.nextInt();
	                valid = true; // Se a entrada for um número, a variável valid será verdadeira e o loop será encerrado.
	            } catch (InputMismatchException e) {
	                System.out.println("Entrada inválida! Por favor, digite um número válido.");
	                scanner.next(); // Limpa o buffer do scanner para evitar um loop infinito.
	            }
	        }

	        System.out.println("Você digitou o número: " + numero);
	        scanner.close();
	 }

}
