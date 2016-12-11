/**
 * Created by Armand on 11/12/16.
 */
public class Project2 {
    public static void main(String[] args) {
        int i = 1, i2 = 1, tally = 0;

        while (i <= 4000000) {
            if (i % 2 == 0)
                tally += i;
            int z = i + i2;
            i = i2;
            i2 = z;
        }
        System.out.println(tally);
    }
}
