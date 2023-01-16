package logicprogramme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintnumberOrder {
	public static void main(String[] args) {
		 
		//input : 11,31,4,3,9
		//output : 11,3,9,31,4
		
		int[]array = new int[] {11,31,4,3,9};
		List<Integer> add = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++) {
			if(i%2 ==0)
			{
			add.add(array[i]);	
			}
			else {
				even.add(array[i]);
			}
		}
		Collections.sort(add);
		Collections.sort(even);
		
		
		
		int[]output = new int [array.length];
		int evenIndex = 0;
		int AddIndex = add.size()-1;
		
		for(int i=0;i<output.length;i++) {
			if(i%2 == 0) {
				output[i] = add.get(AddIndex);
				AddIndex = AddIndex-1;
			}
			else {
				output[i] = even.get(evenIndex);
				evenIndex = evenIndex+1;
			}
		}
		System.out.println(array.toString(output));
		
		
		
		
	}

}
