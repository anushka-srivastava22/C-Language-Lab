import java.util.*;
class Demo2
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
        System.out.println("Enter fourth number ");
        int d = sc.nextInt();
        System.out.println("Logical Operators");
        if((a>b)&&(a>c))
        {
            System.out.println("a is large");
        }
        if((a>b)||(a>c))
        {
            System.out.println("a is large1");
        }
        boolean r1 = true;
        System.out.println(!r1);
        System.out.println("Relational Operator");
        if(a>b)
        {
            System.out.println("a is larger");
        }
        if(c<=d)
        {
            System.out.println("c is less than or equal to d");
        }
        if(a==b)
        {
            System.out.println("a=b");
        }
    }
}