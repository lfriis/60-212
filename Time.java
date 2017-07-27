/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/11/08
 * DESCRIPTION: Practice working with class and interfaces
 */
import java.util.*;

	public class Time implements Addable {
		private int hours = 0;
		private int minutes = 0;
		private static int numberOfTimeObjects = 0;
		StringTokenizer myTokens;
		public Time(String timeString){
		
		/*
		* timeString gives a time period as “n hours m minutes” with any
		* number of spaces in before and after n and m.
		* Examples:
		* " 2 hours 45 minutes "
		* "3 hours 04 minutes"
		* "2 hours 35 minutes "
		*/
			String token;
			myTokens = new StringTokenizer(timeString, " ");
			token = myTokens.nextToken(); // This gives the number of
				   						  // hours as a string
			hours = Integer.parseInt(token);
			myTokens.nextToken();
			token = myTokens.nextToken(); // This gives the number of
										  // minutes as a string
			minutes = Integer.parseInt(token);
			myTokens.nextToken();
			numberOfTimeObjects++;
		}
	
		public String toString(){
			if (minutes < 10){
				return hours + ":0" + minutes ;
			} else {
				return hours + ":" + minutes ;
			}
		}
		
		public int getHours() {
			return this.hours;
		}
		
		public int getMinutes() {
			return this.minutes;
		}
		
		public Addable add(Addable x) {
			Time temp = (Time)x;
			return temp;	
		}
}