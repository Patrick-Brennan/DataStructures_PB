package codingBat;

public class repeatEnd {

	public String repeatEnd(String str, int n) {
	    StringBuffer result = new StringBuffer();
	    String end = str.substring(str.length() - n);
	      
	    for(int i = 0; i < n; i++)
	        result.append(end);
	                
	    return result.toString();
	}
}
