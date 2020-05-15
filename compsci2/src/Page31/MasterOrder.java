package Page31;

import java.util.ArrayList;
import java.util.Iterator; 

public class MasterOrder {

	private ArrayList<CookieOrder> orders;
	public MasterOrder()
	{
		orders=new ArrayList<CookieOrder>();
	}
	public void addOrder(CookieOrder theOrder)
	{
		orders.add(theOrder);
	}
	public int getTotalBoxes()
	{
		int sum=0;
		for(int i=0;i<orders.size();i++)
		{
		sum=sum+orders.get(i).getNumBoxes();
		}
		return sum;
	}
	
	public int removeVariety(String cookieVar)
	{
	int totalBoxes=0;
	/*
	Iterator<CookieOrder> itr=orders.Iterator();
	while(itr.hasNext())
	{
		Object element=itr.next();
		if(((CookieOrder)element).getVariety().equals(cookieVar))
		{
			totalBoxes=totalBoxes+((CookieOrder)element).getNumBoxes();
			itr.remove();
		}
	}
	*/
	return totalBoxes;
	
	}
}
