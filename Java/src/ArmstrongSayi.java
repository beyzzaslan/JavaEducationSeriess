import java.awt.*;
import java.util.Map;
import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        //girilen bir sayının armstrong olup olmadııgna bakılır
        //mesela 4 basamaklı bir sayı olan 1634 olsun ve bu  1^4+6^4+3^4+4^4 =1634 ise armstrong olur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi gir : ");
        int sayi = scanner.nextInt();
        System.out.println("Girdiğin sayının basamak sayısı ");
        //sayının basamak sayısını otomatik hesaplatıp elden almayacak şekildeki kodunu da yaz
        int basamaksayisi = scanner.nextInt();


        int gecicisayi = sayi;
        int toplam = 0;
        do {
            int basamakdegeri = gecicisayi % 10;
            gecicisayi /= 10;
            toplam+= Math.pow(basamakdegeri,basamaksayisi);

        } while (gecicisayi > 0);
        if(sayi==toplam){
            System.out.println("Bu sayi bir armstrong sayisidir");
        }
        else System.out.println("Bu sayı armstrong sayi değildir");
    }
}
