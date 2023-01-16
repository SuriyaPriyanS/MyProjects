package logicprogramme;

public class StringDuplicatecharatcter {

	public static void main(String[] args) {

		String s = "suriyapriyan";
		
	/*	int count = 0;
		for(char ch:s.toCharArray()) {
			if(ch == 'a') {
				count++;
			}
		}
		System.out.println(count);*/
		
		
		getCharOccurreeence(s,'a');
		getcharcount(s,'i');
		
	}
	public static void getcharcount(String s,char val) {
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) ==val){
				count++;
			}
		}
		System.out.println(val+":"+count);
	}
		
		public static void getCharOccurreeence(String s,char val) {
			int count = 0;
			for(char ch:s.toCharArray()) {
				if(ch == val) {
					count++;
				}
			}
			System.out.println(val+" "+count);
		}
		
	}


