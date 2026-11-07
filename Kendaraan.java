public abstract class Kendaraan {

    public static final int BBM_MAKSIMAL = 100;

    private final String nomorRangka;
    private String merek;
    private int kecepatan;
    private int bahanBakar;
    private boolean mesinHidup;

    public Kendaraan(String nomorRangka, String merek) {
        this(nomorRangka, merek, 20);
    }
    public Kendaraan(String nomorRangka, String merek, int bahanBakar) {
        this.nomorRangka = nomorRangka;
        this.merek = merek;
        setBahanBakar(bahanBakar);
        this.kecepatan = 0;
        this.mesinHidup = false;
    }

    public abstract void hidupkanMesin();
    public abstract void matikanMesin();
    public int hitungSisaJarak() {
        return bahanBakar * 10;
    }
    public void tampilkanInfo() {
        System.out.println("Nomor rangka : " + nomorRangka);
        System.out.println("Merek        : " + merek);
        System.out.println("Mesin hidup  : " + mesinHidup);
        System.out.println("Kecepatan    : " + kecepatan + " km/jam");
        System.out.println("Bensin       : " + bahanBakar + " liter");
    }
    public String getNomorRangka() {
        return nomorRangka; }

    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getKecepatan() {
        return kecepatan;
    }
    public void setKecepatan(int kecepatan) {
        if (kecepatan < 0) {
            this.kecepatan = 0;
        } else {
            this.kecepatan = kecepatan;
        }
    }

    public int getBahanBakar() {
        return bahanBakar;
    }
    public void setBahanBakar(int bahanBakar) {
        if (bahanBakar > BBM_MAKSIMAL) {
            this.bahanBakar = BBM_MAKSIMAL;
        } else if (bahanBakar < 0) {
            this.bahanBakar = 0;
        } else {
            this.bahanBakar = bahanBakar;
        }
    }

    public boolean isMesinHidup() {
        return mesinHidup;
    }
    public void setMesinHidup(boolean mesinHidup) {
        this.mesinHidup = mesinHidup;
    }
}
