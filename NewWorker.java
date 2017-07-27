/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/09/20
 * PURPOSE: Practice with inheritance
 */

public class NewWorker extends Person {
	
	private static int howManyWorkers = 0;
	private int workerNumber;
	private Name workerName;
	private MyDate dateJoiningCompany;
	private NewWorker supervisor;
	private double salary;
	
	public NewWorker( String name, String date, double salary ) {
		this(name, date);
		this.salary = salary;
	}
	
	public NewWorker( String name, String date ) {
		super(name);
		workerName = new Name(name);
		dateJoiningCompany = new MyDate(date);
		this.salary = 0.0;
		howManyWorkers++;
		workerNumber = howManyWorkers;
	}
	
	public NewWorker ( String name ) {
		super(name);
	}
	
	public String toString3 () {
		return super.toString2();
	}
	
	public double getSalary() {
		return salary;
	}
	
	public static int getHowManyWorkers ( ) {
		
		return howManyWorkers;
	}
	
	public void setSalary( double salary ) {
		
		this.salary = salary;
	}
	
	public void setSupervisor ( NewWorker supervisor ) { //the Supervisior name is at position w1[1]
	
		this.supervisor = supervisor;
	}

	public Name getSupervisorName () {
		if (supervisor != null) {
			return (supervisor.workerName);
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