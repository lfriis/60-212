/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/11/08
 * DESCRIPITION: Tester for lab7
 */
public class Lab7_tester {

	public static void main(String[] args) {

		Time t[] = new Time[5];
		Time result;
		String timeStringArray[] = new String[5];
		timeStringArray[0] = "  2 hours   45 minutes   ";
		timeStringArray[1] = "3 hours       04  minutes";
		timeStringArray[2] = "2 hours       35 minutes   ";
	
		for (int i = 0; i < 3; i++){
			t[i] = new Time(timeStringArray[i]);
		}
			t[3] = (Time) t[0].add(t[1]);// These two lines are to help you test  
			t[4] = (Time) t[0].add(t[2]);// your definition of the add method
		for (int i = 0; i < timeStringArray.length; i++){
			System.out.println("t[" + i + "] = " + t[i]);
			}
			/*
			 * Result expected:
			 * t[0] = 2:45
			 * t[1] = 3:04
			 * t[2] = 2:35
			 * t[3] = 5:49
			 * t[4] = 5:20 
			 * 
			 * Now we want to test your definition of AddListOfAddable
			 * we want to add the three time periods in t[0], t[1] and t[2]
			 */
			result = (Time) AddListOfAddable.addList(t, 3); // We need the cast because we are downcasting
			                                                // from Addable to Time
			System.out.println("result = " + result);
			/* 
			 * Expected result:
			 * result = 8:24
			 */
	}
}