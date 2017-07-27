/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/09/20
 * PURPOSE: To solve a cryptarithmetic puzzle using nested loops
 */

public class Puzzle {

	public static void main(String[] args) {

		for (int T = 0 ; T <= 10; T++){ 			//each for loop is assigning a specific value that satisfies the if conditions 
			for (int G = 0 ; G <= 10; G++){
				for (int O = 0 ; O <= 10; O++){
					for (int D = 0 ; D <= 10; D++){
	
						if ( ((1000*G) - (400*T) + (66*O) + (1*D) == 0) &&			//Checking if it is a solution
							((T != G) && (T != O) && (T != D) && (O != G) && (D != G) && (D != O)) ) { //Ensuring that each digit is assigned
																									   //a different value
							System.out.println("T = " + T);
							System.out.println("G = " + G);							//system out statements showing final values for TGOD
							System.out.println("O = " + O);
							System.out.println("D = " + D);
							System.out.println("" + T + O + O + "+" + T + O + O + "+" + T + O + O + "+" + T + O + O  +"=" + G + O + O + D);
						}
					}
				}
			}
		}	
	}
}