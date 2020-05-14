package Page1;
import java.util.ArrayList;
public class SparseArray {
private int numRows;
private int numCols;
private ArrayList<SparseArrayEntry> entries;
	
	public SparseArray()
	{	

		entries= new ArrayList<SparseArrayEntry>();
	}
	
	public int getNumCols()
	{
		return numCols;
	}
	
	public int getNumRows()
	{
		return numRows;
	}
	
	public void addItem(SparseArrayEntry item)
	{
		entries.add(item);
	}
	public int getValueAt(int row,int col)
	{
		int actualValue=0;
		for(SparseArrayEntry se:entries)
		{
			if(se.getRow()==row && se.getCol()==col)
			{
				actualValue=se.getValue();
			}
		}
		return actualValue;
	}
	
}
