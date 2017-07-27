/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/09/20
 * PURPOSE: Use a StringTokenizer to take apart a string and separate into integers and calculate the average grade
 */
import java.util.*;
import java.util.StringTokenizer;

public class Grades {

	public static void main(String[] args) {
		Scanner keyboard;
		String inputString; 
		
		    String nextGradeInfo;
		    /*
		     *  When processing a grade information such as "(24   /25)  " or "   (91)  "
		     *  we get either two components such as "24" and "25" or one component such as "91".
		     *  Variable firstComponent will contain the first component such as "24" or "91"
		     *  Variable secondComponent will contain the second component if applicable 
		     *  such as "25".
		     */ 
		    String firstComponent; 
		    String secondComponent;
		    double sumOfAllGrades = 0.0; // If the input is  "   (   24/25  ) ;( 40/ 80); (91) ; (22/ 25  )",
	        // this will contain the sum of (24.0/25) * 100 +  (40.0/80) * 100 + (22.0/25) * 100 + 91.0 = 325.0
	        double aGrade; // This will contain a grade out of 100. Corresponding to "24/25" This will have a value (24.0/25) * 100 = 96.0
	        double averageGrade;// This will contain the result to be determined.
		    StringTokenizer gradeTokens; // This will create tokens such as "     (   24/25  )",
		                                 // "( 40/ 80)", " (91) " and " (22/ 25  )"
		    StringTokenizer gradeComponents; // This will create tokens such as "24" and "25" from "     (   24/25  )" ,
	                                           // "91" from " (91) "
		    int numGrades; // This will contain how many grades we have. For instance
		                   // "   (   24/25  ) ;( 40/ 80); (91) ; (22/ 25  )" has 4 grades
		    
		    keyboard = new Scanner(System.in);
		    System.out.println("Type your input");
		    inputString = keyboard.nextLine();
		    gradeTokens = new StringTokenizer(inputString, ";"); 
		    numGrades = gradeTokens.countTokens();
		    
		    for (int index = 0; index < numGrades; index++){
		    	nextGradeInfo = gradeTokens.nextToken();
		    	gradeComponents = new StringTokenizer(nextGradeInfo, " (/)");
		    	if (gradeComponents.countTokens() == 2){// For instance in string "   (   24/25  )", we will have 2 tokens "24" and "25"
		    		firstComponent = gradeComponents.nextToken();
		    		secondComponent = gradeComponents.nextToken();
		    		aGrade = (100.0 * Integer.parseInt(firstComponent))/Integer.parseInt(secondComponent);
		    	} else {// It has only one component
		    		firstComponent = gradeComponents.nextToken();
		    		aGrade = Integer.parseInt(firstComponent);
		    	}
		    	sumOfAllGrades += aGrade;
		    } 
		    averageGrade = sumOfAllGrades/numGrades;
		    System.out.println("The average grade is " + averageGrade);
		}

	}