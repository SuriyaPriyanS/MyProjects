package logicprogramme;

public class VowelsCount {
	
	public static boolean  isVowel(char s) {
		return s== 'a'|| s =='e'||s== 'i'|| s== 'o'||s=='u' ||
				s== 'a'|| s == 'E'|| s=='I'|| s== 'O'|| s=='U';
		
	}
	public static void main(String[] args) {
		String v = "suriyapriyan";
		String t = "SURIYAPRIYAN";
		int count = 0;
		for(int i=0;i<v.length();i++) {
			if(isVowel(v.charAt(i))) {
				count++;
				
			}
			
		}
		System.out.println(count);
		
		
		
	}

}
