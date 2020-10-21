package hw05;
/*
Kallan Brainard 
CS 211
July 25, 2020

5. Write a method called runningTotal that returns a new ArrayIntList
that contains a running total of the original list. In other words, the ith
value in the new list should store the sum of elements 0 through i of the
original list. For example, given a variable list that stores 
[2, 3, 5, 4, 7, 15, 20, 7], consider what happens when the following call is made:
ArrayIntList list2 = list.runningTotal();
The variable list2 should store [2, 5, 10, 14, 21, 36, 56, 63].
The original list should not be changed by the method. If the original list
is empty, the result should be an empty list. The new list should have the
same capacity as the original. Remember that there is a list constructor
that accepts a capacity as a parameter.
 */
import java.util.*;

public class ExerciseFive {

	public static void main(String[] args) {
		//create array and store into a new array list called list1
		int [] array1 = {2, 3, 5, 4, 7, 15, 20, 7};
		ArrayIntList list1 = new ArrayIntList();
		for (int i: array1) {
			list1.add(i);
		}

		//invoke runningTotal method and display output
		System.out.println("List of Integers: " + list1);
		ArrayIntList list2 = list1.runningTotal();
		System.out.println("Running Total: " + list2);

		int [] array2 = {};
		ArrayIntList list3 = new ArrayIntList();
		for (int i: array2) {
			list3.add(i);
		}

		//invoke runningTotal method and display output
		System.out.println("\nEmpty list: " + list3);
		ArrayIntList list4 = list3.runningTotal();
		System.out.println("Running Total: " + list4);
	}
}
