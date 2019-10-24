package com.sum.Company.sumOfTwoNumbersInListToNumber;

/**
 * 1Given a list of numbers and a number k, return whether any two numbers from the list 
 * add up to k.For example, given [10, 15, 3, 7] and k of 17, 
 * return true since 10 + 7 is 17.Bonus: Can you do this in one pass?
 *
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
       //Scanner object
    	Scanner myObj = new Scanner(System.in);
    	//User input
    	System.out.println("Please enter list of numbers separated by space or comma");
    	String [] numLst = myObj.nextLine().split("[ ,]+");
    	System.out.println("Please enter the expected sum of two numbers in the list");
    	int n = myObj.nextInt();
    	myObj.close();
    	// array size
    	int x = numLst.length;
    	for (int i=0;i<x;i++)
    	{
    		int diff = n - Integer.parseInt(numLst[i]);
    		String dif = String.valueOf(diff);
    		int j= i+1;
    		while(j<x) {
    			if (numLst[j].equals(dif))
    			{
    				System.out.println("Numbers " + dif + " & " + numLst[i] + " in the list sum to " + n);
    			}
    			j++;
    		}
    		
    	}
    }
}
