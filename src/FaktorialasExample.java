/**
 * Created by andriusbaltrunas on 3/15/2018.
 */
public class FaktorialasExample {

    public static void main(String[] args) {
        faktorialas(4);
    }

    private static void faktorialas(int n) {
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("faktorialas " + sum);
    }
}
