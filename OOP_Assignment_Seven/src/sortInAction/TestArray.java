package sortInAction;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import sortFunctionality.Sortarray;

public class TestArray {

	public static void main(String[] args) throws IOException {
		
		int[] array;
		
		if(args.length == 1) {
			array = Sortarray.readFileToArray(args[0]);
			System.out.println("The array that has been inputed is: ");
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}else {
			Scanner in = new Scanner(System.in);
			System.out.println("You have not provided an array, so a random one will be created. How many integers would you like there to be?");
			int arraySize = 0;
			try {
				arraySize = in.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("You have entered an invalid input.");
			}
			in.close();
			array = Sortarray.createRandomArray(arraySize);
			System.out.println("The array that has been created is: ");
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
		
		array = Sortarray.bubbleSort(array);
		System.out.println("This is the array in order from smallest to largest: ");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		Sortarray.writeArrayToFile(array, "output.txt");
		System.out.println("The sorted array has been recorded in the file: 'output.txt'.");
		
	}

}
