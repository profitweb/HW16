import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Please enter your text!");
        String text= new Scanner(System.in).nextLine();
        System.out.println(method(text));
    }

    public static String method (String text) {
        text = text.replaceAll("[.,:;/'?!+-]", "");
        return text= text.replaceAll("\\s+","\n");
    }
}