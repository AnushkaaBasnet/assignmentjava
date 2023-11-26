// WAP to check if the user entered string is palindrome or not
public class palindrome {
    public static void main(String[] args) {
        String string = "divide";
        int a = 0;
        int b = string.length() - 1;
        while (a < b)
        {
            if (string.charAt(a)!= string.charAt(b))
            {
                System.out.println(" not palindrome");

            }
            a++;
            b--;
        }
        System.out.println(" palindrome");


    }
}
