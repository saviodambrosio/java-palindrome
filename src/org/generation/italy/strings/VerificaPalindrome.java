package org.generation.italy.strings;
import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		
		//chiedo all'utente di inserire una parola
		
		System.out.println("Inserisci una parola");
		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String reverseWord = "";
		
		for (int i = word.length()-1; i >=0; i--) { 
			char c = word.charAt(i);
			reverseWord += c;
		}
		
		if (word.equals(reverseWord)) {
			System.out.println("La parola contiene il seguente numero di caratteri: " + word.length());
			System.out.println("La parola che hai inserito � palindroma.");
		}
		
		else { 
			System.out.println("La parola contiene il seguente numero di caratteri: " + word.length());
			System.out.println("La parola che hai inserito non � palindroma.");
		}
		
			
       scan.close();
	}

}
