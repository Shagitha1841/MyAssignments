package week1.day2;

import java.util.Arrays;

public class Missing_Elements {

	public static void main(String[] args) {
		
		int[] a = {1,2,4,5,3,6,8};
		
		Arrays.sort(a);
		
		for(int i=0; i < a.length; i++) {
			if(i+1 != a[i]) {
				System.out.println(" The Missing Element is :" + (i+1));
				break;
			}
		}
		
	}

}
