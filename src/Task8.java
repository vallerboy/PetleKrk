import java.util.Scanner;

/**
 * Created by Lenovo on 08.08.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        final String password = "mojetajnehaslo";
        Scanner scanner = new Scanner(System.in);

        String userPassword  = "";
        do {
            System.out.println("Wpiszcie hasło");
            userPassword = scanner.nextLine();
        }while (!userPassword.equals(password));
        System.out.println("Wprowadziłeś poprawne haslo!");
    }
}
