package Page28;

import java.util.ArrayList;

public class Digits {

private ArrayList<Integer> digitList=new ArrayList<Integer>();
public Digits(int num)
{
	String numStr=String.valueOf(num);
	for(int j=0;j<numStr.length();j++)
	{
		//System.out.println(Integer.parseInt(numStr.substring(1,2)));
		//System.out.println(numStr.length());
		
		digitList.add(Integer.parseInt(numStr.substring(j,j+1)));
	}
}
public boolean isStrictlyIncresing()
{
	boolean status=true;
	for(int i=1;i<digitList.size();i++)
	{
		if((digitList.get(i)-digitList.get(i-1))<1)
		{
			status=false;
			break;
		}
	}
	return status;
}


}
