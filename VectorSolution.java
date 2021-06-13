import java.util.*;
class VectorSolution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        Vector<String> vec = new Vector<String>(6);
        for(int i=0;i<6;i++)
        {
            String s = sc.nextLine();
            vec.add(s);
        }
        Collections.sort(vec);
        for(int i=0;i<6;i++)
        {
            System.out.println(vec.get(i));
        }
    }
}