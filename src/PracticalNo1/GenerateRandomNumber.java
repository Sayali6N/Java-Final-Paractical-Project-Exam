package PracticalNo1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// Practical 1: Generate 500 random numbers and print the nth smallest number in
		// a programming language of your choice.
		// (Ask user for the Nth smallest number)
	
	    Random random = new Random();
		int randomArray[] = new int[500];
		
		for(int i = 0; i<500; i++) {
		
			randomArray[i] = random.nextInt(1000);
			System.out.println(randomArray[i]);
		}
		Arrays.sort(randomArray);
//		System.out.println(Arrays.toString(randomArray));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nth smallest number is:");
		int smallestNumber = scan.nextInt();
		System.out.println(randomArray[smallestNumber]);
	
	}

}
