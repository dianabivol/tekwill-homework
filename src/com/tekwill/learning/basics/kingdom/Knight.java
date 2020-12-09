package com.tekwill.learning.basics.kingdom;

public class Knight {
    static String fight = "GF";
    int age;
    int nickname;
    private int guild;

    public Knight(int age, int nickname, int guild) {
        this.age = age;
        this.nickname = nickname;
        this.guild = guild;
    }

    public Knight(int age, int nickname, int guild) {
        this.age = age;
        this.nickname = nickname;
        this.guild = guild;
    }

    public static void anotherStaticMethod() {

    }

    public static void staticMethod() {

        fight = "GF"; // static fields can be accessed from static method
        anotherStaticMethod(); // static methods can be accessed from static method
    }

    public void fightMethod() {
        staticMethod();Method(); // static can be accessed from instance
        fight = "GF"; // static can be accessed from instance

        age = 30; // instance can be accessed from instance
        nickname = 'A'; // instance can be accessed from instance
        anotherInstanceMethod(); // instance can be accessed from instance

    }

    public void anotherInstanceMethod() {

    }

    public int getAge() {
        return age;
    }

    public void setGuild(int guild) {
        this.guild = guild;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "age=" + age +
                ", nickname=" + nickname +
                ", guild=" + guild +
                '}';
    }
}
}
