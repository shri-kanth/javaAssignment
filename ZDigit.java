package zAlgebra;

public class ZDigit 
{
	private int ZDigit;
	
	public ZDigit (char ch) throws IllegalArgumentException
	{
			if(ch != '0' && ( ch < 'A' || ch > 'Z') )
				throw new IllegalArgumentException("Invalid argument for ZDigit Constructor");
			
			if(ch == '0')
				ZDigit = 0;
			else
				ZDigit = ch-'A'+1;
	}
	
	public int getZDigit()
	{
		return ZDigit;
	}
	public char getZChar()
	{
		if(ZDigit == 0)
			return '0';
		else
			return (char)('A'+ZDigit-1);
	}
	
	public static char getZChar(ZDigit z)
	{
		if(z.ZDigit == 0)
			return '0';
		else
			return (char)('A'+z.ZDigit-1);
	}

}

