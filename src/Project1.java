/**
 * Created by Armand on 11/12/16.
 */
public class Project1 {
    public static void main(String[] args) {
        int tally = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                tally += i;
            }
        }
        System.out.println(tally);
    }
}

