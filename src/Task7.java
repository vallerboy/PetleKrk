import java.util.Random;

/**
 * Created by Lenovo on 08.08.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 6; i++) {
            System.out.println(random.nextInt(50 - 1) + 1);
            System.out.println(random.nextInt(100 - 50) + 50);

        }
    }
}
