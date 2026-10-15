package com.pluralsight;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
       //1
        int bobSalary = 40000;
        int garySalary = 60000;
        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is $" + highestSalary);
        //2
        int carPrice = 7000;
        int truckPrice = 20000;
        int lowestSalary = Math.min(carPrice,truckPrice);
        System.out.println("The lowest salary is $" + lowestSalary);
        //3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is " + area);
        //4
        double number = 5.0;
        System.out.println(Math.cbrt(number));
        //5
        int x1 = 5, y1 = 10, x2 =85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2));
        System.out.println("The Distance between points is " + distance);
        //6
        double numbers = -3.8;

        double absoluteValue = Math.abs(numbers);

        System.out.println("The absolute value is " + absoluteValue);
        //7
        double randomNumber = Math.random();

        System.out.println("Random number: " + randomNumber);
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;
        int hours = days * hoursPerDay;
        int minutes = hours * minutesPerHour;
        int seconds = Math.multiplyExact(minutes, secondsPerMinute);
        long milliseconds = Math.multiplyExact(seconds, millisecondsPerSecond);
        System.out.println("Minutes in " + days + " days: " + minutes);
        System.out.println("Milliseconds in " + days + " days: " + milliseconds);







    }
}
