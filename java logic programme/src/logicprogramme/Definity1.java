package logicprogramme;

import java.util.ArrayList;
import java.util.List;

public class Definity1 extends Definity {
	
	public static void main(String[] args) {
		//I am a good java programme;
		
		String s = "    I    am   a   good javaprogrammes    ";
		String o = "";
		int p = 0;
		
		try {
			for(p = 0;;p++) {
				s.charAt(p);
			}	
			} catch(Exception e) {
				
			}
		List<String> li = new ArrayList();
		for (int i = 0; i<p;i++) {
			String w = " ";
			if(s.charAt(i) != ' ') {
				for(int j = i;j<p;j++) {
					if(s.charAt(j) == ' ') {
					break;
				
				} else {
					w = w+s.charAt(i);
				}
			     i = j;
			}
		}
			if (! w .isEmpty()) {
				li.add(w);
		}
		}
		for(int i = 0; i<li.size(); i++) {
			o = o + li.get(i) + " ";
		}
		System.out.println(o);
	}
	
	
}

