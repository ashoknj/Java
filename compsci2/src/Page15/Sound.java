package Page15;
public class Sound {

	private int[] samples={0,0,0,0,40,-17,-2300,37,-4000,2100};
	public int[] newsamples;
	public int limitAmplitude(int limit)
	{
		System.out.println("Limit is : " + limit);
		int counter=0;
		for(int i=0;i<samples.length;i++)
		{	
			if(Math.abs(samples[i])>limit)
			{
				if(samples[i]>=0)
				{
					samples[i]=limit;
				}
				else
				{
					samples[i]=-limit;
				}
				counter++;
			}
		}
		return counter;
	}
	
	public void showList()
	{
		System.out.println("Here's the List:");
		
		for(int i=0;i<samples.length;i++)
		{
			System.out.println(samples[i]);
		}
		
	}
	public void trimSilenceFromBeginning()
	{
		System.out.println("Trimming Starting..");
		
		int silenceCounter=0;
		
		for(int i=0;i<samples.length;i++)
		{
			if(samples[i]==0)
			{
				silenceCounter++;
			}
			else
			{
				i=samples.length;
			}
						
		}
		
		int[] newsamples=new int[(samples.length)-silenceCounter];
		for(int i=0;i<newsamples.length;i++)
		{
			newsamples[i]=samples[i+silenceCounter];
		}
		System.out.println("Trimming end..");
		
		System.out.println("Here's the new List:");
		
		for(int i=0;i<newsamples.length;i++)
		{
			System.out.println(newsamples[i]);
		}
	}
	
	
	
	}

