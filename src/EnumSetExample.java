/**
 * Created by andriusbaltrunas on 3/15/2018.
 */

enum Dienos{
    PIRMADIENIS(1, ""),
    ANTRADIENIS(2, ""),
    TRECIADIENIS(3, "");

    private int numb;

    private Dienos(int numb, String b){
        this.numb = numb;
    }

    public int getNumb() {
        return numb;
    }
}
public class EnumSetExample {
}
