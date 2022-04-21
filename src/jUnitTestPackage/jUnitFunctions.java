package jUnitTestPackage;

import java.util.Scanner;

public class jUnitFunctions {
	
	public static void main(String[] args)
	   {
	      int num1, num2, sum;
	      String s1, s2, join;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("First number : ");
	      num1 = sc.nextInt();
	      
	      System.out.println("Second number : ");
	      num2 = sc.nextInt();
	      
	      sum = addTwoNum(num1, num2);
	      System.out.println("Sum : " + sum);
	      
	      System.out.println("First string : ");
	      s1 = sc.nextLine();
	      
	      System.out.println("Second string : ");
	      s2 = sc.nextLine();
	      
	      join = addTwoStr(s1, s2);
	      System.out.println("Combined strings are : " + join);
	      
	      sc.close();
	   }
	   public static int addTwoNum(int a, int b)
	   {
	      int sum = a + b;
	      return sum;
	   }
	   
	   public static String addTwoStr(String a, String b)
	   {
	      String join = a + b;
	      return join;
	   }

}
	