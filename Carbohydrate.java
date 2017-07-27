/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/11/10
 * DESCRIPTION: Practice with inheritance and abstract classes
 */
package assign7;

class Carbohydrate extends Food{

    double sugar;

    public Carbohydrate(String name, double price, double sugar) {
        super(name, price);
        this.sugar = sugar;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
}