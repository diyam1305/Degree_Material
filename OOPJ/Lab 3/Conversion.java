//4 Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-32*5/9 )
import java.util.*;
public class Conversion 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter temperature in fahrenheit:");
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        float c = f-32*5/9;
        System.out.print("Conversion:" + c);
    }
}
