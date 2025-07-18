package SarkicilarProjesi;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();

    public void sarkicilariBastir() {
        System.out.println("Şarkıcı listesinde " + sarkici_listesi.size() + "kadar şarkıcı var ");

        for (int i = 0; i < sarkici_listesi.size(); i++) {
            System.out.println((i + 1) + " Şarkici : " + sarkici_listesi.get(i));
        }
    }

    public void sarkiciEkle(String isim) {
        sarkici_listesi.add(isim);
        System.out.println("Şarkıcı listesi güncellendi ...");
    }

    public void sarkiciGuncelle(String yeni_isim, int yerlesmeIndeksi) {
        sarkici_listesi.set(yerlesmeIndeksi, yeni_isim);
        System.out.println("Şarkıcı listesi güncellendi ");
    }

    public void sarkiciSil(int yerlesmeIndeksi) {
        String isim = sarkici_listesi.get(yerlesmeIndeksi);
        sarkici_listesi.remove(yerlesmeIndeksi);
        System.out.println(isim + "isimli şarkıcı listeden silindi ...");
    }

    public void sarkiciAra(String sarkici){
        int pozisyon = sarkici_listesi.indexOf(sarkici);
        if(pozisyon >= 0){
            System.out.println("Şarkıcı bulundu");
            System.out.println(sarkici + "isimli şarkıcı " + (pozisyon+1) + ".pozisyonda ");

        }
        else System.out.println("Şarkıcı bulunamadı");
    }
}
