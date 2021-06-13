import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s[] = new String [6];
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter string");
            s[i] = sc.nextLine();
        }
        Arrays.sort(s);
        for(int i=0;i<6;i++)
        {
            System.out.println(s[i]);
        }
    }
}