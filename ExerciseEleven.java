package hw05;
/*
Kallan Brainard 
CS 211
July 25, 2020

11. Write a method called removeLast that removes and returns the last
value from a list of integers. For example, if a variable called list stores
[8, 17, 42, 3, 8], a call of list.removeLast(); should return 8 and
change the list's state to [8, 17, 42, 3]. The next call would return 3
and remove 3 from the list, and so on. If the list is empty, throw a
NoSuchElementException.
 */   

import java.util.*;

public class ExerciseEleven {

	public static void main(String[] args) {
		//create array and store into a new array list called list1
		int [] array = {8, 17, 42, 3, 8};
		ArrayIntList list1 = new ArrayIntList();
		for (int i: array) {
			list1.add(i);
		}
		
		//display output
		System.out.println("Original List:" + list1);
		//remove last element
		list1.removeLast();
		System.out.println("New List After Last Integer Removal Method: " + list1);
		
		//display output when list is empty and throw a NoSuchElementException
		ArrayIntList list2 = new ArrayIntList();
		System.out.println("\nEmpty List: " + list2);
		list2.removeLast();
		System.out.println("New List After Last Integer Removal Method: " + list2);
	}
}
