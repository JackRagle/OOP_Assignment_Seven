package sortInAction;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import sortFunctionality.Sortarray;

public class TestArray {

	public static void main(String[] args) throws IOException {
		
		if(args.length == 1) {
			int[] array = Sortarray.readFileToArray(args[0]);
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
			int[] array = Sortarray.createRandomArray(arraySize);
		}
		
		
		
	}

}
