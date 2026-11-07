public class Mobil extends Kendaraan implements Berkendara, KontrolAC {

    private int kapasitasBagasi;
    private boolean acMenyala;

    public Mobil(String nomorRangka, String merek, int kapasitasBagasi) {
        super(nomorRangka, merek);
        this.kapasitasBagasi = kapasitasBagasi;
        this.acMenyala = false;
    }

    public Mobil(String nomorRangka, String merek, int bahanBakar, int kapasitasBagasi) {
        super(nomorRangka, merek, bahanBakar);
        this.kapasitasBagasi = kapasitasBagasi;
        this.acMenyala = false;
    }

    public int getKapasitasBagasi() { return kapasitasBagasi; }
    public void setKapasitasBagasi(int kapasitasBagasi) { this.kapasitasBagasi = kapasitasBagasi; }

    public boolean isAcMenyala() { return acMenyala; }
    public void setAcMenyala(boolean acMenyala) { this.acMenyala = acMenyala; }

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
            acMenyala = false;
            System.out.println(getMerek() + " dimatikan");
        } else {
            System.out.println(getMerek() + " sudah dalam keadaan mati");
        }
    }

    @Override
    public void jalan(int tambahKecepatan) {
        if (!isMesinHidup()) {
            System.out.println("Hidupkan mesin dulu sebelum jalan");
        } else if (getBahanBakar() < 5) {
            System.out.println("Bensin hampir habis, isi dulu");
        } else {
            setKecepatan(getKecepatan() + tambahKecepatan);
            setBahanBakar(getBahanBakar() - 5);
            System.out.println(getMerek() + " jalan, kecepatan " + getKecepatan() + " km/jam");
        }
    }
    @Override
    public void berhenti() {
        setKecepatan(0);
        System.out.println(getMerek() + " berhenti");
    }

    @Override
    public void nyalakanAC() {
        if (!isMesinHidup()) {
            System.out.println("AC tidak bisa menyala, mesin masih mati");
        } else if (acMenyala) {
            System.out.println("AC sudah menyala");
        } else {
            acMenyala = true;
            System.out.println("AC " + getMerek() + " menyala");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bagasi       : " + kapasitasBagasi + " liter");
        System.out.println("AC menyala   : " + acMenyala);
    }
}
