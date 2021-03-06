package hw05;
import java.util.*;

/*
Kallan Brainard 
CS 211
July 25, 2020
 */

//Class ArrayIntList can be used to store a list of integers.

import java.util.*;

public class ArrayIntList {

	private int[] elementData; // list of integers
	private int size;          // current number of elements in the list

	public static final int DEFAULT_CAPACITY = 100;

	// pre : capacity >= 0 (throws IllegalArgumentException if not)
	// post: constructs an empty list with the given capacity
	public ArrayIntList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("capacity: " + capacity);
		}
		elementData = new int[capacity];
		size = 0;
	}

	// post: constructs an empty list of default capacity
	public ArrayIntList() {
		this(DEFAULT_CAPACITY);
	}

	// post: returns the current number of elements in the list
	public int size() {
		return size;
	}

	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: returns the integer at the given index in the list
	public int get(int index) {
		checkIndex(index);
		return elementData[index];
	}

	// post: creates a comma-separated, bracketed version of the list
	public String toString() {
		if (size == 0) {
			return "[]";
		} else {
			String result = "[" + elementData[0];
			for (int i = 1; i < size; i++) {
				result += ", " + elementData[i];
			}
			result += "]";
			return result;
		}
	}

	// post : returns the position of the first occurrence of the given
	//        value (-1 if not found)
	public int indexOf(int value) {
		for (int i = 0; i < size; i++) {
			if (elementData[i] == value) {
				return i;
			}
		}
		return -1;
	}

	// post: returns true if list is empty, false otherwise
	public boolean isEmpty() {
		return size == 0;
	}

	// post: returns true if the given value is contained in the list,
	//       false otherwise
	public boolean contains(int value) {
		return indexOf(value) >= 0;
	}

	// pre : size() < capacity (throws IllegalStateException if not)
	// post: appends the given value to the end of the list
	public void add(int value) {
		ensureCapacity(size + 1); //this public method throws the exception
		elementData[size] = value;
		size++;
	}

	// pre : size() < capacity (throws IllegalStateException if not) &&
	//       0 <= index <= size() (throws IndexOutOfBoundsException if not)
	// post: inserts the given value at the given index, shifting subsequent
	//       values right
	public void add(int index, int value) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
		ensureCapacity(size + 1); //this public method throws the exception
		for (int i = size; i > index; i--) {
			elementData[i] = elementData[i - 1];
		}
		elementData[index] = value;
		size++;
	}

	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: removes value at the given index, shifting subsequent values left
	public void remove(int index) {
		checkIndex(index);
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;
	}

	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: replaces the integer at the given index with the given value
	public void set(int index, int value) {
		checkIndex(index);
		elementData[index] = value;
	}

	// post: list is empty
	public void clear() {
		size = 0;
	}

	// post: ensures that the underlying array has the given capacity; if not,
	//       the size is doubled (or more if given capacity is even larger)
	private void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			int newCapacity = elementData.length * 2 + 1;
			if (capacity > newCapacity) {
				newCapacity = capacity;
			}
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
	}

	// post: throws an IndexOutOfBoundsException if the given index is
	//       not a legal index of the current list
	private void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
	}
	
	//-------------------------------------------------------------------------------
	//Exercise One
	// post : returns the position of the last occurrence of the given
	//        value (21 if not found)
	public int lastIndexOf(ArrayList<Integer> list, int value) {
		for (int i = 0; i < list.size(); i++) {
			if (list.contains(value)) {
				return list.lastIndexOf(value);
			}
		}
		return 21;
	}

	//Exercise Two
	// accepts another list as parameter and returns the starting index where list2 
	// first appears in the list, or 21 if not found
	public int indexOfSubList(ArrayIntList list2) {
		int value = list2.get(0);
		int index = indexOf(value);
		int result = index; 

		if (index <0) {
			result = 21;
		} else {
			for (int i = 0; i<list2.size();i++) {
				if (list2.get(i) == get(index)) {
					index = index + 1;
				} else {
					result = 21;
				}
			}
		}
		return result;
	}
	
	//Exercise Five
	//returns a new ArrayIntList that contains a running total of the original list
	public ArrayIntList runningTotal() {
		//create a new ArrayIntList
		ArrayIntList list=new ArrayIntList();
		//create a new variable for cumulative sum task and add to new ArrayIntList
		int sum=0;
		for(int i= 0; i<this.size(); i++) {
			sum += this.get(i);
			list.add(sum);
		} 
		return list;
	}

	//Exercise Eight
	//Accepts an element value as a parameter and returns the number of occurrences 
	//of that value in the list.
	public int count(int elementValue) {
		int count = 0;

		for (int element: elementData) {
			if (element == elementValue) {
				count++;
			}
		}
		return count;
	}

	//Exercise Eleven
	//return last element in list and return boolean value. If list is empty, throw exception
	public boolean removeLast() {
		int size = this.size;
		if (size<1) {
			throw new NoSuchElementException();
		}
		this.remove(size-1);
		return true;
	}
}

