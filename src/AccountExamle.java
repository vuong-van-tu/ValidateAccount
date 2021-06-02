import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExamle {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExamle() {
    }
    public static boolean validate(String regex) {
        Pattern pattern;
        pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập account:");
        String input = sc.nextLine();
        boolean isValid = validate(input);
        System.out.println(isValid);
    }
}
