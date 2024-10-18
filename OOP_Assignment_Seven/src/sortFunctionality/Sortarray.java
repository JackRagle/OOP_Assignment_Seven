package sortFunctionality;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sortarray {
	
	public static int[] array;
	
	public static int[] createRandomArray(int arrayLength) {
		
		array = new int[arrayLength];
		for(int i = 0; i < arrayLength; i++) {
			array[i] = (int) (Math.random() * 101);
		}
		
		return array;
		
	}
	
	public static void writeArrayToFile(int[] array, String filename) throws IOException {
		
		Sortarray.array = array;
			
		FileWriter output = new FileWriter(filename);
		
		for(int i = 0; i < array.length; i++) {
			
			output.write(array[i]);
			output.write("\n");
			
		}
		
		output.close();
		
	}
	
	public static int[] readFileToArray(String filename) throws IOException {
		
		BufferedReader input = new BufferedReader(new FileReader(filename));
		
		int numLines = 0;
		
		while(input.readLine() != null) {
			numLines++;
		}
		
		array = new int[numLines];
		
		for(int i = 0; i < numLines; i++) {
			array[i] = input.read();
		}
		
		input.close();
		
		return array;
		
	}
	
	public static void bubbleSort(int[] array) {
		
	}
	
}
