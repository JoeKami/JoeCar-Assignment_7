package com.coderscampus.arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    @Test
    void should_Add_Item() {
        //Arrange
        CustomArrayList<String> superHeroes = new CustomArrayList<>();

        //Act
        superHeroes.add("SpiderMan");

        //Assert
        assertEquals(1, superHeroes.getSize());
        assertEquals("SpiderMan", superHeroes.get(0));
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

        //Assert
        assertEquals("Monkey D. Luffy", superHeroes.get(1));
        superHeroes.add(2, "Might Guy");
//        System.out.println(superHeroes.get(2));
        assertEquals(5, superHeroes.getSize());
        assertEquals("Monkey D. Luffy", superHeroes.get(1));
        assertEquals("Invincible", superHeroes.get(4));
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
    }

}