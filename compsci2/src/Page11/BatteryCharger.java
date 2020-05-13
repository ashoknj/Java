package Page11;

public class BatteryCharger {
	private int[] rateTable= {50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};
	
	public int getChargingCost(int startHour,int chargeTime)
	{
		int currentCost=0;
		int actualTime;
		for(int i=startHour;i<startHour+chargeTime;i++)
		{
				
				if(i>23)
				{
					if(i%23==0)
					{
						actualTime=23;
					}
					else
					{
						actualTime=(i%23)-1;
					}
				}
				else
				{
					actualTime=i;
				}
		
			currentCost=currentCost+rateTable[actualTime];
			
		}
				
		return currentCost;
	}
	public int getChargeStartTime(int chargeTime)
	{
		int[] chargingCost = new int[24];
		int startHour=0;
		for(int i=0;i<=23;i++)
		{
			
			chargingCost[i]=getChargingCost(i,chargeTime);
		}
		
		//To get the hour [time] for minimum cost
		
		int minValue = chargingCost[0]; 
	    for(int i=1;i<chargingCost.length;i++)
	    { 
	      if(chargingCost[i] < minValue)
	      { 
	        minValue = chargingCost[i];
	        startHour=i;
	      } 
	    } 
	    
		return startHour;
	}

}
