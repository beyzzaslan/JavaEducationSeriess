import java.util.Scanner;

public class FaizUygulamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz . Faiz oranı %6");
        int anapara , vade;
        System.out.println(" Yatırmak istediğiniz tutar");
        anapara=scanner.nextInt();
        System.out.println("Kaç vade koymak istiyosunuz");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faizOrani =0.06;

        for(int i = 1 ; i<= vade ; i ++){
            toplampara =(toplampara * faizOrani ) + toplampara;
            System.out.println(i + ". yilin sonunda toplam para " + toplampara);

        }

    }
}
