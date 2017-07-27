/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/10/04
 * PURPOSE: To write a java classes and get practice with objects 
*/
import java.util.StringTokenizer;

public class Name {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name ( String Name ) { //string tokenizer class that parse's the names into name classes with ' ' as the delimiter
		
		StringTokenizer tokenizeName = new StringTokenizer(Name, " ");	
		firstName = tokenizeName.nextToken();
		if (tokenizeName.countTokens() == 2) {
			middleName = tokenizeName.nextToken();
			lastName = tokenizeName.nextToken();
		} else {
			lastName = tokenizeName.nextToken();
		}
	}

	public Name ( Name anotherName ) { //copy constructor that returns the new object of the same strings (First Middle Last)
		
		firstName = anotherName.firstName;
		middleName = anotherName.middleName;
		lastName= anotherName.lastName;
	}
	
	public void setName ( String firstName, String middleName, String lastName ) { //constructor that returns true if the name has no middle and false if it does
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
		
	public String toString () { //returns an object file with specific format LastName, FirstName Middle Init
			
		if ( middleName != null ) {
			return ( lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
		}	else {
				return ( lastName + ", " + firstName + ".");
			}	
	}
}