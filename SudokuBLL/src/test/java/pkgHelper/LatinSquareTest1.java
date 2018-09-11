package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest1 {

	@Test
	public void ContainsZeroTest() {
		// 2 dimensional array with name mySquare
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		
		//LatinSquare is called a reference class in this instance and 
		//is referencing the class LatinSquare
		LatinSquare ls = new LatinSquare (mySquare); //ls is instance name
		
		//when call new new is looking for constructor in LatinSquare
		//System.out.println(ls.ContainsZero());
		assertFalse(ls.ContainsZero());
		
		//changed one of the values to 0 and shows that it is true that there
		//is a zero
		mySquare [0][1]=0;
		assertTrue(ls.ContainsZero());
	}

	public void doesElementExistTest() {
		int[] myArr = {1,2,3,4,5,6};	
		int iValue = 2;
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		
		LatinSquare ls = new LatinSquare (mySquare);
		
		assertTrue(ls.doesElementExist(myArr, iValue));
	}
	
	public void getColumnTest() {
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		LatinSquare ls = new LatinSquare (mySquare);
		
		System.out.println(Arrays.toString(ls.getColumn(1)));
		System.out.println(Arrays.toString(ls.getColumn(0)));
	}
	
	public void getRowTest() {
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		LatinSquare ls = new LatinSquare (mySquare);
		
		System.out.println(Arrays.toString(ls.getRow(1)));
	}
}
