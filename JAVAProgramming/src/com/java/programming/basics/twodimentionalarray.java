package com.java.programming.basics;

public class twodimentionalarray {
	public static void main(String[] args) {
		String s[][]=new String[3][5];
		System.out.println(s.length);//no.of rows
		System.out.println(s[0].length);//no.of columns
		s[0][0]="sri";
		s[0][1]="lakshmi";
		s[0][2]="lankala";
		s[0][3]="AA";
		s[0][4]="bb";
		
		s[1][0]="test";
		s[1][1]="lami";
		s[1][2]="ltest";
		s[1][3]="AA1";
		s[1][4]="bb1";

		s[2][0]="pa";
		s[2][1]="lami";
		s[2][2]="ljsakest";
		s[2][3]="AA2";
		s[2][4]="bb2";
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[0].length;j++) {
				System.out.println(s[i][j]);
			}
		}
				
		
	}

}
