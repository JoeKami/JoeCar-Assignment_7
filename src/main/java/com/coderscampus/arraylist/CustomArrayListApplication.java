package com.coderscampus.arraylist;

public class CustomArrayListApplication {
    public static void main(String[] args) {

        CustomArrayList<String> superHeroes = new CustomArrayList<>();
        superHeroes.add("Dead Pool");
        superHeroes.add("The Flash");
        superHeroes.add("Wolverine");
        superHeroes.add("Black Panther");
        superHeroes.add("Miles Morales");
        superHeroes.add("Cyclops");
        superHeroes.add("Jean Grey");
        superHeroes.add("NightCrawler");
        superHeroes.add("Monkey D Luffy");
        superHeroes.add("Iron Man");
        superHeroes.add("Superman");
        superHeroes.add("Thor");
        superHeroes.add("My Mom");
        superHeroes.add("Keanu Reeves");
        superHeroes.add("Miyazaki Hayao");
        superHeroes.add("ManBat");
        superHeroes.add("Silver Surfer");
        superHeroes.add("The Crimson Chin");
        superHeroes.add("The Hulk");
        superHeroes.add("Mermaid Man");
        superHeroes.add("Barnacle Boy");
        superHeroes.add("Fireman");
        superHeroes.add("Policeman");
        superHeroes.add("EMT");
        superHeroes.add("Goku Kakarot");
        superHeroes.add("Peter Parker");
        superHeroes.add("Captain America");
        superHeroes.add("Aqua Man");
        superHeroes.add("Rick Sanchez");
        superHeroes.add("Human Torch");
        superHeroes.add("Storm");
        superHeroes.add("Cyborg");
        superHeroes.add("Mr. Incredible");
        superHeroes.add("Mrs. Incredible");
        superHeroes.add("Mr. Fantastic");
        superHeroes.add("Mobius Chair Wally West");
        superHeroes.add("Spawn");
        superHeroes.add("Luke Cage");
        superHeroes.add("Green Lantern");
        superHeroes.add("Jubilee");
        superHeroes.add("DareDevil");
        superHeroes.add("X-23");
        superHeroes.add("Ant Man");
        superHeroes.add("Wasp");
        superHeroes.add("Scarlet Witch");
        superHeroes.add("QuickSilver");
        superHeroes.add("Cable");
        superHeroes.add("Vision");
        superHeroes.add("Ghost Rider");
        superHeroes.add("BatMan");

        System.out.println(superHeroes.getSize());
        superHeroes.add(49, "Krypto1");
        System.out.println(superHeroes.getSize());
        System.out.println(superHeroes.get(50));
        superHeroes.remove(1);
        System.out.println(superHeroes.getSize());

    }
}
