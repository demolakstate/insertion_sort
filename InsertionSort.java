public class InsertionSort {

public static void main(String[] args) {
InsertionSort is = new InsertionSort();
	//int[] arr = {4,3,8,1};
	int[] arr = {9,8,7,6,5,4,3,4,2,9,1};

	System.out.println("Input array ");
	for (int i : arr)
		System.out.print(i + " ");

	is.iSort(arr);

	System.out.println("Sorted array ");
	for (int i : arr)
		System.out.print(i + " ");


} // end method main


	private void iSort(int[] a) {

	int n = a.length;
	if (n > 1) {

	for (int i = 1; i < n; i++) {
	int temp = a[i];
	int j = i;

	

	while( j > 0 && a[j] < a[j-1] ) {
		// swap
		temp = a[j];
		a[j] = a[j-1];
		a[j-1] = temp;	
		j--;	
     	} // end while loop

} // end for loop

	}// end if
	


} // end method iSort


} //  end class InertionSort