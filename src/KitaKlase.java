import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/15/2018.
 */
public class KitaKlase {

    public static void daliklis(int daliklis, int skaiciuKiekis) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ;i < skaiciuKiekis; i++) {
            System.out.println("Iveskite skaiciu :");
            int arDalijasi = sc.nextInt();
            if (arDalijasi % daliklis== 0) {
                System.out.println(arDalijasi);
            }
        }
    }

    public static void newTry(){
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite dalikli :");
        int numb1 = input.nextInt();
        System.out.println("Kiek norite gauti reiksiu :");
        int numb2 = input.nextInt();
        int numb3 = numb1*numb2;
        for(int i=1;i<=numb3;i++){
            if(i% numb1 ==0){
                System.out.println(i);
            }
        }
    }

    public static void minuciuKonverteris(int sveikasSkaicius) {

        int diena = 1440;
        int valanda = 60;
        int minute = 1;

        int kiekDienu = sveikasSkaicius / diena;
        int kiekValandu = (sveikasSkaicius - (kiekDienu * diena)) / valanda;
        int kiekMinuciu = sveikasSkaicius - (kiekDienu * diena) - (kiekValandu* valanda);

        System.out.println("Sveikas skaicius - " + sveikasSkaicius + " turi " +
                kiekDienu + " dienas " + kiekValandu + " valanda " + kiekMinuciu +
                " minuciu.");
    }

    public static  void minuciuKiekis(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite dienas");
        int dienos = sc.nextInt();
        System.out.println("Iveskite valandas");
        int valandos = sc.nextInt();
        System.out.println("Iveskite minutes");
        int minutes = sc.nextInt();

        int totalMin = minutes + (valandos*60) + (dienos*1440);
        System.out.println(totalMin);
    }
}