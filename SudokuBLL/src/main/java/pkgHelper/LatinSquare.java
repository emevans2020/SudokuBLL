package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	// instance variable - name is LatinSquare 
	private int[][] LatinSquare; //attribute name is same as class name
	
	
	public LatinSquare() {
		
	}
	//constructor
	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}


	public int[][] getLatinSquare() {
		return LatinSquare;
	}


	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	public boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates = false;
		Arrays.sort(arr);
		
		if (arr == null)
			return false;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i+1]){
			hasDuplicates = true;
			break;
		}
			
		}
		return hasDuplicates; 
	}
	//will check to see if the value input will exist in the array
	public boolean doesElementExist (int[]arr, int iValue) {
		 for (int i=0; i < arr.length; i++) 
		 {
			 if (arr[i] == iValue) {
				 return true;
			 }
		 }
	return false; 
	}
	
	public boolean hasAllValues (int[]arr1, int[]arr2) {
		boolean hasAllValues = false;

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (arr1==null)
			return false;
		if (arr2==null)
			return false;
		
		for (int i = 0; i < arr2.length-1; i++) {
			for (int j = 0; i < arr1.length-1; i++){
				if (arr2[i] == arr1[j]) {
					return true;
				}
			}
		}
		return hasAllValues;
	}
	
	public int[] getColumn(int iCol) {
		int[] intColumn = new int [LatinSquare.length];
		for (int iColumn = 0; iColumn < LatinSquare.length; iColumn++) 
		{
			intColumn[iColumn] = LatinSquare[iColumn][iCol];
		}
		 
		return intColumn;
	}
	
	public int[] getRow(int iRow) {
		int[] intRow = new int [LatinSquare.length];
		for (int integerRow = 0; integerRow <LatinSquare.length; integerRow++)
		{
			intRow[integerRow] = LatinSquare [iRow][integerRow];
		}
		return intRow;
	}

	public boolean isLatinSquare() { //NEED TO WORK ON ISLATINSQUARE!!!!
	}
	
	//checks if array contains zeroes
	public boolean ContainsZero(){
		//looping through each element in column
		for (int i=0; i < LatinSquare.length; i ++) {
			//loop through each element in row
			for (int j=0; j <LatinSquare.length; j++) {
				if (LatinSquare[i][j]==0) {
					return true;
				}
			}
		}
		return false; //by default return false
	}
	
}



