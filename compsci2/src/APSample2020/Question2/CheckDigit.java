package APSample2020.Question2;

public class CheckDigit
{
/** Returns the check digit for num
* Precondition: The number of digits in num is between one and six, inclusive.
* num >= 0
*/
public static int getCheck(int num)
{ 
return 2;	
/* implementation not shown */ 
}
/** Returns true if numWithCheckDigit is valid, or false otherwise,
* as described in part (a)
* Precondition: The number of digits in numWithCheckDigit is
* between two and seven, inclusive.
* numWithCheckDigit >= 0
*/
public static boolean isValid(int numWithCheckDigit)
{
	int cDigit;
	int num;
	String strNum= String.valueOf(numWithCheckDigit);
	cDigit=Integer.parseInt(strNum.substring(strNum.length()-1));
	num=Integer.parseInt(strNum.substring(0,strNum.length()-2));
	
	if(cDigit==getCheck(num))
	{
		return true;
	}
	else
	{
		return false;
	}
}
}