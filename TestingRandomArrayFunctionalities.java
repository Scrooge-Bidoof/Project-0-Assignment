
// AlexTam
// TestingRandomArrayFunctionalities Class

/*
 *  TestingRandomArrayFunctionalities Class testing the Methods arraySubset and stringRepeat
 */
import java.util.Scanner;

public class TestingRandomArrayFunctionalities {

    public static void main(String[] args) {
    	
    	/**
    	 * Testing the arraySubset method taking in size and array elements for two arrays
    	 */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the size of the first array: ");
        int sizeOne = scanner.nextInt();
        int[] arrayOne = new int[sizeOne];
        
        System.out.println("Please enter the integer values/elements for the first array: ");
        for (int i = 0; i < sizeOne; i++) {
        	arrayOne[i] = scanner.nextInt();
        }

        System.out.println("Please enter the size of the second array: ");
        int sizeTwo = scanner.nextInt();
        int[] arrayTwo = new int[sizeTwo];
        
        if (sizeTwo > 0) {
        	System.out.println("Please enter the integer values/elements for the second array: ");
        	for (int i = 0; i < sizeTwo; i++) {
        		arrayTwo[i] = scanner.nextInt();
        	}
        }
        
        RandomArrayFunctionalities ArrayFunc = new RandomArrayFunctionalities();
        
        boolean arraySubset = ArrayFunc.arraySubset(arrayOne, arrayTwo);
        if (arraySubset) {
        	if (sizeTwo == 0) {
                System.out.println("The second array is a subset of the first array. (An empty set is a a subset of any set)"  + "\n");
            } 
        	else {
                System.out.println("The second array is a subset of the first array."  + "\n");
            }
        } 
        else {
            System.out.println("The second array is not a subset of the first array."  + "\n");
        }
        
        /**
         * Testing the stringRepeat method taking in a string and a number value
         */
        System.out.println("Enter a string: ");
        scanner.nextLine(); 
        String phrase = scanner.nextLine();
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        ArrayFunc.stringRepeat(phrase, number);
    }

}


