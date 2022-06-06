/*

Program: Assignment8.java          Date: June 6, 2022


Author: Melvin Ulch 
School: CHHS
Course: Computer Science 10
 

*/


package Assignments;

import java.util.Scanner;


public class Assignment8 
{
 public static void main(String args[])
    {
       Scanner userinput = new Scanner(System.in);
       System.out.println("Enter three digits: ");
       int digit = userinput.nextInt();
       int first = digit / 100;
       int second = (digit / 10) % 1;
       int third = digit % 10;
       System.out.println("The hundreds place digit is: " +first);
       System.out.println("The tens place digit is: " +second);
       System.out.println("The ones place digit is: " +third);

       
    }

}

/* Screen Dump
 
Enter three digits: 
437
The hundreds place digit is: 4
The tens place digit is: 0
The ones place digit is: 7

 
 */