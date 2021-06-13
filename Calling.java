import  A.Functions;

class Calling
{
    public static void main(String args[])
    {
        Functions f=new Functions();
        System.out.println("Factorial of a number = "+f.factorial(5));
        System.out.println("Sum of first 10 Prime Numbers = "+f.sumPrime());
    }
}