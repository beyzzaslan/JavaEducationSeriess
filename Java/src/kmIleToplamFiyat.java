import java.util.Scanner;

public class kmIleToplamFiyat {
    //aracın 1 km de ne kadar yaktıgını aldır
    //aracın kaç km yol gititğini yazdır
    //aracın toplam ne kadar yakıt harcadıgı hesabını yaptır

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Araç km başına ne kadar yakıyor");
        int yakıt=scanner.nextInt();
        System.out.println("Araç kaç km gitmiştir?");
        int km=scanner.nextInt();
        double tutar=yakıt*km;
        System.out.println("Araç toplamda %lf kadar yakmıstır  "+ tutar);

    }
}
