public class Main {
    public static void main(String[] args) {

        System.out.println("( [1] State & Behavior + [3] Konstruktor overloading )");
        Mobil avanza = new Mobil("MOB-001", "Avanza", 450);          // konstruktor 3 parameter
        Mobil brio = new Mobil("MOB-002", "Brio", 50, 258);          // konstruktor 4 parameter
        avanza.tampilkanInfo();
        System.out.println("Sisa jarak Avanza: " + avanza.hitungSisaJarak() + " km");
        System.out.println("Bensin Brio (diisi 50): " + brio.getBahanBakar() + " liter\n");

        System.out.println("( [2] Immutability )");
        System.out.println("Konstanta BBM_MAKSIMAL = " + Kendaraan.BBM_MAKSIMAL);
        brio.setBahanBakar(500);
        System.out.println("Brio diisi 500 liter -> jadi " + brio.getBahanBakar() + " liter");
        System.out.println("Nomor rangka Avanza (final): " + avanza.getNomorRangka());
        System.out.println();

        System.out.println("( [7] Abstract class tidak bisa di-new )\n");


        System.out.println(" ( [4][5][6][8] Inheritance, super, override, if/else )");
        Motor beat = new Motor("MTR-001", "Beat");
        Motor vario = new Motor("MTR-002", "Vario", 0, true);
        beat.tampilkanInfo();
        System.out.println();

        System.out.println("( Hidupkan 2x berturut-turut (if/else baca & ubah state) )");
        beat.hidupkanMesin();
        beat.hidupkanMesin();
        System.out.println();

        System.out.println("( Matikan 2x berturut-turut )");
        beat.matikanMesin();
        beat.matikanMesin();
        System.out.println();

        System.out.println("Motor bensin kosong");
        vario.hidupkanMesin();
        System.out.println();

        System.out.println(" ( [9] Polimorfisme lewat variabel bertipe interface )");
        Berkendara kendaraan1 = new Mobil("MOB-003", "Xpander", 30, 300);
        Berkendara kendaraan2 = new Motor("MTR-003", "NMAX", 15, false);
        System.out.println();

        ((Kendaraan) kendaraan1).hidupkanMesin();
        ((Kendaraan) kendaraan2).hidupkanMesin();
        kendaraan1.jalan(40);
        kendaraan2.jalan(40);
        kendaraan1.berhenti();
        kendaraan2.berhenti();
        System.out.println();

        System.out.println("[10] Satu class implements dua interface (Mobil)");
        Mobil mobilTes = new Mobil("MOB-004", "Innova", 40, 500);
        Berkendara a = mobilTes;
        KontrolAC b = mobilTes;
        b.nyalakanAC();
        mobilTes.hidupkanMesin();
        b.nyalakanAC();
        a.jalan(60);
        mobilTes.tampilkanInfo();
    }
}
