/*

Program: Assignment12.java          Date: June 6,2022


Author: Melvin Ulch 
School: CHHS
Course: Computer Science 10
 

*/




import java.util.Scanner;


public class Assignment12 
{
 public static void main(String args[])
    {
       Scanner userinput = new Scanner(System.in);
       System.out.println("Enter your grade: ");
       int grade = userinput.nextInt();
       if (grade > 90)
       {
           System.out.println("Your grade letter is A+");
       }
       else if ((grade < 89)&&(grade > 80))
       {
           System.out.println("Your grade letter is A ");
       }
       else if ((grade < 79)&&(grade > 75))
       {
           System.out.println("Your grade letter is B+ ");
       }
       else if ((grade < 74)&&(grade > 70))
       {
           System.out.println("Your grade letter is B ");
       }
       else if ((grade < 69)&&(grade > 65))
       {
           System.out.println("Your grade letter is C+ ");
       }
       else if ((grade < 60)&&(grade > 64))
       {
           System.out.println("Your grade letter is C ");
       }
       else if ((grade < 55)&&(grade > 59))
       {
           System.out.println("Your grade letter is D+ ");
       }
       else if ((grade < 54)&&(grade > 50))
       {
           System.out.println("Your grade letter is D ");
       }
       else 
       {
           System.out.println("Your grade letter is F ");
       }   

       
    }

}

/* Screen Dump
 
Enter your grade: 
100
Your grade letter is A+

 
 */