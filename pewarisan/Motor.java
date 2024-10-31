package pewarisan;

public class Motor extends Kendaraan{
    private int kapasitasMesin;
    private String jenisTransmisi;

    public Motor(final String merek, final String model, final int tahunProduksi) {
        super(merek, model, tahunProduksi);
    }

    public void infoMobil() {
        super.infoKendaraan();
        System.out.println("Kapasitas mesin: " + kapasitasMesin);
        System.out.println("Jenis transmisi: " + jenisTransmisi);
    }
}