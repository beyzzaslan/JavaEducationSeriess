package atmProject;

import java.util.Scanner;

public class atm {
    //atm yi çalıştırıcak
    public void calis(Hesap hesap) {

        //logini kontrol edecegim icin login nesnesi olusturmam lazım
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hooooojgeldinizz");
        System.out.println("*******************************************");
        System.out.println("Kullanici Girisi : ");
        System.out.println("*******************************************");

        int girisHakki = 3;
        while (true) {
            if (login.login(hesap)) {
                //login nesnesi ile Login sınıfındaki login metoduna eriştik
                System.out.println("Giris Basariliiiii .... ");
                break;
            }
            else {
                System.out.println("Giris basarisiz...");
                girisHakki--;
                System.out.println("Kalan giris hakkiniz : " + girisHakki);


            }
            if (girisHakki == 0) {
                System.out.println("Giris hakkınız bitti ");
                return;//break yaparsam direk döngüm sonlamcak ama ben metodu sonlandurmak isityorum o yuznde return diyoruz

            }
        }
        System.out.println("*********************************");
        String islemler =
                "1- Bakiye Goruntuleme \n"
                + "2- Para Yatirma \n"
                + "3- Para Cekme \n"
                + "Cikis icin q ya basiniz \n";

        System.out.println("*********************************");

        while (true){
            System.out.println("İslem sec");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz : " + hesap.getBakiye());

            }
            else if(islem.equals("2")){
                System.out.println("Yatirmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);

            }
            else if(islem.equals("3")){
                System.out.println("Cekmek istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else
                System.out.println("GECERSİZ İSLEMMMM...................");
        }
    }
}
