import java.util.*;
class Demo4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        System.out.println("Enter third number ");
        int c = sc.nextInt();
        System.out.println("The largest number is : ");
        System.out.println((a>b)&&(a>c)?a:(b>a)&&(b>c)?b:c);
    }
}