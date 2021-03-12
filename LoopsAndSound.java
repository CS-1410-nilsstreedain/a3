package a3;

public class LoopsAndSound {
	public static void main(String[] args) {
		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Test for clearArray()\n");
		int[] testArray = new int[] {1, 2, 3};
		clearArray(testArray);
		System.out.println("clearArray([1, 2, 3]) results in: " + arrayToString(testArray));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Test for arrayToString()\n");
		System.out.println("arrayToString([1, 2, 3]) results in: " + arrayToString(testArray));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Test for hideLetterA()\n");
		System.out.println("ahideLetterA('a b c d c b a') results in: " + hideLetterA("a b c d c b a"));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Test for hasMoreEvenThanOdd()\n");
		System.out.println("hasMoreEvenThanOdd([1, 2, 3]) results in: " + hasMoreEvenThanOdd(testArray));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Test for averageArrayValues()\n");
		System.out.println("averageArrayValues([1, 2, 3]) results in: " + averageArrayValues(testArray));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Test for frequencyCount()\n");
		System.out.println("frequencyCount([1, 2, 3]) results in: " + arrayToString(frequencyCount(testArray)));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Test for reverseSound()\n");
		double[] testArrayDouble = new double[] {1.0, 2.0, 3.0};
		System.out.println("reverseSound([1.0, 2.0, 3.0]) results in: " + arrayDoubleToString(reverseSound(testArrayDouble)));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Test for scaleSound()\n");
		System.out.println("scaleSound([1.0, 2.0, 3.0], 2.0) results in: " + arrayDoubleToString(scaleSound(testArrayDouble, 2.0)));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Test for echoSound()\n");
		System.out.println("echoSound([1.0, 2.0, 3.0], 2, 3.0) results in: " + arrayDoubleToString(echoSound(testArrayDouble, 2, 3.0)));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Test for smoothSound()\n");
		System.out.println("smoothSound([1.0, 2.0, 3.0]) results in: " + arrayDoubleToString(smoothSound(testArrayDouble)));

		System.out.println("\n--------------------------------------------------\n");

	}

	/**
	 * Takes each value of the input array and changes it to 0.
	 * 
	 * EX: clearArray([1, 2, 3]) would output this array: [0, 0, 0]
	 * 
	 * @author Nils Streedain
	 * 
	 * @param arrayToClear The array to have all values replaced by 0.
	 * 
	 * @return An empty array with the length or the input array.
	 */
	public static void clearArray(int[] arrayToClear) {
		// makes every value of the array equal to zero
		for (int i = 0; i < arrayToClear.length; i++) {
			arrayToClear[i] = 0;
		}
	}

	/**
	 * Takes an int array input and converts it into nicely formatted text.
	 * 
	 * EX: arrayToString([1, 2, 3]) would output this string: "{1, 2, 3}"
	 * 
	 * @author Nils Streedain
	 * 
	 * @param arrayToString The array to be put in a string format.
	 * 
	 * @return A string displaying nicely formatted array values.
	 */
	public static String arrayToString(int[] arrayToString) {
		// creates a string for the output, with the first character of the format
		String stringOfArray = "{";

		// loops through, placing every digit of the array and puts a comma and space in
		// between unless is't the last value
		for (int i = 0; i < arrayToString.length; i++) {
			stringOfArray += arrayToString[i];
			if (i < arrayToString.length - 1)
				stringOfArray += ", ";
		}
		// adds a '}' to the end of the string to complete the format
		stringOfArray += "}";

		return stringOfArray;
	}
	
	/**
	 * Takes an double array input and converts it into nicely formatted text.
	 * 
	 * EX: arrayDoubleToString([1.0, 2.0, 3.0]) would output this string: "{1.0, 2.0, 3.0}"
	 * 
	 * @author Nils Streedain
	 * 
	 * @param arrayDoubleToString The array to be put in a string format.
	 * 
	 * @return A string displaying nicely formatted array values.
	 */
	public static String arrayDoubleToString(double[] arrayDoubleToString) {
		// creates a string for the output, with the first character of the format
		String stringOfArray = "{";

		// loops through, placing every digit of the array and puts a comma and space in
		// between unless is't the last value
		for (int i = 0; i < arrayDoubleToString.length; i++) {
			stringOfArray += arrayDoubleToString[i];
			if (i < arrayDoubleToString.length - 1)
				stringOfArray += ", ";
		}
		// adds a '}' to the end of the string to complete the format
		stringOfArray += "}";

		return stringOfArray;
	}

