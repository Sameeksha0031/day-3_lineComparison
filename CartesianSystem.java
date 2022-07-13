package com.lineSystem.java;
//import java.lang.Math.*;
public class CartesianSystem {

    //int x1,x2,y1,y2;	

	public static void main(String[] args) {
		
	 System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
	 CartesianSystem obj = new CartesianSystem();
		  obj.Calculate_length(4,6,9,3);
	}
	
	 public double Calculate_length(int x1,int y1,int x2, int y2){
		 double len;
		 len=Math.sqrt((Math.pow(x2-x1,2)) + Math.pow(y2-y1,2));
		 System.out.println("calculated length:" + len);
	 return len;
	 }

}
