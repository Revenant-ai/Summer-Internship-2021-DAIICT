/*
Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.

EXAMPLES OF INPUT/OUTPUT:

* hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1

* hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2

* hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0

*/

import java.util.Scanner;
public class challenge3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();

        System.out.println("Enter the Second number");
        int b=sc.nextInt();

        System.out.println("Enter the Third number");
        int c=sc.nextInt();

        print_result(hasEqualSum(a, b, c));
    }
    public static boolean hasEqualSum(int a, int b, int c)
    {
        if(a+b==c)
        {
            return true;

        }
        else
        {
            return false;
        }
    }
    public static void print_result(boolean result)
    {
        if(result==true)
        {
            System.out.println("The sum is correct");
        }
        else{
            System.out.println("The sum is Incorrect");
        }
    }
}
