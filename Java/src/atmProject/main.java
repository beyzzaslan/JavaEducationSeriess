package atmProject;

public class main {
    public static void main(String[] args) {

        Hesap hesap = new Hesap("Beyza","12345",20000);
        atm atm = new atm();
        atm.calis(hesap);
        System.out.println("Proje calisti...");
    }
}
