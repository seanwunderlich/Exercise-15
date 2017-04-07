/**
 * Sean Wunderlich
 * ITSE 1302-011
 * Exercise 15
 * Even integer sum program
 */

//This program prints all the even integers between 2 and the number inputted and adds them all up

import java.util.Scanner;

public class EvenIntegerSum
{
    public static void main(String[] args)
    {
        int intNumber = 0;
        int intSum = 0;
        //Initializes variables to 0

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        intNumber = scan.nextInt();

        if (intNumber < 2)
        {
            System.out.println("Invalid Entry."); //If entry is less than 2, print invalid entry
        }
        else
            {
                System.out.println("The sum of the even numbers between 2 and " + intNumber + " are: ");
                for (int intCount = 2; intCount <= intNumber; intCount += 2)
                    //for when the count is less than or equal to the number
                    {
                        if((intCount & 1) != 1) //if the number is even
                            {
                                intSum += intCount; //the sum equals the total numbers counted
                                System.out.println(intCount);
                            }
                    }
            System.out.println("The sum is " + intSum);
            }
    }
}
