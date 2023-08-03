import java.util.*;
/**
 * This program produces the fibonacci of the number
 */
class fibonacci {
    public static void main(String[] args) {
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        int[] fib = new int[1000];
        fib[0] = 0;
        fib[1] = 1;
        for(i=2;i<n;i++){
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println(fib[i]);
        }
    }
}
