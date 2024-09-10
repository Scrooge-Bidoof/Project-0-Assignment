// AlexTam
// RandomArrayFunctionalities Method Class

/* 
 * RandomArrayFunctionalities Class with Methods taking in two sets of arrays and evaluating whether 
 * they are subsets of one another and taking in a string and outputting it in decreasing repetition
 */
public class RandomArrayFunctionalities {
	
	/**
	 * The arraySubset method determines whether or not the second array 
	 * is a subset of the first array
	 * @param arrayOne, holds the first array to be analyzed
	 * @param arrayTwo, holds the second array to be analyzed based upon 
	 * the first
	 * @return, returns a boolean value of true or false depending on if 
	 * the second array is a subset of the first array
	 */
    public static boolean arraySubset(int[] arrayOne, int[] arrayTwo) {
    	
    	int subsetSize = 0;
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                if (arrayOne[j] == arrayTwo[i]) {
                	arrayOne[j] = 0;
                	subsetSize++;
                    break;
                }
            }
        }
    	if (subsetSize == arrayTwo.length) {
    		return true;
    	}
    	else
    		return false;
    }
    
    /**
     * The stringRepeat method takes in a string and a number from the 
     * user and outputs a substring based upon the string and repeated
     * based on the number entered from the user
     * @param str, holds the string that will be printed
     * @param num, hold the number that represents the number of times
     * @return, will return a the substring based on the string and number value
     */
    public static void stringRepeat(String str, int num) {
        for (int i = num; i > 0; i--) {
            System.out.print(str.substring(0, i));
        }
        System.out.println();
    }

}
