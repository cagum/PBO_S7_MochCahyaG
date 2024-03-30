package bangun_datar;

public class SegitigaSikuSiku extends Segitiga {
    private double sisiMiring;


    public SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi);
        this.sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }
}


