package Page7;


import java.util.concurrent.ThreadLocalRandom;

public class TokenPass {
	private int[] board;
	private int currentPlayer;
public TokenPass(int playerCount)
{
	board=new int[playerCount];
	currentPlayer=ThreadLocalRandom.current().nextInt(0,playerCount-1);
	for(int j=0;j<board.length;j++)
	{
		board[j]=ThreadLocalRandom.current().nextInt(1,10);
	}
}
public void showPlayerTokens()
{
	for(int j=0;j<board.length;j++)
	{
	System.out.println(board[j]);
	}
	System.out.println("Current Player position is : " +currentPlayer);
	
}
public void distributeCurrentPlayerTokens()
{
	int totalTokens=board[currentPlayer];
	board[currentPlayer]=0;
	int nextPlayePosition=currentPlayer+1;
	while(totalTokens>0)
	{
		if(nextPlayePosition==board.length)
		{
			nextPlayePosition=0;
		}
		board[nextPlayePosition]=board[nextPlayePosition]+1;
		nextPlayePosition++;
		totalTokens--;
	}
		
}

}
