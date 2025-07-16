import javax.xml.transform.Source;
import java.util.Scanner;

public class İkiSayininDegeriniDegistirme {
    public static void main(String[] args) {
        //bir bayrak seç ona atayıp onda değiştir
        Scanner scanner = new Scanner(System.in);
        int birinciSayi;
        int ikinciSayi;
        System.out.println("Birinci sayi : ");
        birinciSayi=scanner.nextInt();
        System.out.println("İkinci sayi : ");
        ikinciSayi=scanner.nextInt();
        System.out.println("Değiştirilmeden önce : ");
        System.out.println("Birinci sayi : " + birinciSayi + "  İkinci sayi : " + ikinciSayi);
        int flag;

        flag=birinciSayi;
        birinciSayi=ikinciSayi;
        ikinciSayi=flag;

        System.out.println("Değiştirildikten sonra  : ");
        System.out.println("Birinci sayi : " + birinciSayi + "  İkinci sayi : " + ikinciSayi);



    }
}
