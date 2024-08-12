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
        superHeroes.add("The Flash11");
        superHeroes.add("The Flash12");
        superHeroes.add("The Flash13");
        superHeroes.add("The Flash14");
        superHeroes.add("The Flash15");
        superHeroes.add("The Flash16");
        superHeroes.add("The Flash17");
        superHeroes.add("The Flash18");
        superHeroes.add("The Flash19");
        superHeroes.add("The Flash121");
        superHeroes.add("The Flash122");
        superHeroes.add("The Flash123");
        superHeroes.add("The Flash132");
        superHeroes.add("The Flash124");
        superHeroes.add("The Flash146");
        superHeroes.add("The Flash167");
        superHeroes.add("The Flash176");
        superHeroes.add("The Flash154");
        superHeroes.add("The Flash148");
        superHeroes.add("The Flash189");
        superHeroes.add("The Flash81");
        superHeroes.add("The Flash7");
        superHeroes.add("The Flash6");
        superHeroes.add("The Flash5");
        superHeroes.add("The Flash4");
        superHeroes.add("The Flash3");
        superHeroes.add("The Flash2");


        System.out.println("Super Heroes waiting to fight: ");
        System.out.println(superHeroes.getSize());
        System.out.println("The next Heros fighting are: ");
        System.out.println(superHeroes.get(44));
        System.out.println(superHeroes.get(16));

        System.out.println("-------------");

        for (int i=0; i<superHeroes.getSize(); i++) {
            System.out.println(superHeroes.get(i));
        }
    }
}
