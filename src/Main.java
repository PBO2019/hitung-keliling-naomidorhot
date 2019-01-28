public class Main {

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        bujurSangkar bujursangkar = new bujurSangkar();

        bujursangkar.setSisi(7);
        bujursangkar.hitungKeliling();
        System.out.println("Keliling Bujur Sangkar = " + bujursangkar.getHasil());

        lingkaran.setRadius(7);
        lingkaran.setphi(3.14);
        lingkaran.hitungKeliling();
        System.out.println("Keliling Lingkran = " + lingkaran.getkeliling());
    }
}
