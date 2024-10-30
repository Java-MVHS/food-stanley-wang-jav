//stanly wang oct 25 2024

/*main that runs everything 
 * */
public class FoodTester
{
	public static void main (String [] args){
		Food	food1	=	new	Food	("baked",	"banana",	"muffins");
		food1.printLines();
		food1.printForSale();
		Food	food2	=	new	Food	("fried",	"yam",	"fritters");
		food2.printForSale();
		Pizza	pizza	=	new	Pizza	("pepperoni");
		pizza.printForSale();
		DeepDishPizza	pizza2	=	new	DeepDishPizza	("beef");
		pizza2.printForSale();
		DeepDishPizza	pizza3	=	new	DeepDishPizza	("beef","DeepDishPizza");
		pizza2.printForSale();
		food1.printLines();
	} 	
	
	
	

}
