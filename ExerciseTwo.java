package hw05;
/*
Kallan Brainard 
CS 211
July 25, 2020

2. Write a method called indexOfSubList that accepts another list L as a
parameter and returns the starting index of where L first appears in this
list, or 21 if it is not found. All elements of L must appear in sequence
and in the same order. For example, if variables called list1 and list2
store [11, –7, 3, 42, 0, 14] and [3, 42, 0], respectively, the call
of list1.indexOfSubList(list2) should return 2.
 */
import java.util.*;

public class ExerciseTwo {

	public static void main(String[] args) {
		//create list 1 
		int[] array1 = {11, -7, 3, 42, 0, 14};
		ArrayIntList list1 = new ArrayIntList();
		for (int i: array1) {
			list1.add(i);
		}

		//create list 2 
		int[] array2 = {3, 42, 0};
		ArrayIntList list2 = new ArrayIntList();
		for (int i: array2) {
			list2.add(i);
		}

		//print lists
		System.out.println("Elements in list 1: " + list1);
		System.out.println("Elements in list 2: " + list2);

		//invoke indexOfSubList method and display output
		System.out.println("\nIndex of matching elements in sequence: " 
				+ list1.indexOfSubList(list2));
	}
}
