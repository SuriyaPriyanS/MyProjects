package org.zoho;

import java.util.Scanner;

public class PatternTringleRevense {
	
	
	public static void main (String []args) {
		Scanner s = new  Scanner(System.in);
		
		int n =s.nextInt();
		int Stars=2*n-1;
		int spaces=0;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j>=spaces;j--) {
				System.out.print(" ");
				spaces++;
			}
			for(int k=0;k<=Stars;k++) {
				System.out.print("*");
				Stars-=2;
				
			}
			System.out.println();
		}
		
		
		
	}

}
