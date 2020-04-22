package com.java.programming.basics;

public class operators {

	public static void main(String[] args) {
		
		int i=1;		
		int a=++i;
		int j=i++;
		System.out.println(a);//2
		System.out.println(i);//3
		System.out.println(j);//2 
				
		int x=1;
		int y=--x;
		int z= x--;
		System.out.println(x);//-1
		System.out.println(y);//0
		System.out.println(z);//0
	}
}
