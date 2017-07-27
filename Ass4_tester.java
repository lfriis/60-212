import java.util.StringTokenizer;

public class Ass4_tester {
	
	public static void main(String args[]){ 
	
		StringTokenizer aStringTokenizer = new StringTokenizer("Hello? ? how are you.? I am fine. ", " .?");
		System.out.println("Now processing the following string:\nHello? ? how are you.? I am fine. ");
		while (aStringTokenizer.countTokens() > 0){ 
			System.out.println("countTokens returns " + aStringTokenizer. countTokens() +
					"; nextToken returns " + aStringTokenizer. nextToken());  
		}
		System.out.println("********************************************");
		System.out.println("Now processing the following string:\n7.2 + 18 * 53 -8  ");
		aStringTokenizer = new StringTokenizer("7.2 + 18 * 53 -8 ", "* .+-/");
		while (aStringTokenizer.countTokens() > 0){ 
			System.out.println("countTokens returns " + aStringTokenizer. countTokens() +
					"; nextToken returns " + aStringTokenizer. nextToken());
		} 
	} 
}
