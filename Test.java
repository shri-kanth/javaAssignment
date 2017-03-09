package zAlgebra;

import java.util.*;

public class Test {

	public static void main(String[] args)
	{
		List<ZDigit> list = new ArrayList<ZDigit>();
		
			list.add(new ZDigit('L'));
			list.add(new ZDigit('I'));
			list.add(new ZDigit('S'));
			list.add(new ZDigit('T'));
		
		ZNumber zn = new ZNumber(list);
		System.out.print("ZNumber from list "+zn);
		System.out.println(" Computed ZNumber : "+zn.toDecimal());
		
		ZDigit[] zd = zn.getDigits();
		System.out.print("Checking getDigits");
		for(ZDigit z : zd)
			System.out.print(" "+z.getZChar());
		System.out.println();
		
		
		char[] c = {'C','H','A','R','A','R','R','A','Y'};
		
		zn = new ZNumber(c);
		System.out.print("ZNumber from char array "+zn);
		System.out.println(" Computed ZNumber : "+zn.toDecimal());
		
		zd = zn.getDigits();
		System.out.print("Checking getDigits");
		for(ZDigit z : zd)
			System.out.print(" "+z.getZChar());
		System.out.println();
		
		zn = new ZNumber('C','H','A','R','I','N','P','U','T');
		System.out.print("ZNumber from char array "+zn);
		System.out.println(" Computed ZNumber : "+zn.toDecimal());
		
		zd = zn.getDigits();
		System.out.print("Checking getDigits");
		for(ZDigit z : zd)
			System.out.print(" "+z.getZChar());
		System.out.println();
		
		zn = new ZNumber("STRING");
		System.out.print("ZNumber from char array "+zn);
		System.out.println(" Computed ZNumber : "+zn.toDecimal());
		
		zd = zn.getDigits();
		System.out.print("Checking getDigits");
		for(ZDigit z : zd)
			System.out.print(" "+z.getZChar());
		System.out.println();
		
		/*
		 * Checking immutable condition
		 */
		
		/*
		zn = new ZNumber("ROCKnROLL");
		System.out.print("ZNumber from illegal string "+zn);
		System.out.println(" Computed ZNumber : "+zn.toDecimal());
		
		zd = zn.getDigits();
		System.out.print("Checking illegal string");
		for(ZDigit z : zd)
			System.out.print(" "+z.getZChar());
		System.out.println();
	    */
		
		/*
		zn = new ZNumber('R','n','B');
		System.out.print("ZNumber from illegal char "+zn);
		System.out.println(" Computed ZNumber : "+zn.toDecimal());
		
		zd = zn.getDigits();
		System.out.print("Checking illegal char");
		for(ZDigit z : zd)
			System.out.print(" "+z.getZChar());
		System.out.println();
		*/
		
		/*
		zn = new ZNumber('4','2','0');
		System.out.print("ZNumber from illegal numbers "+zn);
		System.out.println(" Computed ZNumber : "+zn.toDecimal());
		
		zd = zn.getDigits();
		System.out.print("Checking illegal number");
		for(ZDigit z : zd)
			System.out.print(" "+z.getZChar());
		System.out.println();
		*/
	}
	
}
