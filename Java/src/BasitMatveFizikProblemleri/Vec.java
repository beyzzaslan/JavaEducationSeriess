package BasitMatveFizikProblemleri;

import java.util.Scanner;

public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;

    public Vec(String isim) {
        this.isim = isim;
        Scanner scanner = new Scanner(System.in);
        System.out.println(isim +"in  i j ve k değerlerini giriniz : ");

        System.out.println("i : ");
        this.i=scanner.nextInt();

        System.out.println("j : ");
        this.j=scanner.nextInt();

        System.out.println("k : ");
        this.k=scanner.nextInt();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
















