package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static boolean esVocal (char car) {
		boolean es_vocal = false;
		
		if ((car == 'a') || (car == 'e') || (car == 'i') || (car == 'o') || (car == 'u')) {
			es_vocal = true;
		}
		es_vocal = false;
		return es_vocal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String frase = "";
		int contadorVocales = 0;
		System.out.println("holaaaa!");

		System.out.println("Por favor, escriba una frase:");
		frase = sc.nextLine();
		for (int i=0; i<frase.length(); i++) {
			if (esVocal(frase.charAt(i)));
			contadorVocales ++;
		}
		System.out.println("El número de vocales es: " + contadorVocales);


		sc.close();
		System.out.println("Bye!");
	}
}








