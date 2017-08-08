import java.util.Scanner;

/**
 * Created by Lenovo on 08.08.2017.
 */
public class Task5 {
    // Odczytaj n
    // Sumuj liczby od 1 do n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj N: ");
        int n = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

