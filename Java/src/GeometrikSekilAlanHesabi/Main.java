package GeometrikSekilAlanHesabi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler...\n" + "1. Kare Alan Hesapla\n" + "2. Üçgen Alan Hesapla\n" + "3. Daire Alan Hesapla\n" + "Çıkış : q";

        while (true) {
            System.out.println(islemler);
            System.out.println("Hangi şeklin alanını hesaplamak istiyorsunuz ? ");
            String sekilTuru = scanner.nextLine();
            Sekil sekil = null;
            if (sekilTuru.equals("q")) {
                System.out.println("Programdan çıkılıyor ...");
                break;
            }
            else if (sekilTuru.equals("1")) {

                System.out.println("Karenin Kenarı :");
                int kenar = scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("Kare1", kenar);
                sekil.alanHesapla();

            }
            else if (sekilTuru.equals("2")) {

                System.out.println("Kenar1 :");
                int kenar1 = scanner.nextInt();

                System.out.println("Kenar2 :");
                int kenar2 = scanner.nextInt();

                System.out.println("Kenar3 :");
                int kenar3 = scanner.nextInt();

                sekil = new Ucgen("Ucgen1", kenar1, kenar2, kenar3);
                sekil.alanHesapla();

            }
            else if (sekilTuru.equals("3")) {
                System.out.println("Daireini yaricapini giriniz :");
                int yaricap = scanner.nextInt();
                sekil = new Daire("Daire1 : ", yaricap);
                sekil.alanHesapla();

            }
            else {
                System.out.println("Geçersiz işlem ....");
            }
        }
    }
}
