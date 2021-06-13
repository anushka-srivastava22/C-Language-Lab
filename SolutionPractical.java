import java.util.*;
class SolutionPractical
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int n = num;
        int sum=0;
        int rev=0;
        while(n > 0)
        {
            int d = n%10;
            rev = rev*10+d;
            n=n/10;
        }
        
        if(rev == temp)
        {
            System.out.println("Palindrome Number ");
        }
        else
        {
            System.out.println("Not an Palindrome Number");
        }
         while (num > 0)
        {
            int d = num%10;
            sum = sum + (d*d*d);
            num=num/10;
        }
        if(temp == sum)
        {
            System.out.println("Armstrong Number ");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
        
        if((temp+1)%7 == 0)
        {
            System.out.println("Yes it is divisible by 7 ");
        }
        else
        {
            System.out.println("No it is not divisible by 7 ");
        }
    }
}
        