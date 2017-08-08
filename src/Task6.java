import java.util.Scanner;

/**
 * Created by Lenovo on 08.08.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        final int winnerNumber = 523;
        Scanner scanner = new Scanner(System.in);
        int userNumber;

        do{
            System.out.print("Wpisz liczbę: ");
            userNumber = scanner.nextInt();
            if(userNumber > winnerNumber){
                System.out.println("Celuj trochę niżej");
            }else if(userNumber < winnerNumber){
                System.out.println("Celuj trochę wyżej");
            }
        }while (userNumber != winnerNumber);
        System.out.println("WYGRALES");
    }
}
