import java.util.Scanner;

public class DongulerleAtm {
    public static void main(String[] args) {
        //while dongusuyle bir atm yap
        /*
        işlemler
        * 1.işlem= Bakiye öğrenme
        * 2.işlem= Para çekme
        * 3.işlem= Para Yatırma
        * Çıkış=q ya basınca çıkıcak
        */
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem : Bakiye öğrenme \n" + "2.İşlem : Para Çekme \n " + "3.İşlem : Para Yatırma \n" + "Çıkış için q ya basınız \n";
        System.out.println("**********************");
        System.out.println(islemler);
        System.out.println("**********************");

        while (true) {
            System.out.println("İşlemi seçiniz:");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz " + bakiye);
            }
            else if (islem.equals("2")) {
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if (bakiye - tutar < 0) {
                    System.out.println("Yeterli bakiyeniz yok. Bakiyeniz :  " + bakiye);
                } else bakiye -= tutar;
                System.out.println("yeni bakiyeniz : bakiye" + bakiye);
            }
            else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz bakiye ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                bakiye += tutar;
                System.out.println("yeni bakiyeniz : bakiye" + bakiye);

            }
        }


    }
}
