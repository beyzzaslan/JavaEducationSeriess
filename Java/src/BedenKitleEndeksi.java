import java.util.Scanner;

public class BedenKitleEndeksi {
    public static void main(String[] args) {
        //Önce kullanıcıdan boy ve kilo değerlerini al
        //Aldığın değerler ile endeksi hesapla
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz : ");
        int kilo = scanner.nextInt();
        System.out.println("Lütfen boyunuzu giirniz : ");
        double boy = scanner.nextDouble();

        double bdki=kilo/(boy*boy);
        System.out.println("Beden kitle endeksi" + bdki);

    }
}
