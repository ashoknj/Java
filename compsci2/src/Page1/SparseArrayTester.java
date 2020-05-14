package Page1;

public class SparseArrayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SparseArrayEntry sae=new SparseArrayEntry(0,0,10);
		SparseArray sa=new SparseArray();
		sa.addItem(sae);
		System.out.println(sa.getValueAt(1,1));
				
	}

}
