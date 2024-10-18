package sortInAction;

import java.io.File;
import java.io.IOException;

import sortFunctionality.Sortarray;

public class TestArray {

	public static void main(String[] args) throws IOException {
		
		File inputFile = new File(args[0]);
		
		int[] testArray = Sortarray.createRandomArray(5);
		for(int i = 0; i < 5; i++) {
			System.out.println(testArray[i]);
		}
		
		
		
	}

}
