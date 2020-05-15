package Page34;

import java.util.ArrayList;

public class WordPairList {

	private ArrayList<WordPair> allPairs;
	public String output="";
public WordPairList(String[] words)
{
	output="";
	ArrayList<WordPair> allPairs=new ArrayList<WordPair>();
	for(int j=0;j<words.length-1;j++)
	{
		for(int i=j+1;i<words.length;i++)
		{
			allPairs.add(new WordPair(words[j],words[i]));
			if((i==words.length-1) && (j==words.length-2))
			{
			output=output+WordPair.finalWord;
			}
			else
			{
				output=output+WordPair.finalWord+",";
			}
		}
	}
	System.out.println(output);
}

public int numMatches()
{
	int counter=0;
	String[] wordBreak=output.split(",");
	for(int j=0;j<wordBreak.length;j++)
	{
		for(int i=j+1;i<wordBreak.length;i++)
		{

		//System.out.println(wordBreak[j] +" : "+wordBreak[i]);
			if(wordBreak[j].equals(wordBreak[i]))
					{
					counter++;
					}
		}
	}
	
	return counter;
}
}
