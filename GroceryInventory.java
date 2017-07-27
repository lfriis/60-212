/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/11/10
 * DESCRIPTION: Practice with inheritance and abstract classes
 */
package assign7;
import java.util.ArrayList;
import java.util.List;

	class GroceryInventroy{

	    public static void main(String[] args) {

	        List<Food> foodList = new ArrayList<Food>();

	        Food apple = new Fruit("apple",120,3.12);
	        Food bread = new Carbohydrate("bread",30,2.1);
	        Food chicken = new MeatFish("chicken",90,0.32);

	        foodList.add(apple);
	        foodList.add(bread);
	        foodList.add(chicken);

	        double totalPrice = 0, totalFat = 0, totalSugar = 0;

	        for(Food f : foodList){
	            totalPrice = totalPrice + f.getPrice();
	            if(f instanceof Fruit) {
	                totalSugar = totalSugar + ((Fruit) f).getSugar();
	            }
	            if(f instanceof Carbohydrate) {
	                totalSugar = totalSugar + ((Carbohydrate) f).getSugar();
	            }
	            if(f instanceof MeatFish) {
	                totalFat = totalFat + ((MeatFish) f).getFat();
	            }
	        }
	        System.out.println("Price : $"+ totalPrice);
	        System.out.println("Fat : "+ totalFat + "gm");
	        System.out.println("Sugar : "+ totalSugar + "gm");
	    }
	}