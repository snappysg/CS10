/*

Program: Assignment15.java          Date: June 6, 2022


Author: Melvin Ulch 
School: CHHS
Course: Computer Science 10

*/



import java.util.Random;
import java.util.Scanner;



public class Assignment15 
{
    public static void main(String args[])
    {
        //I tried to go above and beyond like you said
        Scanner userinput = new Scanner(System.in);
        String a;

        do{

        String operatorSwitch;
        int b;
        int c = 0;

        Random number = new Random();
        int d = number.nextInt(50) +1;
        int e = number.nextInt(50) +1;

        Random operatorChoice = new Random();
        int operator = operatorChoice.nextInt(4);

        switch (operator){

            case 0: operatorSwitch= "+";
                c = d+e;
                break;
            case 1: operatorSwitch= "-";
                c = d-e;
                break;
            case 2: operatorSwitch= "*";
                c = d*e;
                break;
            case 3: operatorSwitch= "/";
                c = d/e;
                break;
            default: operatorSwitch= "";
        }
        System.out.println("What is: "+d+operatorSwitch+e+"?");
        b = userinput.nextInt();


        if(b!=c)
            System.out.println("Wrong answer! Right answer is: "+c);
        else{if(b==c)
            System.out.println("Right answer!"+c);
        }
            System.out.println("Continue? y/n");
            a = userinput.next();

        }while(a.equals("y"));
        
        

    }

}


/* Screen Dump

What is: 2*39?
78
Right answer!78
Continue? y/n
n
 
 */