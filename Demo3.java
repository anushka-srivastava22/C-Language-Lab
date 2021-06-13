import java.util.*;
class Demo3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        System.out.println("a&b = "+(a&b)+"\ta|b = "+(a|b));
        System.out.println("-a = "+(-a));
        System.out.println("a^b = "+(a^b));
        System.out.println("Right Shift = "+(a>>2));
        System.out.println("Left Shift = "+(a<<2));
        System.out.println("Unsigned Right Shift = "+(b>>>2));
    }
}