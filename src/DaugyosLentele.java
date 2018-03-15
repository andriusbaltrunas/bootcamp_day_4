/**
 * Created by andriusbaltrunas on 3/15/2018.
 */
public class DaugyosLentele {

    public static void main(String[] args) {

        int[][] lentele = new int[10][10];
        for(int i =1; i < lentele.length; i++){
            for(int j =1; j < lentele[i].length; j++){
                lentele [i][j] = i*j;
            }
        }
        for(int i =1; i < lentele.length; i++){
            for(int j =1; j  <lentele[i].length; j++){
                System.out.print(lentele[i][j]+" ");
            }
            System.out.println();
        }
    }
}
