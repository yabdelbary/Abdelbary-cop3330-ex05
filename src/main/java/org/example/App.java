package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
    System.out.println("what is the first number?");
    Scanner sc = new Scanner(System.in);
    String firstNumb = sc.next();
    System.out.println("What is the second number?");
    String secondNumb = sc.next();
    int numb1 = Integer.parseInt(firstNumb);
    int numb2 = Integer.parseInt(secondNumb);
    System.out.println(numb1 + " +" + " "+ numb2 +" "+  "=" + " "+(numb1 + numb2) );
    System.out.println(numb1 + " -" + " "+numb2 +" "+ "=" + " "+(numb1 - numb2)  );
    System.out.println(numb1 + " *" + " "+ numb2 +" "+ "=" + " "+(numb1 * numb2));
    System.out.println(numb1 + " /" + " "+numb2 +" "+ "=" + " "+(numb1 / numb2));
    }
}
