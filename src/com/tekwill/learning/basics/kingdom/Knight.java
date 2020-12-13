package com.tekwill.learning.basics.kingdom;

import static com.tekwill.learning.basics.nonaccessmodifiers.kingdom.Knight.guild;


public class KnightDemo {
    public static void main(String[] args) {
        Knight knight1 = new Knight(1, "A");
        Knight knight2 = new Knight(2, "B");
        Knight knight3 = new Knight(3, "C");

        System.out.println(knight1);
        System.out.println("knight2.nickname = " + knight2.nickname);
        System.out.println("knight3.age = " + knight3.age);
        System.out.println(guild);
        knight1.fight();
        knight2.fight();
        knight2.invokeMagic();
        System.out.println(guild);
        Knight.invokeMagic();
    }
}
