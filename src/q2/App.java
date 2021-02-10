package q2;

import java.util.Scanner;

public class App {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		char[][] keys = { { 'a', 'b', 'd', 'b' }, { 'b', 'a', 'c', 'd' }, { 'a', 'b', 'c', 'd' } };
		
		for (int col =0; col< keys[0].length; col++)
		System.out.println("Student ", col +1 " had the following answers: ", keys);
		
		// I want more time!
	}
}