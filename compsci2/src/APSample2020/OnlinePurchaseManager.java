package APSample2020;

import java.util.ArrayList;

public class OnlinePurchaseManager
{

	/** An ArrayList of purchased Gizmo objects, instantiated in the constructor. */

	private ArrayList<Gizmo> purchases;

/** Returns the number of purchased Gizmo objects that are electronic and are
* manufactured by maker, as described in part (a).
*/
public int countElectronicsByMaker(String maker)
{ /* to be implemented in part (a) */ 
	int totalCount=0;
	for(Gizmo g:purchases)
	{
		if(g.getMaker().equals(maker))
		{
			if(g.isElectronic())
			{
				totalCount++;
			}
			
		}
	}
	return totalCount;
}

/** Returns true if any pair of adjacent purchased Gizmo objects are equivalent, and
* false otherwise, as described in part (b).
*/
public boolean hasAdjacentEqualPair()
{ /* to be implemented in part (b) */

	boolean itemFound=false;
	
	for(int j=0;j<purchases.size();j++)
	{
		if(j>1)
		{
		if(purchases.get(j).equals(purchases.get(j-1)))
		{
			itemFound=true;
		}
		}
	}
	
	
	return itemFound;
}

public Object getCheapestGizmoByMaker(String maker)
{
	int leastItemIndex=0;
	//Write the logic here to return the least price for the maker passed in the parameter by calling Gizmo class method getPrice();
	//This will return the Gizmo record as an object;
	return purchases.get(leastItemIndex);
}

}
// There may be instance variables, constructors, and methods not shown.