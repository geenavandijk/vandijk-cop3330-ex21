/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class NumbersToNames {

    static public void main (String[] args){
        Scanner input = new Scanner(System.in);

        int number;
        String name = "";

        System.out.println("Please enter the number of the month: ");

        number = input.nextInt();

        switch (number){
            case 1: name = "January";
                    break;
            case 2: name = "February";
                    break;
            case 3: name = "March";
                    break;
            case 4: name = "April";
                    break;
            case 5: name = "May";
                    break;
            case 6: name = "June";
                    break;
            case 7: name = "July";
                    break;
            case 8: name = "August";
                    break;
            case 9: name = "September";
                    break;
            case 10: name = "October";
                    break;
            case 11: name = "November";
                    break;
            case 12: name = "December";
                    break;
        }

        System.out.println("The name of the month is "+name+".");


    }
}
