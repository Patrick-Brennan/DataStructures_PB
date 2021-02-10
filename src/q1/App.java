package q1;

import java.util.Scanner;

public class App {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter some text: ");
		String text = scanner.nextLine();
		System.out.println(sharp(text));
	}
	
	private static String sharp(String text) {
		if(text.length() <= 1) {
			return text;
		}
		return text.charAt(0) + "#" + sharp(text.substring(1));
	}
}
