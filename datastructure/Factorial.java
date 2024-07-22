package datastructure;

public class Factorial {

    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.printf("Factorial of 5 is %d", factorial);
    }

   //recursion
    public static int factorial(int n){
        if (n==0) return 1;
        return n * factorial(n-1);
    }
}
