package com;

public class LIS {
	public int maxSum(int[] arr, int n){
		int lis[] = new int[n];
		int i,j,max = 0; 
		/* Initialize LIS values for all indexes */
		for ( i = 0; i < n; i++ )
			lis[i] = arr[i]; 
		/* Compute optimized LIS values in bottom up manner */
		for ( i = 1; i < n; i++ ){			
			for ( j = 0; j < i; j++ ) {
				if ( arr[i] > arr[j] && lis[i] < lis[j] + arr[i]){
					System.out.println(arr[i]);
					lis[i] = lis[j] + arr[i];
				}
			}
		}
		/* Pick maximum of all LIS values */
		for ( i = 0; i < n; i++ )
			if ( max < lis[i] )
				max = lis[i]; 
		return max;
	}
	public static void main(String[] args) {
		int[] arr={1,2,-1,-2,2,1,-2,1,4,-5,4};
		LIS lis=new LIS();
		int result=lis.maxSum(arr,arr.length);
		System.out.println(result);
	}
}