	/**
	 * Takes a string and replaces every 'a' character with a '*'.
	 * 
	 * EX: hideLetterA("abcdcba") would output this string: "*bcdcb*"
	 * 
	 * @author Nils Streedain
	 * 
	 * @param stringToRemoveA The string to have each a replaced.
	 * 
	 * @return A string displaying the original string but with 'a' replaced.
	 */
	public static String hideLetterA(String stringToRemoveA) {
		// creates a string for the output to but put into
		String stringWithoutA = "";

		// adds normal characters in the output string in order unless it's an 'a'
		// character, then a '*' takes it's place
		for (int i = 0; i < stringToRemoveA.length(); i++) {
			if (stringToRemoveA.charAt(i) != 'a') {
				stringWithoutA += stringToRemoveA.charAt(i);
			} else {
				stringWithoutA += "*";
			}
		}

		return stringWithoutA;
	}

	/**
	 * Determines weather an int array has more even or odd values.
	 * 
	 * EX: hasMoreEvenThanOdd([1, 2, 3]) would output this boolean: false
	 * 
	 * @author Nils Streedain
	 * 
	 * @param array The array to be evaluated.
	 * 
	 * @return A boolean showing weather more even or odd values are in the array.
	 */
	public static boolean hasMoreEvenThanOdd(int[] array) {
		// creates a boolean for the output and a count of even and odd numbers
		boolean moreEvenThanOdd = false;
		int evenCount = 0;
		int oddCount = 0;

		// adds numbers to the even or odd count based on when they are divisible by 2
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		// makes boolean true or false based on whether the even or odd count is higher
		if (evenCount > oddCount) {
			moreEvenThanOdd = true;
		}

		return moreEvenThanOdd;
	}

	/**
	 * Takes all the values of an array and determines the average.
	 * 
	 * EX: averageArrayValues([1, 2, 3]) would output this double: 2.0
	 * 
	 * @author Nils Streedain
	 * 
	 * @param array The array to be evaluated.
	 * 
	 * @return A double containing the average value of the array.
	 */
	public static double averageArrayValues(int[] array) {
		// creates variables for the running sum and total average
		double sumOfArray = 0;
		double arrayAverage = 0;

		// makes sure there is at least 1 value in the array
		if (array.length > 0) {
			// adds each value in the array to the running sum
			for (int i = 0; i < array.length; i++) {
				sumOfArray += array[i];
			}
			// takes the average of the running sum
			arrayAverage = sumOfArray / array.length;
		}

		return arrayAverage;
	}

	/**
	 * Takes all the values of an array and outputs how many of each integer between
	 * 0 and 9 is in that array.
	 * 
	 * EX: frequencyCount([1, 2, 3, 1]) would output this array: [0, 2, 1, 1, 0, 0,
	 * 0, 0, 0, 0, ]
	 * 
	 * @author Nils Streedain
	 * 
	 * @param array The array to be evaluated.
	 * 
	 * @return An array containing the total number of each value from the original
	 *         array.
	 */
	public static int[] frequencyCount(int[] array) {
		// creates an array for the output to be put into
		int[] frequencyCount = new int[10];

		// counts how many off each number between 0 and 9 are in an array and outputs
		// it to another array
		for (int i = 0; i < array.length; i++) {
			frequencyCount[array[i]]++;
		}

		return frequencyCount;
	}

	/**
	 * Takes an input array and reverses the value index order.
	 * 
	 * EX: reverseSound([1, 2, 3, 1]) would output this array: [1, 3, 2, 1]
	 * 
	 * @author Nils Streedain
	 * 
	 * @param array The array to be altered.
	 * 
	 * @return An array containing the original array with a reversed index order.
	 */
	public static double[] reverseSound(double[] array) {
		// creates an array for the reversed output array
		double[] reversedArray = new double[array.length];

		// adds each value to the reversed array backwards
		for (int i = 0; i < array.length; i++) {
			reversedArray[array.length - i - 1] = array[i];
		}

		return reversedArray;
	}

