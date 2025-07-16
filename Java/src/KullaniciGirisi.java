import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dogruKullaniciAdi = "Beyzanur Aslan";
        String dogruParola = "aslanbeyza";

        int girisHakki = 3;

        System.out.println("**********************");
        System.out.println("     Giriş Ekranı     ");
        System.out.println("**********************");

        while (true) {
            System.out.print("Kullanıcı adı: ");
            String girilenKullaniciAdi = scanner.nextLine();

            System.out.print("Parola: ");
            String girilenParola = scanner.nextLine();

            if (dogruKullaniciAdi.equals(girilenKullaniciAdi) && dogruParola.equals(girilenParola)) {
                System.out.println("Hoş geldiniz, " + girilenKullaniciAdi + "!");
                break;
            } else {
                girisHakki--;
                System.out.println("Hatalı giriş. Kalan hakkınız: " + girisHakki);
            }

            if (girisHakki == 0) {
                System.out.println("Giriş hakkınız bitti. Program sonlandırılıyor.");
                break;
            }
        }

        scanner.close();
    }
}
