package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//        Write a program that loops numbers 1 - 100 and returns if the number if the number is a prime number or not
//        For Example:
// 1
// 2 is a prime number
// 3 is a prime number
// 4
// 5 is a prime number

//        int numberOfNumbers = 100; // initialize a variable with the number of numbers
//        for(int i = 1; i <= numberOfNumbers; i++) { // create a loop to loop through that
//
//            if (i == 1) {
//                System.out.println(i);
//                continue; // continue skips the current iteration/repetition and moves to the next one
//            }
//
//            // create a counter to count how many numbers can divide that number
//            int counter = 0;
//            // we loop through from 2 to half that number (integer division)
//            // integer division does not return decimal
//            for (int j = 2; j <= i / 2; j++) { // 2, 3
//                // we check for divisibility between numbers
//                // from 2 to half the current value of i
//                if (i % j == 0) {
//                    counter++; // if we find a number that is divisible
//                    // then increase the counter by 1.
//                }
//            }
//
//            // if the counter is 0, then it is a prime number
//            if (counter == 0) {
//                System.out.println(i + " is a prime number"); // concatenation
//            } else { // else it is not so just print it out
//                System.out.println(i);
//            }
//        }

        // Conversion casting
        // Strings, wrapper classes
        // Regular Expressions
        // Arrays

        // 1. Conversion casting
        // byte ->  short ->  int -> long ->  float -> double.
        // Byte     Short    Integer  Long    Float    Double  // decimal
//        double var2 = 8.8;
//        int var1 = (int)var2;
//
//        System.out.println(var1);

        // Write a program to divide the following numbers: 4.89 by 2.1
        // Take them as doubles.
        // print the result as an integer.

        // 2. Strings, wrapper classes
        // concatenation is the process of joining
        // two strings together to form a new string

        int val = 8;

                 // 01234
        // the length of the string is always one unit greater than the
        // last index or position on the string
        String a = "7";
        double number = Double.parseDouble(a);
        System.out.println(number + 9);

        // Write a program to that will take two number values as strings
        // and perform multiplication on them.

        // Write a program to print out the even indexes on a string
        // "juice"- 01234
        // 5 mins





//        System.out.println(a.charAt(9));
//        System.out.println(a.toLowerCase());

//        for(int i = 0; i < a.length(); i++) {
////            System.out.println(a.charAt(i));
//        }

//        System.out.println("Hello " + "World");

        // Regular Expressions(Regex)

        // A-Z a-z = "Baby"
        // "[A-Za-z]+"

        // The pattern class is used to compile the regex string
        // or the pattern we want to check for
//        Pattern pattern = Pattern.compile("[0-9]");
//
//        // this object is used to create an object with the string we
//        // are comparing the pattern with
//        Matcher matcher = pattern.matcher("4987665");
//
//        // this matches() method simply returns a boolean value if the
//        // string matches the pattern.
//        if (matcher.matches()) {
//            System.out.println("You can enter");
//        } else {
//            System.out.println("You are not allowed");
//        }
//        System.out.println(matcher.matches());


        // 4. Arrays
        // An array is a data structure that allows you to store
        // multiple values of the same data type.
        // Arrays have a fixed size or fixed length once they are created.
        // the length of the array is always one unit greater than the
        // last index or position on the array
        //
        // int a = 5;
        // First way to create an array.
//         int[] arrayValues = {3, 5, 8, 20};
//                           // 0  1  2  3
//
//        for (int i = 0; i < arrayValues.length; i++) {
//            System.out.println(arrayValues[i]);
//        }

        // Second way to create an array
//        String[] arrayValues = new String[4];
//        arrayValues[0] = "Hera";
//        arrayValues[1] = "James";
//        System.out.println(arrayValues[2]);

        // Write a program to take a series ages from children
        // in an array and get the average.
        // average = sum of the values / number of values

//        Ctrl or Command + /
//         Initialize the scanner
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter the number of ages
//        // In simple terms, this is telling the user to enter the size of the array
//        System.out.print("Enter the number of ages to average: ");
//        int numberOfAges = scanner.nextInt();
//
//        // initialize the ages array
//        int[] ages = new int[numberOfAges];
//
//        // Loop through and tell the user to enter all the ages
//        for (int i = 0; i < ages.length; i++) {
//            System.out.print("Enter the next age: ");
//            ages[i] = scanner.nextInt();
//        }
//
//        // Find the sum
//        double sum = 0;
//
//        for (int i = 0; i < ages.length; i++) {
//            sum += ages[i]; // add the values of the array to the sum variable to give us the sum
//        }
//
////        System.out.println("The average of the ages of the children is: " + sum / ages.length);
//        System.out.println(Arrays.toString(ages));

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the upper limit
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        // create an array with half the size of the upper limit + 1
        int[] evenNumbers = new int[upperLimit/2];

        // create a loop to run through from 1 - the upper limit and filter
        // the even numbers into the array
        int counter = 0;
        for (int i = 0; i < upperLimit; i++) {
            if(i % 2 == 0) {
                evenNumbers[counter] = i;
                counter++;
            }
        }

        System.out.println(Arrays.toString(evenNumbers));

    }

    // Write a program to loop through from 1 - (number entered by user) that enters
    // and add the even numbers to an array.
    // Print out the array using Arrays.toString(arrayVariable)
    // e.g
    // Enter an upper limit: 30
    // [2, 4, 6, 8, ...]

}
