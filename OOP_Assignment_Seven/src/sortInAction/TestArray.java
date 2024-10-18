package sortInAction;

import java.io.IOException;

import sortFunctionality.Sortarray;

public class TestArray {

	public static void main(String[] args) throws IOException {
		
		int[] testArray = new int[0];
		
		testArray = Sortarray.readFileToArray(args[0]);
		
		//testArray = Sortarray.createRandomArray(5);
		for(int i = 0; i < 7; i++) {
			System.out.println(testArray[i]);
		}
		
		
		
	}

}
