package Page31;

public class MasterOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CookieOrder co=new CookieOrder("chocolate",5);
CookieOrder co1=new CookieOrder("vanilla",4);
CookieOrder co2=new CookieOrder("chocolate",3);
MasterOrder mo=new MasterOrder();
mo.addOrder(co);
mo.addOrder(co1);
mo.addOrder(co2);
System.out.println(mo.getTotalBoxes());
System.out.println(mo.removeVariety("chocolate"));
System.out.println(mo.getTotalBoxes());

	}

}
