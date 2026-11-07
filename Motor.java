public class Motor extends Kendaraan implements Berkendara {

    private boolean bawaPenumpang;

    // constructor 1
    public Motor(String nomorRangka, String merek) {
        super(nomorRangka, merek);
        this.bawaPenumpang = false;
    }

    // constructor 2
    public Motor(String nomorRangka, String merek, int bahanBakar, boolean bawaPenumpang) {
        super(nomorRangka, merek, bahanBakar);
        this.bawaPenumpang = bawaPenumpang;
    }

    public boolean isBawaPenumpang() { return bawaPenumpang; }
    public void setBawaPenumpang(boolean bawaPenumpang) { this.bawaPenumpang = bawaPenumpang; }

    @Override
    public void hidupkanMesin() {
        if (isMesinHidup()) {
            System.out.println(getMerek() + " sudah hidup");
        } else if (getBahanBakar() == 0) {
            System.out.println(getMerek() + " tidak bisa dihidupkan, bensin habis");
        } else {
            setMesinHidup(true);
            System.out.println(getMerek() + " dihidupkan");
        }
    }

    @Override
    public void matikanMesin() {
        if (isMesinHidup()) {
            setMesinHidup(false);
            setKecepatan(0);
            System.out.println(getMerek() + " dimatikan");
        } else {
            System.out.println(getMerek() + " sudah dalam keadaan mati");
        }
    }

    @Override
    public void jalan(int tambahKecepatan) {
        if (!isMesinHidup()) {
            System.out.println("Hidupkan mesin dulu sebelum jalan");
        } else if (getBahanBakar() < 2) {
            System.out.println("Bensin hampir habis, isi dulu");
        } else {
            setKecepatan(getKecepatan() + tambahKecepatan);
            setBahanBakar(getBahanBakar() - 2); // motor lebih irit, 2 liter
            System.out.println(getMerek() + " jalan, kecepatan " + getKecepatan() + " km/jam");
        }
    }

    @Override
    public void berhenti() {
        setKecepatan(0);
        System.out.println(getMerek() + " berhenti");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bonceng      : " + bawaPenumpang);
    }
}
