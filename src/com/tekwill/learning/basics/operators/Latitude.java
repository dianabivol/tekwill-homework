package com.tekwill.learning.basics.operators;
import java.util.Scanner;

public class Latitude {
    public static final double MIN_ARC;

    static {
        MIN_ARC = 60;
    }

    public static final double SEC_ARC;

    static {
        SEC_ARC = 3600;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter the latitude in degrees, minutes and seconds:");
        System.out.println("First, enter the degrees:");
        int degrees = scanner.nextInt();
        System.out.println("Next, enter the minutes of arc:");
        int minutesOfArc = scanner.nextInt();
        System.out.println("Please, enter the seconds of the arc:");
        int secondsOfArc = scanner.nextInt();
        double degreesInDecimal = degrees + (minutesOfArc / MIN_ARC) + (secondsOfArc / SEC_ARC);
        System.out.printf("Latitude is %.4f", degreesInDecimal);
    }
}
