import java.util.*;
/**
 * This program takes a number as an input and prints its prime factors.
 */

class factors{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any  number: ");
        num = sc.nextInt();
        
        for(int i=2; i<num;i++){//as every number is divisible by 1 i starts with 2
            
            while (num%i==0) {
                System.out.println(i+" ");
                num = num/i;
            }
            if (num>2) {
                System.out.println(num);
            }
            
        }
    }
}