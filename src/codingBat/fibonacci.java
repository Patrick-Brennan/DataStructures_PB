package codingBat;

public class fibonacci {
	
	public int fibonacci(int n) {
		  if (n == 1) return 1;
		  if (n == 0) return 0;
		  return fibonacci(n-1) + fibonacci(n-2);
		}

//	or

//	public int fibonacci(int n) {
//		  	if(n <= 1)
//		        return n;
		          
//		    return fibonacci(n-1) + fibonacci(n-2);
//	}

}