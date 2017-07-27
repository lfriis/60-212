/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/10/04
 * PURPOSE: To write a java class that is tested with a Java App
*/
import java.util.StringTokenizer;

public class MyDate {	//class to represent date DD/MM/YYYY
	
	int day;
	int month;
	int year;

	public MyDate ( MyDate anotherDate ) { //copy constructor that returns a new object with the same values of MM/DD/YYYY
		
		this.day = anotherDate.day;		
		this.month = anotherDate.month;
		this.year = anotherDate.year;
	}
	
	public MyDate ( String MyDate ) { //string tokenizer class that parse's the date input with '/' as the delimiter
		
		StringTokenizer tokenizeDate = new StringTokenizer(MyDate, "/");	
		this.day = Integer.parseInt (tokenizeDate.nextToken());
		this.month = Integer.parseInt (tokenizeDate.nextToken());
		this.year = Integer.parseInt (tokenizeDate.nextToken());
	}
	
	public String toString () { //returns the date in the form of a string
		
		String months[] = {"January", "February", "March", "April", "May",
						   "June", "July", "August", "September", "October",
						   "November", "December"};
		
		if (year % 100 < 10) {
			return ( months[month-1] + " " + day +  ", '0" + year % 100 );
		
		} else {
			return ( months[month-1] + " " + day +  ", '" + year % 100 );
		
		}
	}
	
	public boolean lessThan ( MyDate randomDate ){ //if a date is stored, its checked with the object and return true if the argument is satisfied
		
		if  (year > randomDate.year) {
			return false;
			
		}	else if  (year < randomDate.year) {
				return true;
				
			}	 else if (month < randomDate.month) {
					return true;
					
				}	else if (month > randomDate.month) {
						return false;
						
					}	else if (day < randomDate.day ) {
							return true;
							
						} 	else {
							
								return false;					
							}
	}

	public boolean equals (MyDate anotherDate){ //returns true if the day, month, and year correspond to the day
	
		if ((this.day == anotherDate.day) &&
			(this.month == anotherDate.month) &&
			(this.year == anotherDate.year)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
				MyDate dateArray1[], dateArray2[], anotherDate;
				int index1, index2;

				dateArray1 = new MyDate[3]; // Create an array of MyDate
				dateArray1[0] = new MyDate("26/05/1999"); // Create three elements of dataArray1 by creating three objects of class MyDate
				dateArray1[1] = new MyDate("08/06/1994");
				dateArray1[2] = new MyDate("15/03/2000");

				dateArray2 = new MyDate[3];
				dateArray2[0] = new MyDate("25/05/1999"); // Create three elements of dataArray1 by creating three objects of class MyDate
				dateArray2[1] = new MyDate("25/01/2000");
				dateArray2[2] = new MyDate("26/05/1999"); 

				for (index2 = 0; index2 < dateArray2.length;index2++){   
					for (index1 = 0; index1 < dateArray1.length; index1++){   
						if (dateArray2[index2].lessThan(dateArray1[index1])) // Compare each elements in dataArray1 with each element of dateArray2
							System.out.println(dateArray2[index2].toString() 
									+ " is less than " 
									+ dateArray1[index1].toString());
						else System.out.println(dateArray2[index2].toString() 
								+ " is not less than " 
								+ dateArray1[index1].toString() + " \n");
					} 
				}
				
				if (dateArray2[2].equals(dateArray1[0])){
					System.out.println(dateArray2[2].toString() 
							+ " is the same date as " 
							+ dateArray1[0].toString());
					
				} else {
					System.out.println("Cannot happen!!");
				}
				
				if (dateArray2[2].equals(dateArray1[1])){
					System.out.println(dateArray2[2].toString() 
							+ " is not the same date as " 
							+ dateArray1[0].toString() + "\n are you sure this is OK?");
					
				} else {
					System.out.println("You got it right!!");
				}
				
				anotherDate = new MyDate(dateArray2[1]);
				if (dateArray2[1].equals(anotherDate)){
					System.out.println(dateArray2[1] 
							+ " is the same date as " 
							+ anotherDate);
					
				} else {
					System.out.println("Are you sure???");
				}		
			}
		}
