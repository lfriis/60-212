/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/11/10
 * DESCRIPTION: Practice with inheritance and abstract classes
 */
package assign7;

public 	abstract class Food{
	    String name;
	    double price;

	    public Food(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	}
