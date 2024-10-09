package com.coderscampus.arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    @Test
    void should_Add_Item() {
        //Arrange
        CustomArrayList<String> superHeroes = new CustomArrayList<>();

        //Act
        superHeroes.add("SpiderMan1");
        superHeroes.add("SpiderMan2");
        superHeroes.add("SpiderMan3");
        superHeroes.add("SpiderMan4");
        superHeroes.add("SpiderMan5");
        superHeroes.add("SpiderMan6");
        superHeroes.add("SpiderMan7");
        superHeroes.add("SpiderMan8");
        superHeroes.add("SpiderMan9");
        superHeroes.add("SpiderMan10");


        //Assert
        assertEquals(10, superHeroes.getSize());
        assertEquals("SpiderMan1", superHeroes.get(0));
        assertTrue(superHeroes.add("SpiderMan11"));
        assertEquals(11, superHeroes.getSize());
        assertEquals("SpiderMan11", superHeroes.get(10));

    }

    @Test
    void should_Add_Item_By_Index() {
        //Arrange
        CustomArrayList<String> superHeroes = new CustomArrayList<>();

        //Act
        superHeroes.add(0, "Johnny SilverHand");
        superHeroes.add(1, "Monkey D. Luffy");
        superHeroes.add(2, "Wally West");
        superHeroes.add(3, "Invincible");
        superHeroes.add(4,"SpiderMan4");
        superHeroes.add(5,"SpiderMan5");
        superHeroes.add(6,"SpiderMan6");
        superHeroes.add(7,"SpiderMan7");
        superHeroes.add(8,"SpiderMan8");
        superHeroes.add(9,"SpiderMan9");



        //Assert
        assertEquals("Monkey D. Luffy", superHeroes.get(1));
        assertEquals(10, superHeroes.getSize());
        assertTrue(superHeroes.add(2, "Might Guy"));
        assertEquals(11, superHeroes.getSize());
        assertEquals("Monkey D. Luffy", superHeroes.get(1));
        assertEquals("Invincible", superHeroes.get(4));
        

        Exception exception1 = assertThrows(IndexOutOfBoundsException.class, () -> {
            superHeroes.add(-1, "SuperMan");
        });
        assertEquals("Index: -1 is out of bounds. Actual size is: 11", exception1.getMessage());

        Exception exception2 = assertThrows(IndexOutOfBoundsException.class, () -> {
            superHeroes.add(100000, "BatMan");
        });
        assertEquals("Index: 100000 is out of bounds. Actual size is: 11", exception2.getMessage());
    }

    @Test
    void should_Get_Size() {
        //Arrange
        CustomArrayList<String> superHeroes = new CustomArrayList<>();

        //Act
        superHeroes.add(0, "Johnny SilverHand");
        superHeroes.add(1, "Monkey D. Luffy");
        superHeroes.add(2, "Wally West");
        superHeroes.add(3, "Invincible");

        //Assert
        assertEquals(4, superHeroes.getSize());
        superHeroes.add("Mom");
        assertEquals(5, superHeroes.getSize());
    }

    @Test
    void should_Get() {
        //Arrange
        CustomArrayList<String> superHeroes = new CustomArrayList<>();

        //Act
        superHeroes.add(0, "Johnny SilverHand");
        superHeroes.add(1, "Monkey D. Luffy");
        superHeroes.add(2, "Wally West");
        superHeroes.add(3, "Invincible");

        //Assert
        assertEquals("Monkey D. Luffy", superHeroes.get(1));
        assertEquals("Johnny SilverHand", superHeroes.get(0));
        assertEquals("Invincible", superHeroes.get(3));
        Exception exception1 = assertThrows(IndexOutOfBoundsException.class, () -> {
            superHeroes.get(-1);
        });
        assertEquals("Index: -1 is out of bounds. Actual size is: 4", exception1.getMessage());

        Exception exception2 = assertThrows(IndexOutOfBoundsException.class, () -> {
            superHeroes.get(100000);
        });
        assertEquals("Index: 100000 is out of bounds. Actual size is: 4", exception2.getMessage());

    }

    @Test
    void should_Remove() {
        //Arrange
        CustomArrayList<String> superHeroes = new CustomArrayList<>();

        //Act
        superHeroes.add(0, "Johnny SilverHand");
        superHeroes.add(1, "Monkey D. Luffy");
        superHeroes.add(2, "Wally West");
        superHeroes.add(3, "Invincible");
        String removedItem = superHeroes.remove(2);

        //Assert
        assertEquals("Wally West", removedItem);
        assertEquals(3, superHeroes.getSize());
        assertEquals("Johnny SilverHand", superHeroes.get(0));
        assertEquals("Invincible", superHeroes.get(2));
        Exception exception1 = assertThrows(IndexOutOfBoundsException.class, () -> {
            superHeroes.remove(-1);
        });
        assertEquals("Index: -1 is out of bounds. Actual size is: 3", exception1.getMessage());

        Exception exception2 = assertThrows(IndexOutOfBoundsException.class, () -> {
            superHeroes.remove(100000);
        });
        assertEquals("Index: 100000 is out of bounds. Actual size is: 3", exception2.getMessage());

    }

}