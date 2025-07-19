package yurtDisinaCikis;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığınız harç bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Siyasi yasağınız bulunuyor mu? (evet yada hayır )  ");
        String cevap = scanner.nextLine();
        if (cevap.equals("evet")) {

            this.siyasiYasak = true;
        }
        else this.siyasiYasak = false;


        System.out.println("Vizeniz bulunuyor mu (evet yada hayır)");
        String cevap2 = scanner.nextLine();
        if (cevap2.equals("evet")) {

            this.vizeDurumu = true;
        }
        else {
            this.vizeDurumu = false;
        }
    }

    @Override
    public boolean yurtDisiHariciKontrol() {
        if (this.harc < 15) {
            System.out.println("Lütfen yurt dışı çıkış harcını tam yatır");
            return false;
        } else {
            System.out.println("yurt dışı harc işlemi tamam");
            return true;

        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasağınız bulunuyor ,  yurtdışına çıkamazsınız...");
            return false;

        } else {
            System.out.println("Siyasi yasağınız bulunmuyor");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam!");
            return true;

        } else System.out.println("Gideceğiniz ülkeye vizeniz bulunmamaktadır...");
        return false;
    }
}
