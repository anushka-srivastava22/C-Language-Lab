
import java.util.*;
public class Sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int T = sc.nextInt();
        for(int x = 1 ;x <= T; x++)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            for(int i=0;i<=N/2;i++)
            {
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(N-i+1);
                if(ch1 == ch2)
                {
                    ans = ans + 1;
                    if(ans == K)
                    {
                        System.out.println("0");
                    }
                    else if(ans < K)
                    {
                        System.out.println(K-ans);
                    }
                    else if(ans > K)
                    {
                        System.out.println(ans-K);
                    }
                }
            }
            
            
        }
        
        
    }
}