package Reverse;

import java.io.Console;

public class Main {

	public static void main(String[] args) {
		requestInputFromUser();
	}

	private static void requestInputFromUser() {
		Console console = System.console();

		System.out.println("Please enter a string to reverse:");
		String word = console.readLine();
		reverseWord(word);
	}

	private static void reverseWord(String word) {
		String returnedWord = new StringBuilder(word).reverse().toString();
		System.out.println("Returned word: " + returnedWord);
	}

}
