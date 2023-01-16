package logicprogramme;

public class Numberforloop {
	public static void main(String[] args) {
		
		int num =10;
		
		for(int i=0;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
