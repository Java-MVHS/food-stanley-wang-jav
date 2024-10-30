//stanly wang oct 25 2024

/*header pizza is a subclass of food and a parent class of deepdish pizza
 * it has 2 contructors on for deep pizza to send in parameter and on to send in stuff itself it sends
 * vareables into the contructor of food
*/
public class Pizza3 extends Food3
{
	public Pizza3 (String ingredient)
	{
		super("baked",ingredient,"pizza",250,8);//input 1 parameters send 5 parameters to food
	}
	public Pizza3 (String ingredient,String name)// for deep dish pizza
	{
		super("baked",ingredient,name,250,8);
	}
}
