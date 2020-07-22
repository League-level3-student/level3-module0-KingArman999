package _03_More_Array_Fun;

import java.util.Random;

import javax.swing.JOptionPane;

import _02_Firework_Display.FireworkDisplay;

public class MoreArrayFun {
	String[] strings = new String[5];
	Random r = new Random();

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {

		MoreArrayFun m = new MoreArrayFun();
		m.start();
	}

	void start() {
		reverse();
		// printer();
		//other();
		//randomOrder();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void printer() {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "Bob" + (i + 1);
			System.out.println(strings[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array in reverse order.
	void reverse() {
		for (int i = 4; i < strings.length; i--) {
			strings[i] = "Bob" + (i + 1);
			System.out.println(strings[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void other() {
		for (int i = 0; i < strings.length; i++) {
			
				System.out.println(strings[i]);
			
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array in a completely random order. Almost every run of the program
	// should result in a different order.
	void randomOrder() {
		for (int i = 0; i < strings.length; i++) {
			strings[r.nextInt(5)] = "Bob" + (i + 1);
			strings[r.nextInt(5)] = "Bob" + (i + 1);
			strings[r.nextInt(5)] = "Bob" + (i + 1);
			strings[r.nextInt(5)] = "Bob" + (i + 1);
			strings[r.nextInt(5)] = "Bob" + (i + 1);
			System.out.println(strings[i]);
		}
	}
}
