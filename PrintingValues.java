import java.util.*;
class PrintingValues
{
    static final int x = 30;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter elements in the array");
        for(i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            ar[i] += x;
        }
        System.out.println("Modified Elements");
        for(i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
        