package Page34;

public class WordPairListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"Ashok","suman","Kashvi","Ashok","Kashvi","Karan"};
		WordPairList wl=new WordPairList(str);
		System.out.println(wl.numMatches());
	}

}
