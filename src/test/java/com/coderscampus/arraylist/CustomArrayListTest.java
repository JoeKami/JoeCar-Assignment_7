package com.coderscampus.arraylist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    private final CustomArrayList<String> list = new CustomArrayList<>();

    @DisplayName("This test should allow us to add a large number of items without failure.")
    @Test
    void should_Add_Large_Number_Of_Items() {

        //Act
        for (int i = 0; i < 100000; i++) {
            list.add("Item" + i);
        }

        //Assert
        assertEquals(100000, list.getSize());
        assertEquals("Item0", list.get(0));
        assertEquals("Item99999", list.get(99999));

    }

    @DisplayName("This test should allow us to add an item at any specific index and shift the rest of the list to the right.")
    @Test
    void should_Add_Item_By_Index() {

        //Act
        for (int i = 0; i < 10; i++) {
            list.add("Item" + i);
        }

        //Assert
        assertEquals("Item1", list.get(1));
        assertEquals(10, list.getSize());
        assertTrue(list.add(2, "NewItem"));
        assertEquals(11, list.getSize());
        assertEquals("NewItem", list.get(2));
        assertEquals("Item3", list.get(4));
    }

    @DisplayName("This test should show the size of the list.")
    @Test
    void should_Get_Size() {

        //Act
        list.add(0, "Item0");
        list.add(1, "Item1");
        list.add(2, "Item2");
        list.add(3, "Item3");

        //Assert
        assertEquals(4, list.getSize());
        list.add("NewItem");
        assertEquals(5, list.getSize());
    }

    @DisplayName("This test should allow us to get an item based on its index.")
    @Test
    void should_Get() {

        //Act
        list.add(0, "Item0");
        list.add(1, "Item1");
        list.add(2, "Item2");
        list.add(3, "Item3");

        //Assert
        assertEquals("Item1", list.get(1));
        assertEquals("Item0", list.get(0));
        assertEquals("Item3", list.get(3));
    }

    @Test
    void should_Remove() {

        //Act
        list.add(0, "Item0");
        list.add(1, "Item1");
        list.add(2, "Item2");
        list.add(3, "Item3");
        String removedItem = list.remove(2);

        //Assert
        assertEquals("Item2", removedItem);
        assertEquals(3, list.getSize());
        assertEquals("Item0", list.get(0));
        assertEquals("Item3", list.get(2));
    }

    @DisplayName("This test should correctly validate the index when adding items, and throw an error message when invalid index is found.")
    @Test
    void should_Throw_IndexOutOfBounds_Exception_When_Adding_Invalid_Index() {
        Exception exception1 = assertThrows(IndexOutOfBoundsException.class, () -> {
            list.add(-1, "OutOfBoundsItem");
        });
        assertEquals("Index: -1 is out of bounds. Actual size is: 0", exception1.getMessage());

        Exception exception2 = assertThrows(IndexOutOfBoundsException.class, () -> {
            list.add(100000, "OutOfBoundsItem");
        });
        assertEquals("Index: 100000 is out of bounds. Actual size is: 0", exception2.getMessage());
    }

    @DisplayName("This test should correctly validate the index when getting items, and throw an error message when invalid index is found.")
    @Test
    void should_Throw_IndexOutOfBounds_Exception_When_Getting_Invalid_Index() {

        Exception exception1 = assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(-1);
        });
        assertEquals("Index: -1 is out of bounds. Actual size is: 0", exception1.getMessage());

        Exception exception2 = assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(100000);
        });
        assertEquals("Index: 100000 is out of bounds. Actual size is: 0", exception2.getMessage());

    }
}