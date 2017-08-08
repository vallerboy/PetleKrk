/**
 * Created by Lenovo on 08.08.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        long startTimeOne = System.nanoTime();
        for(int i = 5; i <= 50; i++){
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        long stopTimeOne = System.nanoTime();

        System.out.println("Czas 1: " + (stopTimeOne - startTimeOne));

        long startTimeTwo = System.nanoTime();
        for(int i = 5; i<=50; i += 2){
            System.out.println(i);
        }
        long stopTimeTwo = System.nanoTime();

        System.out.println("Czas 2: " + (stopTimeTwo - startTimeTwo));

    }
}
