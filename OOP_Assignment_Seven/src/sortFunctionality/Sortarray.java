package sortFunctionality;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sortarray {
	
	public static int numLines;
	
	public static int[] createRandomArray(int arrayLength) {
		
		int[] array = new int[arrayLength];
		for(int i = 0; i < arrayLength; i++) {
			array[i] = (int) (Math.random() * 101);
		}
		
		return array;
		
	}
	
	public static void writeArrayToFile(int[] array, String filename) throws IOException {
		
		int[] arrayOut = array;
			
		FileWriter output = new FileWriter(filename);
		
		for(int i = 0; i < array.length; i++) {
			
			output.write(arrayOut[i]);
			output.write("\n");
			
		}
		
		output.close();
		
	}
	
	public static int[] readFileToArray(String filename) throws IOException {
		
		File file = new File(filename);
		Scanner input = new Scanner(file);
		
		numLines = 0;
		
		while(input.hasNextInt()) {
			input.nextLine();
			numLines++;
		}
		
		input.close();
		int[] array = new int[numLines];
		Scanner in = new Scanner(file);
		
		for(int i = 0; i < numLines; i++) {
			array[i] = in.nextInt();
		}
		
		in.close();
		
		return array;
		
	}
	
	public static int[] bubbleSort(int[] array) {
		int[] arraySorted = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			int placement = 0;
			for(int j = 0; j < array.length; j++) {
				if(array[i] > array[j]) {
					placement++;
				}
			}
			arraySorted[placement] = array[i];
		}
		return arraySorted;
	}
	
}
