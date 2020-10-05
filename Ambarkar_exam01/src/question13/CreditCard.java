/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question13;

/**
 *
 * @author Sai Prashansa Ambarkar
 */

public class CreditCard {
	//checking all the given conditions to satisfy being a credit card
	public static boolean isValid(long number) {
		boolean check=false;
                if((getSize(number) >= 13 && getSize(number) <= 16) &&
			(prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) &&
			((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)) {
			return check = true;
		}else {
			return check;
		}
	}
	
        //getting length of the given credit card number
	public static int getSize(long d) {
		String len = Long.toString(d);
		int length = len.length();
		return length;
	}
	
        //checking prefix of the credit card
	public static long getPrefix(long number, int k) {
		if (getSize(number) > k)  {
			String num = Long.toString(number);
			return  Long.parseLong(num.substring(0, k));
		}
		return number;
	}
	
        //matching prefix with given prefix
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}
	
        //adding even places and doubling them  
	public static int sumOfDoubleEvenPlace(long number) {
		int val = 0;
		int x = getSize(number);
		String num = Long.toString(number);
		for (int i = x - 2; i >= 0; i = i-2) {
			int getNum = Integer.parseInt(num.charAt(i)+"");
			val += getDigit(getNum * 2);
		}
		return val;
	}
	
        //spliting and getting the sum of digits if any
	public static int getDigit(int number) {
		if(number <= 9) {
			return number;
		}else {
			number = (number/10) + (number%10);
			return number;
		}
	}
	
        //adding the odd digit numbers
	public static int sumOfOddPlace(long number) {
		int val = 0;
		int x = getSize(number);
		String num = Long.toString(number);
		for (int i = x - 1; i >= 0; i = i-2) {
			val += Integer.parseInt(num.charAt(i)+"");
		}
		return val;
		
	}
}

