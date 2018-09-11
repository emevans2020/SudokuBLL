package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	// instance variable
	private int[][] LatinSquare;
		
	public LatinSquare() {		//constructor
		
	}
	
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
			if (arr[i] == arr[i+1])
		{
			hasDuplicates = true;
			break;
		}
			
		}
		return hasDuplicates; 
	}
	
	public boolean doesElementExist (int[]arr, int iValue) {
		 for (int i=0; i < arr.length; i++) {
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
		
		for (int i = 0; i < arr1.length-1; i++) {
			for (int j = 0; i < arr2.length-1; i++){
				if (arr1[i] == arr2[j]) {
					return true;
				}
			}
		}
	}
	
	public int[] getColumn(int iCol) {
		int iCol = new int (LatinSquare.length);
		
		for (int iCol = 0; iCol < LatinSquare; iCol++) {
			iColumn[Column]
		}
		
		
	}
	
	public int[] getRow(int iRow) {
		
	}

	public boolean isLatinSquare() {

	}
	
	public boolean ContainsZero(){
		
	}
	
}



