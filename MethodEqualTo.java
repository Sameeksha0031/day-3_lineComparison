package com.lineSystem.java;
import java.util.Scanner; 

public class MethodEqualTo {
	
	public static void main(String[] args) {

	System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
	MethodEqualTo firstObj = new MethodEqualTo();
	MethodEqualTo secondObj = new MethodEqualTo();
	Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    Double result1, result2;
    System.out.println("Line 1 points");
    result1 = firstObj.calculateLength(x1,y1,x2,y2);
    System.out.println("calculated length for 1st Line :" + result1);
    int a1 = sc.nextInt();
    int b1 = sc.nextInt();
    int a2 = sc.nextInt();
    int b2 = sc.nextInt();
    System.out.println("Line 2 points");
    result2 = secondObj.calculateLength(a1,b1,a2,b2);
    System.out.println("calculated length for 2st Line :"+ result2);
    if(result1.equals(result2)) {
    	
    	System.out.println("Lines are equal");
    	
      } else {
    	  
    	  System.out.println("Lines are not equal");
      }
    
	}
	
	public Double calculateLength(int a1, int b1 ,int a2, int b2 ) {
    Double result;
	result = Math.sqrt((Math.pow(a2-a1,2)) + Math.pow(b2-b1,2));      // sqrt and pow are method of Math class
	return result;
	
	}
}
