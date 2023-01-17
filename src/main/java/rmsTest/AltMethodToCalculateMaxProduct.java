package rmsTest;

public class AltMethodToCalculateMaxProduct {

	static final int n = 10;

	// function to calculate the max product
	// max to store largest value
	// loop to store a count of each possible combination
	// as we are looking for product of 3 adj numbers,
	// need a check to ensure always have a different combination of 3 numbers
	// we will want the checks to start from the third value for horizontal and vertical
	static int getMaxProduct(int arr[][], int n) {
		int max = 0, result, loop = 0;

		// for loop used to iterate the rows.
		for (int i = 0; i < arr.length; i++) {
			
			// for loop use to iterate the columns.
			for (int j = 0; j < arr[i].length; j++) {

				// Horizontal max product
				if ((j - 2) >= 0) {
					result = arr[i][j] * arr[i][j - 1] * arr[i][j - 2];
					loop++;

					if (max < result)
						max = result;
					
				}
				// vertical max product
				if ((i - 2) >= 0) {
					result = arr[i][j] * arr[i - 1][j] * arr[i - 2][j];
					loop++;

					if (max < result)
						max = result;
					
				}
				// check the maximum product in
				// diagonal (going through up - right)
				if ((i - 2) >= 0 && (j - 2) <= 0) {
					result = arr[i][j] * arr[i - 1][j + 1] * arr[i - 2][j + 2];
					loop++;

					if (max < result)
						max = result;
					
				}
				// check the maximum product in
				// diagonal (going through down - right)
				if ((i - 2) >= 0 && (j - 2) >= 0) {
					result = arr[i][j] * arr[i - 1][j - 1] * arr[i - 2][j - 2];
					loop++;

					if (max < result)
						max = result;
				}
			}
		}
		System.out.println("Number of combinations is: " +loop);
		return max;
	}

	public static void main(String[] args) {
		int arr[][] =    
    		{{8, 02, 22, 97, 38, 15, 00, 40, 00, 75}, 
	        {49, 49, 99, 40, 17, 81, 18, 57, 60, 87}, 
	        {81, 49, 31, 73, 55, 79, 14, 29, 93, 71}, 
	        {52, 70, 95, 23, 04, 60, 11, 42, 69, 24}, 
	        {22, 31, 16, 71, 51, 67, 63, 89, 41, 92}, 
	        {24, 47, 32, 60, 99, 03, 45, 02, 44, 75}, 
	        {32, 98, 81, 28, 64, 23, 67, 10, 26, 38}, 
	        {67, 26, 20, 68, 02, 62, 12, 20, 95, 63}, 
	        {24, 55, 58, 05, 66, 73, 99, 26, 97, 17}, 
	        {21, 36, 23, 9, 75, 00, 76, 44, 20, 45}}; 

		System.out.print("The greatest product of any 3 adj numbers is: " +getMaxProduct(arr, n));

	}
}
