import java.util.Scanner;

public class ebobBulma {
    public static int ebobBulma(int sayi1, int sayi2) {
        int ebob = 1;
        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        //kullanıcıdan alınan iki sayının ebobunu bulma
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayiyi al : ");
        int sayi1 = scanner.nextInt();
        System.out.println("2.sayiyi al : ");
        int sayi2 = scanner.nextInt();
        System.out.println("İki sayinin ebobu : "+ ebobBulma(sayi1, sayi2));

    }
}
