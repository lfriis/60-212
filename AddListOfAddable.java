/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/11/08
 * DESCRIPTION: Class that adds the list of elements together to get the resultant time
 */
public class AddListOfAddable {
	
		public static Addable addList(Addable list[],int numberOfElementsInList){
			Time timeReturned;
			Time[] listTime = (Time[])list;
		
			int tempMinutes = 0;
			int totalMinutes = 0;
			int totalHours = 0;
		
		for(int i = 0; i < numberOfElementsInList; i++)
		{
			tempMinutes += 60*listTime[i].getHours() + listTime[i].getMinutes(); 
		}

		totalHours = (tempMinutes / 60);
		totalMinutes = (tempMinutes % 60);
		
		timeReturned = new Time(totalHours + " hours " + totalMinutes + " minutes ");
		
		return timeReturned;
	}
}
