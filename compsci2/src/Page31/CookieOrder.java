package Page31;

public class CookieOrder {

	private String v;
	private int b;
	public CookieOrder(String variety,int numBoxes)
	{
		v=variety;
		b=numBoxes;
	}
	public String getVariety()
	{
		return v;
	}
	public int getNumBoxes()
	{
		return b;
	}
}
