//5 Write a program that prompts the user to enter three numbers. Find the largest number.

import java.util.*;
public class Largest 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter a, b and c:");
        Scanner sc = new Scanner(System.in);  
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c)
        {
            System.out.print(a + " is largest");
        }
        else if(b > a && b > c)
        {
            System.out.print(b + " is largest");
        }
        else
        {
            System.out.print(c + " is largest");
        }
        sc.close();  
    }    
}
