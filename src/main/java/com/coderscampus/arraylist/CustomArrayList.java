package com.coderscampus.arraylist;
import java.lang.Object;
import java.util.*;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size;

	@Override
	public boolean add(T item) {
		if(size == items.length){
			Object[] newItems = new Object[items.length * 2];
			for (int i = 0; i < items.length; i++) {
				newItems[i] = items[i];
			}
			items = newItems;
		}
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index < 0 || index > size){
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds. Actual size is: " + size);
		}

		if(size == items.length){
			Object[] newItems = new Object[items.length * 2];
			for (int i = 0; i < items.length; i++) {
				newItems[i] = items[i];
			}
			items = newItems;
		}

		for (int i = size; i > index; i--) {
			items[i] = items[i-1];
		}

		items[index] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index >= 0 && index < size) {
			return (T) items[index];
		}
		return null;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		if(index < 0 || index >= items.length) {
			throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
		}

		T removedItem = (T) items[index];

		for (int i = index; i < size -1; i++) {
			items[i] = items[i + 1];
		}

		items[size - 1] = null;
		size--;
		return removedItem;
	}

	public int randomNumGenerator () {
        return new Random().nextInt(0, size);
	}
	
}
