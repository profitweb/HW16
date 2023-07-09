import java.util.Scanner;

public class Main {
    private static final String VALID_REGEX = "((([А-я]+)|([А-я-]+))\\s){2}(([А-я]+)|([А-я-]+))";
    public static void main(String[] args) {
        System.out.println("Введите ФИО !");
        String fio = new Scanner(System.in).nextLine();

        if (fio.matches(VALID_REGEX)) {
            System.out.println(true);
        }
            else {
                System.out.println(false);
            }

    }
}