package bangun_datar;

public class SegitigaSamaSisi extends Segitiga {

    public SegitigaSamaSisi(double sisi) {
        super(sisi, (sisi * Math.sqrt(3)) / 2);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 3 * alas;
    }
}

