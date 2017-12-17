package com;


public class LC_SubSequence {
	static int lis(int arr[],int n)
	{
		int lis[] = new int[n];
		int lis1[] = new int[n];
		int i,j,max = 0,k=0; 
		/* Initialize LIS values for all indexes */
		for ( i = 0; i < n; i++ )
			lis[i] = 1; 
		/* Compute optimized LIS values in bottom up manner */
		for ( i = 1; i < n; i++ ){
			for ( j = 0; j < i; j++ ) {
				if ( arr[i] > arr[j] && lis[i] < lis[j] + 1){
					lis[i] = lis[j] + 1;
					lis1[k]=arr[i];
					System.out.println(arr[j]);
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
		int[] a={11,17,5,8,6,4,7,12,3};
		LC_SubSequence lc_SubSequence=new LC_SubSequence();
		int result=lc_SubSequence.lis(a,a.length);
		System.out.println(result);
	}
}
