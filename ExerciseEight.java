package hw05;
/*
Kallan Brainard 
CS 211
July 25, 2020

8. Write a method called count that accepts an element value as a
parameter and returns the number of occurrences of that value in the list.
For example, suppose a variable named list stores [2, -3, 2, 0, 5,
2, 2, 6]. A call of list.count(2) should return 4 because there are
four occurrences of that value in the list.
 */

import java.util.*;

public class ExerciseEight {

	public static void main(String[] args) {
		//create array and store into a new array list called list1
		int [] array = {2, -3, 2, 0, 5, 2, 2, 6};
		ArrayIntList list = new ArrayIntList();
		for (int i: array) {
			list.add(i);
		}
		
		System.out.println("List of Integers: " + list);
		System.out.println("2 occurs " + list.count(2) + " times");
	}
}
