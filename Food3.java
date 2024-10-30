//stanly wang oct 25 2024

/*header food is a parent class pizza
 * the total cost is calculated and str is set to all of the output
*/


public class Food3
{
	protected String str;
	protected double totalc;//decard field variables
	
	public Food3 ()//inicialing 
	{
		str = new String("");
		totalc=0.0;
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int cost, int num)
	{	
		totalc = (double)cost * num/100;//calculate total money
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient + " will be sold for " + cost + " cents each. With " + num + " "
		+ name +"s,$" + String.format("%.2f",totalc) +" can be made";//total cost
	}

	public void printForSale()
	{
		System.out.println(str);//print string

	}
	public void printLines()
	{
		System.out.println("\n\n\n");//method for printing
	}
}






