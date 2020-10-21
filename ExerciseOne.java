package hw05;
/*
Kallan Brainard 
CS 211
July 25, 2020

1. Write a method called lastIndexOf that accepts an integer as a
parameter and returns the index in the list of the last occurrence of that
value, or 21 if the value is not found in the list. For example, if the list
stores [1, 18, 2, 7, 18, 39, 18, 40], then the last index of 18 is 6
and the last index of 3 is 21.
 */
import java.util.*;

public class ExerciseOne {

	public static void main(String[] args) {
		//create list and store into an array list
		int [] array = {1, 18, 2, 7, 18, 39, 18, 40};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i: array) {
			list.add(i);
		}
		//Display list to user
		System.out.println("List of elements are: " + list);
		System.out.println("\nReturns the index of the input value's last occurrence");
		System.out.print("Please enter value from the list: ");
		//create scanner to read console input
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();

		//create new arrayIntList object and invoke method
		ArrayIntList arrayIntList = new ArrayIntList();
		System.out.println("The last index for the value " + value + " is " + arrayIntList.lastIndexOf(list, value));
	}
}
