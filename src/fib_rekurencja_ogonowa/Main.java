package fib_rekurencja_ogonowa;

class Fibonacci{
    //rekurencja ogonowa n-tego wyrazy fibonacciego
    static int fib(int n, int a, int b)
    {
        if (n == 0)
            return a;
        if (n ==1)
            return b;
        return fib(n - 1, b, a + b);
    }
}
public class Main {
    public static void main(String[] args)
    {
        int i;

        for (i = 1; i <= 30; i++)
        {
            System.out.println("F("+ i +") = " + Fibonacci.fib(i, 0, 1));
        }
    }
}
