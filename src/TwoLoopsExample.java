/**
 * Created by andriusbaltrunas on 3/15/2018.
 */
public class TwoLoopsExample {

    public static void main(String[] args) {
        printRectangle(12, 60);
    }

    private static void printRectangle(int eilute, int stulpelis) {
        for (int i = 1; i <= eilute; i++) {
            int val = i % 2 == 0 ? stulpelis-3 : stulpelis;
            for (int j = 0; j < val; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
