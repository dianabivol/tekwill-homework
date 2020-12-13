package com.tekwill.learning.basics.cooking;

public class Recipe {
    public static String sourceUrl = "https://www.test/";
    public String name;
    public String info;

    public static void markAsCooked() { System.out.println("Coooooked!");}

    public void update() {System.out.println("Updating");}

    public Recipe(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public static void staticMethod() {
        markAsCooked();
        System.out.println(sourceUrl);
        //update();    cannot access
    }

    public void instanceMethod() {
        update();
        name = "NAME";

        markAsCooked();
        System.out.println(sourceUrl);
    }

    @Override
    public String toString() {
        return "Recipe {" +
                "name = " + name +
                ", info = " + info +
                "}" ;
    }
}
