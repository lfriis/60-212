/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/10/24
 * DESCRIPTION: Practice with arrays
 */

public class Worker { 
	
	private static int howManyWorkers = 0;
	private int workerNumber;
	private Name workerName;
	private MyDate dateJoiningCompany;
	private double salary;
	private Worker supervisor;

	public Worker( String name, String date, double salary ) {
	
		this(name, date);
		this.salary = salary;
	}
	
	public Worker( String name, String date ) {
	
		workerName = new Name(name);
		dateJoiningCompany = new MyDate(date);
		this.salary = 0.0;
		howManyWorkers++;
		workerNumber = howManyWorkers;
	}

	public static int getHowManyWorkers ( ) {
		
		return howManyWorkers;
	}
	
	public void setSalary( double salary ) {
		
		this.salary = salary;
	}
	
	public void setSupervisor ( Worker supervisor ) { //the Supervisior name is at position w1[1]
	
		this.supervisor = supervisor;
	}

	public Name getSupervisorName () {
		
		if (supervisor != null) {
			return (new Name(supervisor.workerName));
		} else {
			return null;
		}
	}
	
	public String toString() {
		
		String nameString;
		
		if (supervisor != null) {
				nameString = "Worker Number " + workerNumber + " " + workerName.toString() + ".\n" + "Joined the company on: "
				+ dateJoiningCompany.toString() + "\n" + "Name of supervisor: " + getSupervisorName().toString();
		} else {
				nameString = "Worker Number " + workerNumber + " " + workerName.toString() + ".\n" + "Joined the company on: "
				+ dateJoiningCompany.toString() + "has no supervisor";
		}
		return nameString;
	}
}