package Page24;

public class Trail {
	
	int[] markers = {140, 150, 145, 130, 140, 145, 130, 155, 175, 100, 125, 90, 140}; 
	
	
	public boolean isLevelTrailSegment(int start, int end)
	{
		int minelevation = markers[start]; 
		int maxelevation = markers[start] ; 
		
		for(int i= start; i<= end; i++)
		{
			if(markers[i] > maxelevation)
			{
				maxelevation = markers[i]; 
			}
			if (markers[i] < minelevation)
			{
				minelevation = markers[i]; 
			}
		}
		
		if((maxelevation-minelevation) <= 10 )
		{
			return true;
		}
		else 
		{
			return false; 
		}
		
		
	}
	public boolean isDifficult()
	{
		int counter=0;
		for (int j=1;j<markers.length;j++)
		{
			if(Math.abs(markers[j]-markers[j-1])>=30)
			{
				counter++;
			}
		}
		if(counter>=3)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}

}