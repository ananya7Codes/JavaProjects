/**
 * 
 */
package com.ananya;

import java.util.Scanner;

/**
 * @author ananyabhatnagar
 *
 */
public class PowerOfIndices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b: ");
		double b = sc.nextDouble();
		
		double res = powInd(a,b);
		System.out.println("Result is: "+ res);
	}

	private static double powInd(double a, double b) {
		// TODO Auto-generated method stub
		
		if (b!=0) 
			return (a*(powInd(a, b-1)));
		else
			return 1;
			
	}

}
