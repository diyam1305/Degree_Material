//(2) Write a program to create basic calculator by getting 2 numbers and an operation(+,-,/,*,%) from the user and apply the operation given in a string on the given numbers.
import java.util.*;
public class Calc
{
    public static void main(String[] args)
    {
        int a, b, ans;
        System.out.print("Enter a and b:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Press + for Addition \n");
        System.out.print("Press - for Subtraction \n");
        System.out.print("Press * for Multiplication \n");
        System.out.print("Press / for Division \n");
        System.out.print("Enter your choice:");
        char choice = sc.next().charAt(0);
        switch(choice)
        {
            case '+':
                ans = a + b;
                System.out.print("Ans:" + ans);
                break;
            
            case '-':
                ans = a - b;
                System.out.print("Ans:" + ans);
                break;

            case '*':
                ans = a * b;
                System.out.print("Ans:" + ans);
                break;

            case '/':
                ans = a / b;
                System.out.print("Ans:" + ans);
                break;

            default:
                System.out.print("Invalid");
                break;
        }
    }
}
