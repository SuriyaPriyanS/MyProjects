package logicprogramme;

import java.util.Scanner;

public class PryindTringle {
	
	public static void main(String []args) {
		
		Scanner s1 = new Scanner(System.in);
		
		int  a= s1.nextInt();
		
		int b =2;
		
		for(int i=a;i>0;i--) {
			for(int j= i;j<=i;j--) {
				System.out.print(" ");
			}
			for(int k = i;k<=i;k++) {
				System.out.print(b+" ");
				
				b=b+2;
			}
		}
		System.out.println();
		
	}
	}

