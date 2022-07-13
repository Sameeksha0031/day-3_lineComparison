package com.lineSystem.java;
import java.util.Scanner; 

public class MethodCompareto {

	//String a,b;
	
	public static void main(String[] args) {
		
	Double result1,result2;	
	System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
	//MethodCompareto obj = new MethodCompareto();
	CartesianSystem carsys = new CartesianSystem();   // Class Cartesian_system
	Scanner  sc = new Scanner(System.in);
	System.out.println("Enter Co-ordinate for line 1");
	 int x1 = sc.nextInt();
	 int y1 = sc.nextInt();
	 int x2 = sc.nextInt();
	 int y2 = sc.nextInt();
	System.out.println("Calculated length for 1st line");
	result1 = carsys.Calculate_length(x1,y1,x2,y2);                   //calling the method Calculate_length of class Cartesian System
	
	System.out.println("Enter Co-ordinate for line 2");
	int a1 = sc.nextInt();
	int b1 = sc.nextInt();
	int a2 = sc.nextInt();
	int b2 = sc.nextInt();
	System.out.println("Calculated length for 2nd line ");
	result2 = carsys.Calculate_length(a1,b1,a2,b2);
	
	if(result1.compareTo(result2) == 0) {   
        
	      System.out.println("Line are equal");	
	      
	}else if(result1.compareTo(result2) == -1) {
		
		System.out.println("Line 1 is Smaller than line 2");   // -1 for less
		
	}else{
		
		System.out.println("Line 1 is greater than line 2");   // 1 for greater
	}
	
  }
}
