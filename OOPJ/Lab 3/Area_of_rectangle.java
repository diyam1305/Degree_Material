//(3) Write a program to calculate the area of Rectangle.
import java.util.*;
public class Area_of_rectangle 
{
    public static void main(String[] args) 
    {
        int l, b, area;
        System.out.print("Enter length and breadth:");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();
        area = l * b;
        System.out.print("Area of rectangle:" + area);
    }    
}
