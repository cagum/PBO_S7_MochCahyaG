package bangun_datar;

public class SegitigaSembarang extends Segitiga {
    private double sisiB;
    private double sisiC;
    
    public SegitigaSembarang(double alas, double tinggi, double sisiB, double sisiC) {
        super(alas, tinggi);
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double hitungLuas() {
        //Menggunakan rumus heron
        double s = (alas + sisiB + sisiC) / 2;
        return Math.sqrt(s * (s - alas) * (s - sisiB) * (s - sisiC)); 
    }

    @Override
    public double hitungKeliling() {
        return alas + sisiB + sisiC;
    }
}
