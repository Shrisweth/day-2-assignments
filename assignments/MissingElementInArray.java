package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		int j = 0;
		int n = arr[0];
		int length =arr.length;
		
		
		for(int i=0; i<arr[(length-1)]; i++) {
			
			if(n !=arr[j]) {
				
				System.out.println(n);
				
				n++;
				
				
				
			}else if((n == arr[n]) && (n < length - 1)){
				
				n++;
				j++;
				
				
				
				
				
			}
		}
		
		
		
		
	}

}
