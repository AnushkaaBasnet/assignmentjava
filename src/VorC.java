//WAP to count the number of vowels and consonants in a given string.
public class VorC {
    public static void main(String[] args) {
        String x = "It's November";
        String z = x.toLowerCase();
        int v = 0;
        int c = 0;

        int a = z.length();

        for (int i = 0; i < a; i++) {
            char d = z.charAt(i);

                if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {
                    v++;
                    System.out.println("The number of vowels are:" + v);
                } else {
                    c++;
                    System.out.println("The number of consonants are:" + c);
                }

            }

        }
    }






