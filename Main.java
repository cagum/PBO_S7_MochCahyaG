import bangun_datar.Lingkaran;
import bangun_datar.Persegi;
import bangun_datar.PersegiPanjang;
import bangun_datar.SegitigaSamaKaki;
import bangun_datar.SegitigaSamaSisi;
import bangun_datar.SegitigaSembarang;
import bangun_datar.SegitigaSikuSiku;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        Lingkaran lingkaran = new Lingkaran(3);
        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(5, 4);
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(6);
        SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(3, 4);
        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(5, 4, 6, 7);
        
        System.out.println("Luas persegi: " + persegi.hitungLuas());
        System.out.println("Keliling persegi: " + persegi.hitungKeliling());
        System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());
        System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
        System.out.println("Luas segitiga sama kaki: " + segitigaSamaKaki.hitungLuas());
        System.out.println("Keliling segitiga sama kaki: " + segitigaSamaKaki.hitungKeliling());
        System.out.println("Luas segitiga sama sisi: " + segitigaSamaSisi.hitungLuas());
        System.out.println("Keliling segitiga sama sisi: " + segitigaSamaSisi.hitungKeliling());
        System.out.println("Luas segitiga siku-siku: " + segitigaSikuSiku.hitungLuas());
        System.out.println("Keliling segitiga siku-siku: " + segitigaSikuSiku.hitungKeliling());
        System.out.println("Luas segitiga sembarang: " + segitigaSembarang.hitungLuas());
        System.out.println("Keliling segitiga sembarang: " + segitigaSembarang.hitungKeliling());
    }
}
