import java.util.*;
class Game
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter DR or ST");
        String s = sc.nextLine();
        if(s.equalsIgnoreCase("DR"))
        {
            System.out.println("Enter your dare");
            String t1 = sc.nextLine();
            System.out.println(t1);
        }
        else
        {
            System.out.println("Enter your situation");
            String t2 = sc.nextLine();
            System.out.println(t2);
        }
    }
}
            