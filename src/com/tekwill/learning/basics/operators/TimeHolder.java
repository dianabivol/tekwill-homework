package com.tekwill.learning.basics.operators;

import java.util.Scanner;

public class TimeHolder {
        public static final int SECONDS_IN_1DAY = 86400;
        public static final int SECONDS_IN_1HOUR = 3600;
        public static final int SECONDS_IN_1MINUTE = 60;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of seconds: ");
            long seconds = scanner.nextLong();
            long days = seconds / SECONDS_IN_1DAY;
            long restFromDays = seconds % SECONDS_IN_1DAY;

            long minutes = restFromHours / SECONDS_IN_1MINUTE;
            long restSeconds = restFromHours % SECONDS_IN_1MINUTE;

            long hours = restFromDays / SECONDS_IN_1HOUR;
            long restFromHours = restFromDays % SECONDS_IN_1HOUR;

            System.out.println(seconds + " seconds = " + days + " days, " + hours + " hours, " + minutes + " minutes, " +restSeconds + " seconds.");

        }
    }



