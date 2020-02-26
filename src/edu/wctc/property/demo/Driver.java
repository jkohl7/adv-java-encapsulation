package edu.wctc.property.demo;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        int num;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter cylinders: ");
        System.out.println("Must be between " + Engine2.MIN_CYLINDERS + " and " + Engine2.MAX_CYLINDERS);

        num = keyboard.nextInt();

        Engine2 e = new Engine2(num);


        //-----------------------------
        Dog2 dog = new Dog2(5);

        dog.chaseMailCarrier();

        }
    }

