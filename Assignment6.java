/*

Program: Assignment6.java          Date: 17-Nov-2020


Author: Melvin Ulch 
School: CHHS
Course: Computer Science 10
 

*/




import java.util.Scanner;


public class Assignment6 
{
   public static void main(String args[])
         
    {
       Scanner userinput = new Scanner(System.in);
       System.out.println("What is your first name? ");
        String name = userinput.nextLine();
        
       System.out.println("What is your last name? ");
        String name2 = userinput.nextLine();
        
       System.out.println("What grade are you in? ");
        String Grade = userinput.nextLine();
        
       System.out.println("What school do you attend? ");
        String Schoolname = userinput.nextLine();
        
       System.out.println("What is your favourite hobby? ");
        String hobby = userinput.nextLine();
        
       System.out.println("Hello, your name is " +name+ " " +name2+ ", you are "
                + "currently in grade " +Grade+ " at " +Schoolname+ ". Your "
                        + "favourite hobby is " +hobby+ ".");
    }

}

/* Screen Dump
 
Hello, your name is Melvin Ulch, you are currently in grade 11 at Crescent 
heights. Your favourite hobby is working out at golds gym.

 
 */