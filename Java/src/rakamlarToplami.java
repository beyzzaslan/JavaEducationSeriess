import java.util.Scanner;

public class rakamlarToplami {
    public static void main(String[] args) {
       //mesela 1234 sayisinin rakamları toplamında hep birler basamağı mantıgı ile bulabilirsin
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Bir sayi giriniz ");
        int sayi = scanner.nextInt();
        //şimdi do while ile sayıyı alacaz
        do {

            toplam += sayi % 10;//birler basamagıno alıyo
            sayi=sayi/10;//sayiyi guncelliyoz
            System.out.println("Sayi " + sayi);

        } while (sayi>0);
        System.out.println("Rakamları toplamı " + toplam);

    }
}
