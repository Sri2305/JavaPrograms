package com.java.programming.basics;

public class Arrays {
	
	public static void main(String[] args) {
		//single dimentional array
		
		int i[]=new int[5];

		i[0]=10;
		i[4]=100;
		System.out.println(i[0]);
		System.out.println(i.length);
		for(int a=0;a<=i.length-1;a++) {
			System.out.println(i[a]);
		}
		double d[]=new double[2];
		d[0]=10.09;
		d[1]=09.09;
		for(int b=0;b<=d.length-1;b++) {
			System.out.println(d[b]);
		}
		char c[]=new char[5];
		System.out.println(c.length);
		
		boolean z[]=new boolean[2];
		System.out.println(z[1]);
		
		String st[]=new String[3];
		st[0]="sri";
		st[1]="lakshmi";
		System.out.println(st[0]+st[1]);
		System.out.println(st.length);
	

		//Object(superclass of all classes) Array
		Object ob[] = new Object[5];
		ob[0]="Sri";
		ob[1]="Lakshmi";
		ob[2]=32;
		ob[3]=89000.09;
		ob[4]="17/09/1987";
		System.out.println(ob.length);
		for(int o=0;o<ob.length;o++) {
			System.out.println(ob[o]);
		}


		
	}
	
}
