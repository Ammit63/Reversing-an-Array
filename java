public class E19_ReverseArray {

	public static void main(String[] args) {
		
		// create an array with 10 elements we can reverse the order of.
		
		int[] array1 = {5,7,9,12,36,52,1,78,87,63};
		System.out.println(" This is array1 before interchanging the elements ");
		printArray(array1);
		System.out.println();
		System.out.println(" This is array1 after reversing the elements but keeping the old index # (decending 9-0) ");
		reverse(array1);
		System.out.println();
		System.out.println(" This is array1 after reversing the elements and putting them in the ascending (0-9)correct index # ");
		trueSwap(array1);
	}
	// print the array as it is
	
	private static void printArray(int [] array1) {
	for(int i = 0; i < array1.length; i++) {
		System.out.println(" Index number: "+(i)+" holds the element: "+array1[i]);
	}
}
	//This method will have the last index printed first and the first last but elements remain in their current index
	
	private static void reverse(int[] array1) {
		for(int i = array1.length - 1; i>=0;i--) {
		System.out.println(" Index number: "+(i)+" holds the element: "+array1[i]);
	}
}
	//This method will have the value of the last index printed first and the value of the first index going last but the indexes remain staionary.
	
	private static void trueSwap(int[] array1) {
		
		/*/move the elements around between the indexes where the last element is now located in the first index & the first number 
		 * is located in the last index.
		 */
		
		int temp, start, end; // create 3 variables to be used as swap vehicles.
		start = 0;  //variable start to equal index # 0
		end = array1.length-1; //variable end to equal the last index # (which in this array is equal to index # 9)
		
		while (start < end){ 
			temp = array1[start];//temp will hold the value of the low index or 1st number 
			array1[start] = array1[end]; // The low index # will take on the value from the high index #
			array1[end] = temp;// The high  index # will take on the value of the low index # which we stored in temp before the switch
			start++; // increment low to high.
			end--;// Decrement high to low.
}
		for(int j = 0; j < array1.length;j++ ) {
		System.out.println(" Index number: "+(j)+" holds the element: "+array1[j]);
	}
	}
}
