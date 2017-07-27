/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/11/10
 * DESCRIPTION: Practice with inheritance and abstract classes
 */
package assign7;

class MeatFish extends Food { //extending the abstract class

    double fat;

    public MeatFish(String name, double price, double fat) {
        super(name, price);
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
}