	/**
	 * Takes an input array and scales each value by an input multiplier.
	 * 
	 * EX: scalseSound([1, 2, 3, 1], 2) would output this array: [2, 4, 6, 2]
	 * 
	 * @author Nils Streedain
	 * 
	 * @param array The array to be altered.
	 * @param value The value each number in the array will be scaled by.
	 * 
	 * @return An array containing the original array but with each number scaled to
	 *         the input value
	 */
	public static double[] scaleSound(double[] array, double value) {
		// creates an array for the scaled output array
		double[] scaledArray = new double[array.length];

		// multiplies each value of the input array and puts it into the output array
		for (int i = 0; i < array.length; i++) {
			scaledArray[i] = array[i] * value;
		}

		return scaledArray;
	}

	/**
	 * Takes an input array and duplicates that array, scales it, and adds it back
	 * to the original array offset by an input value
	 * 
	 * EX: echoSound([0.1, 0.2, 0.3, 0.4], 1, 0.5) would output this array: [0.1,
	 * 0.25, 0.4, 0.55, 0.2]
	 * 
	 * @author Nils Streedain
	 * 
	 * @param array     The array to be altered.
	 * @param numOffset The value of the offset between the original array and the
	 *                  scaled array when they are added together.
	 * @param echoWeith The weight that the echoed array will be weighed by.
	 * 
	 * @return An array containing the original array but with a weighted copy added
	 *         at a certain index delay.
	 */
	public static double[] echoSound(double[] sound, int numOffset, double echoWeight) {
		// creates new arrays, one for the offset array and one for the output array
		double[] offsetSound = new double[sound.length + numOffset];
		double[] echoedSound = new double[sound.length + numOffset];

		// puts values of the input array into the offset array with the input indexed a
		// certain amount of spaces higher, determined by the offset
		for (int i = 0; i < offsetSound.length; i++) {
			// takes the value of the offset and indexes the input higher that amount
			if (i < numOffset) {
				offsetSound[i] = 0;
			} else {
				// places the array values in the offset array and multiplies by weight
				offsetSound[i] = (sound[i - numOffset]) * echoWeight;
			}
		}

		// adds the original array to the offset array to create an echo sound
		for (int i = 0; i < offsetSound.length; i++) {
			if (i < sound.length) {
				echoedSound[i] = sound[i] + offsetSound[i];
			} else {
				echoedSound[i] = offsetSound[i];
			}
		}

		return echoedSound;
	}

	/**
	 * Takes an input array smoothes it out by averaging every value with the value
	 * coming before and after it.
	 * 
	 * EX: smoothSound([0.0, 0.2, 0.7, 0.2]) would output this array: [0.1, 0.3,
	 * 0.3666...,0.45]
	 * 
	 * @author Nils Streedain
	 * 
	 * @param sound The array to be smoothed
	 * 
	 * @return An array containing the original array but with each value averaged
	 *         with the value coming before and after it.
	 */
	public static double[] smoothSound(double[] sound) {
		double[] smoothedSound = new double[sound.length];
		// makes sure input array is long enough
		if (sound.length > 2) {
			// repeats smooth step for every value in the array
			for (int i = 0; i < sound.length; i++) {
				// determines what numbers to average in the array
				if (i == 0) {
					// first number has no number before, so only index 1 & 2 are averaged
					smoothedSound[i] = (sound[i] + sound[i + 1]) / 2;
				} else if (i > 0 && i < sound.length - 1) {
					// middle numbers have numbers before + after so all 3 are averaged
					smoothedSound[i] = (sound[i - 1] + sound[i] + sound[i + 1]) / 3;
				} else {
					// last number has no number after, so only last 2 index are averaged
					smoothedSound[i] = (sound[i - 1] + sound[i]) / 2;
				}
			}
		}

		return smoothedSound;
	}
}