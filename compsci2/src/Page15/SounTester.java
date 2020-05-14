package Page15;

public class SounTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sound s=new Sound();
// Part a
	System.out.println("Here's the before change List:");
	s.showList();
	System.out.println("Total items changed : "+s.limitAmplitude(20));
	System.out.println("Here's the update List after limit applied:");
	s.showList();
//
	
	// Part b
//	s.showList();
	//s.trimSilenceFromBeginning();
	


	}

}
