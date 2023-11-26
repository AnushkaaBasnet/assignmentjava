//) WAP to print the sum of digits
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        int sum = 0;
        while (a>0)
        {   sum = sum +a%10;
            a = a/10;
        }
        System.out.println("the sum  is:" +sum);
    }
}
