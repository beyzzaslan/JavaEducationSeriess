import java.util.Scanner;

public class maksSayiyiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.sayiyi giriniz : ");
        int sayi1 = scanner.nextInt();

        System.out.println("2.sayiyi giriniz : ");
        int sayi2 = scanner.nextInt();

        System.out.println("3.sayiyi giriniz : ");
        int sayi3 = scanner.nextInt();
        int maks=1;
        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            maks = sayi1;
        }
        else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            maks = sayi2;
        }
        else
            maks=sayi3;

        System.out.println("Maksimum sayi " + maks);
    }
}
