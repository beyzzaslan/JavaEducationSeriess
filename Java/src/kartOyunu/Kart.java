package kartOyunu;

public class Kart {
    private char deger;//alfabeden sayılar vrdik
    private boolean tahmin = false;//ilk başta tahmin edilmemiş olsun

    public Kart(char deger) {
        this.deger = deger;
    }

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
}
