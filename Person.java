/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/10/25
 * DESCRIPTION: Practice working with inheritance and subclasses
 */

public class Person {
	
	private Name personName;
	public Person spouse;
	
	public Person ( String fullName ) {
		this.personName = new Name(fullName);	
	}
	
	public void setSpouse ( Person spouse ) {
		this.spouse = spouse;
	}
	
	public String toString2 () {
		if (spouse != null) {
			return "Name is " + personName + " " + "Married to " + spouse.personName;
		} else {
			return "Name is " + personName;
		}	
	}
	
	public double getFamilyIncome () {
		double personSalary = 0.0;
		double spouseSalary = 0.0;
		
		if ( spouse instanceof NewWorker ) {	
			NewWorker w;
			w = (NewWorker) spouse;
			spouseSalary = w.getSalary();
		} 
		if ( this instanceof NewWorker) {
			NewWorker p;
			p = (NewWorker) this;
			personSalary = p.getSalary();
		}
		return (spouseSalary + personSalary);
	}
}