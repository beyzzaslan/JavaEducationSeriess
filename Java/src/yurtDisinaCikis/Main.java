package yurtDisinaCikis;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha gökçen havalimanına hoşgeldiniz");
        String sartlar = "Yurtdışı Çıkış Kuralları...\n" + " - Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n" + " - 15 Tl harç bedelinizi tam olarak yatırmanız gerekiyor...\n" + " - Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor";


        while (true) {
            System.out.println("*******************************************");
            System.out.println(message);
            System.out.println("*******************************************");
            System.out.println(sartlar);

            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);

            if (yolcu.yurtDisiHariciKontrol() == false) {
                System.out.println(message);
                continue;//dongunun en bsına gider
            }//eğer yurtdışı harcı true ise bu if dongusune girmez


            System.out.println("Siyasi yasak kontrol ediliyor ... ");
            Thread.sleep(3000);
            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor ...");
            Thread.sleep(3000);
            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(message);
                continue;
            }
            //bu 3 if e de girmezse demekki bütün şartları sağlıyor demektir

            System.out.println("İşlemleriniz tamamdır yurt dışına çıkabilirsiniz...");
//artık yurt dışına çıkabiliyosak bu donguyu sonlandırabiliriz
            break;
        }
    }
}
