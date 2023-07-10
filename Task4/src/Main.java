import java.util.Scanner;

public class Main {
    private static final String NUM_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String NUM_LEGAL = "+7 ($2) $3 $4-$5";

    public static final String  SHORT_NUM_LEGAL = "+7 ($1) $2 $3-$4";
    public static void main(String[] args) {
        while(true) {
            System.out.println("Please Enter your phone number!");
            String num = new Scanner(System.in).nextLine();
            num = num.replaceAll("\\D+","");

            if (num.length() == 11) {
                num = num.replaceAll("(\\d)" + NUM_REGEX, NUM_LEGAL);
                System.out.println(num);
            }
            else if (num.length() == 10) {
                num = num.replaceAll(NUM_REGEX, SHORT_NUM_LEGAL);
                System.out.println(num);
            }
            else {
                System.out.println("Sorry! number is not correct!");
            }
        }
    }
}