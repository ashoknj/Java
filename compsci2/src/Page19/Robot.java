package Page19;

public class Robot {
private int[] hall= {1,1,2,2};
private int pos=1;
private boolean facingRight=true;

private boolean forwardMoveBlocked()
{
	if(pos==(hall.length)-1 && facingRight==true) 
	{
		return true;
	}
	else if(pos==0 && facingRight==false) 
	{
		return true;
	}
	else
	{
		return false;
	}
}
public void move()
{
	if(hall[pos]>0)
	{
		hall[pos]=hall[pos]-1;
		
	}
	if(hall[pos]==0 && forwardMoveBlocked())
	{
		facingRight=!facingRight;
	}
	else if(hall[pos]==0 && !forwardMoveBlocked())
	{
		if(facingRight)
		pos++;
		else
		pos--;
	}
	
}
public int clearHall()
{
	int movecount=0;
	while(!hallIsClear())
	{
		move();
		movecount++;
		System.out.println("After move : "+ movecount);
		showHall();
			
	}
	return movecount;
}
public boolean hallIsClear()
{
	boolean clear=true;
	for(int j=0;j<hall.length;j++)
	{
		if(hall[j]!=0)
		{
			clear=false;
			break;
		}
	}
	return clear;
}


public void showHall()
{
	
	for(int j=0;j<hall.length;j++)
	{
		System.out.print(hall[j]);
	}
	System.out.print(" - Position : "+ pos +"  -Right Direction : "+facingRight);
	System.out.println();
}
}