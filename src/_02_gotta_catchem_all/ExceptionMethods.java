package _02_gotta_catchem_all;

import java.util.Scanner;

public class ExceptionMethods {
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
		//   String and returns the reverse of that String. It should throw an IllegalStateException
		//   if the String passed in is empty
	public static String reverseString(String string) {
		if(string.isEmpty()) {
			throw new IllegalStateException();
		}
		
		String s = "";
		for(int i = string.length()-1; i>=0; i++) {
			s = s + string.charAt(i);
		}
			return s;
		
	}

	public static double divide(double d, double e) {
		double quotient = d/e;
		if(e == 0.0) {
			throw new IllegalArgumentException();
		}
		return quotient;
	}
}
