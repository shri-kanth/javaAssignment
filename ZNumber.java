package zAlgebra;

import java.util.*;

public class ZNumber 
{
	private List<ZDigit> ZDigitList;
	private long ZNumber;
	
	public ZNumber(List<ZDigit> ZDigitList)
	{
		this.ZDigitList = new ArrayList<ZDigit>(ZDigitList);
		computeZNumber();
	}
	
	
	public ZNumber(char... ch)
	{
		ZDigitList = new ArrayList<ZDigit>();
		for(int i = 0; i < ch.length; i++)
			ZDigitList.add(new ZDigit(ch[i]));
		computeZNumber();
	}
	
	
	public ZNumber(String s)
	{
		ZDigitList = new ArrayList<ZDigit>();
		for(char ch : s.toCharArray())
			ZDigitList.add(new ZDigit(ch));
		computeZNumber();
	}
	
	
	private void computeZNumber()
	{
		ZNumber = 0;
		int size = ZDigitList.size();
		for(int i = 0; i < size; i++)
		{
			ZNumber += Math.pow(27,size-1-i)*ZDigitList.get(i).getZDigit();
		}
	}
	
	public long toDecimal()
	{
		return ZNumber;
	}
	
	public ZDigit[] getDigits()
	{
		ZDigit[] digits = new ZDigit[ZDigitList.size()];
		return ZDigitList.toArray(digits);
	}
	
	@Override
	public String toString()
	{
		String out = "";
		for(int i = 0; i < ZDigitList.size(); i++)
		    out += ZDigit.getZChar(ZDigitList.get(i));
		return out;
	}

}
