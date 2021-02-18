package quiz2_Q1;

public class App {

	public static void main(String[] args) {
		// should return true
		System.out.println(checkForPalindrome("abccba"));
		// should return true
		System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
		// should return true
		System.out.println(checkForPalindrome("I did, did I?"));
		// should return false
		System.out.println(checkForPalindrome("hello"));
		// should return true
		System.out.println(checkForPalindrome("Don't nod"));
		// should return true
		System.out.println(checkForPalindrome("Racecar"));
		// should return false
		System.out.println(checkForPalindrome("Donkey Kong"));
	}
	
	public static boolean checkForPalindrome(String str) {
		// returns True if the string is palindrome
		str = str.toLowerCase().replaceAll("\\W", "");
		int n = str.length();
	    for( int i = 0; i < n/2; i++ )
	        if (str.charAt(i) != str.charAt(n-i-1)) return false;
	    return true;
	}
}
