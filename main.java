import java.util.*;

class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        while(i < n){
            System.out.println (fib(i)) ; 
            i++;
        }
    }

    private static long fib(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return fib(n - 2) + fib(n - 1);        
    }
}