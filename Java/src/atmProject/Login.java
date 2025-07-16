package atmProject;

import java.util.Scanner;

public class Login {
    //Login classı kullanıcı girisini kontrol edecek
    public boolean login(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi;
        String parola;
        System.out.println("Kullanici Adi : ");
        kullaniciAdi = scanner.nextLine();
        System.out.println("parola : ");
        parola = scanner.nextLine();
        if(hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)){
            return  true;
        }
        else
            return false;
    }
}
