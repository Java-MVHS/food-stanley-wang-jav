public class Pizza extends Food
{
	public Pizza (String ingredient)
	{
		super("baked",ingredient,"pizza");
	}
	public Pizza (String method, String ingredient ,String name)
	{
		super(method,ingredient,name);
		
	}	
	public Pizza (String ingredient ,String nameln1)
	{
		super("baked",ingredient,nameln1);
	}
}
