package bangun_datar;

public class SegitigaSamaKaki extends Segitiga {
    private double sisiMiring;

    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi);
        this.sisiMiring = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
    }

    @Override
    public double hitungLuas() {
    return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 2 * sisiMiring + alas;
    }
}

