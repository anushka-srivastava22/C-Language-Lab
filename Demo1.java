import java.util.Scanner;
public class Demo1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number ");
        int n2 = sc.nextInt();
        System.out.println("Enter third number ");
        int n3 = sc.nextInt();
        System.out.println("Sum = "+(n1+n2));
        System.out.println("Subtract = "+(n1-n2));
        System.out.println("Multiply = "+(n1*n2));
        System.out.println("Division = "+((float)(n1/n2)));
        System.out.println("Modulus = "+((float)(n1%n2)));
        System.out.println("Increment = " +(n3++));
        System.out.println("Decrement = "+(n3--));
    }
}
        