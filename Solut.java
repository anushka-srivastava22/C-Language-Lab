import java.util.*;
class Solut{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("T");
        int T = sc.nextInt();
        System.out.println("A");
        long A = sc.nextLong();
        System.out.println("B");
        long B = sc.nextLong();
        System.out.println("C");
        long C = sc.nextLong();
        
        long h = A / 3600000000000l;
        
        long m = B / 720000000000l;
        
        long s = C / 3114000000000l;
        
        long n = 0l;
        System.out.println(h+" "+m+" "+s+" "+n);
    }
}