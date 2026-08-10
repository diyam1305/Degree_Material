// //(2) Write a program to create basic calculator by getting 2 numbers and an operation(+,-,/,*,%) from the user and apply the operation given in a string on the given numbers.
// import java.util.*;
// public class Calc
// {
//     public static void main(String[] args)
//     {
//         int a, b, ans;
//         System.out.print("Enter a and b:");
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         b = sc.nextInt();
//         System.out.print("Press + for Addition \n");
//         System.out.print("Press - for Subtraction \n");
//         System.out.print("Press * for Multiplication \n");
//         System.out.print("Press / for Division \n");
//         System.out.print("Enter your choice:");
//         char choice = sc.next().charAt(0);
//         switch(choice)
//         {
//             case '+':
//                 ans = a + b;
//                 System.out.print("Ans:" + ans);
//                 break;
            
//             case '-':
//                 ans = a - b;
//                 System.out.print("Ans:" + ans);
//                 break;

//             case '*':
//                 ans = a * b;
//                 System.out.print("Ans:" + ans);
//                 break;

//             case '/':
//                 ans = a / b;
//                 System.out.print("Ans:" + ans);
//                 break;

//             default:
//                 System.out.print("Invalid");
//                 break;
//         }
//         sc.close();
//     }
// }


//extra
import java.util.*;
public class Calc
{
    public static void main(String[] args)
    {
        int a, b, ans;
        char choice;
        char again = 'y';
        Scanner sc = new Scanner(System.in);
        while (again == 'y' || again == 'Y') 
        {
            System.out.print("Enter a and b: ");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.print("\nPress + for Addition\n");
            System.out.print("Press - for Subtraction\n");
            System.out.print("Press * for Multiplication\n");
            System.out.print("Press / for Division\n");
            System.out.print("Press 0 for Exit\n");
            System.out.print("Enter your choice: ");

            choice = sc.next().charAt(0);

            switch(choice)
            {
                case '+':
                    ans = a + b;
                    System.out.println("Ans: " + ans);
                    break;

                case '-':
                    ans = a - b;
                    System.out.println("Ans: " + ans);
                    break;

                case '*':
                    ans = a * b;
                    System.out.println("Ans: " + ans);
                    break;

                case '/':
                    ans = a / b;
                    System.out.println("Ans: " + ans);
                    break;

                case '0':
                    System.out.println("Program terminated.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do u want to continue? Y? N?");
            again = sc.next().charAt(0);
        }
        sc.close();
    }
}
