package week1.day2.assignments;

import java.util.Arrays;

public class DuplicatesInArray {
	
	public static void main(String[] args) {
		
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int length =arr.length;
		
		Arrays.sort(arr);
		
		for(int i=0; i<length-1; i++) {
			
			if(arr[i] == arr[i+1]) {
				
				System.out.println(arr[1]);
			}
			
	}

	}
}
