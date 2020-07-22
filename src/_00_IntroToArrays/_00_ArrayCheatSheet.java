package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] Strings = new String[5];
		//2. print the third element in the array
		System.out.println(Strings[2]);
		//3. set the third element to a different value
		Strings[2] ="Bob";
		//4. print the third element again
		System.out.println(Strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < Strings.length; i++) {
			Strings[i] = "Bob" + (i + 1);
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < Strings.length; i++) {
			System.out.println(Strings[i]);
		} 
		//7. make an array of 50 integers
		int[] Ints = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < Ints.length; i++) {
			Ints[i] = rand.nextInt(51);
			System.out.println(Ints[i]);
			}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = Ints[0];
		for (int i = 0; i < Ints.length; i++) {
			if (Ints[i]< smallest) {
				smallest = Ints[i];
			}
		}
		System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
		//11. print the largest number in the array.
		int largest = Ints[0];
		for (int i = 0; i < Ints.length; i++) {
			if (Ints[i]> largest) {
				largest = Ints[i];
			}
		}
		System.out.println(largest);
		//12. print only the last element in the array
		System.out.println(Ints[49]);
	}
}
