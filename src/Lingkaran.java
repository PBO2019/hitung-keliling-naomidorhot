public class Lingkaran {
    public static void main(String args []){
        menghitung ya = new menghitung();
        ya.hitungKeliling();
    }
    public static class menghitung{
        int r = 7;
        double phi = 3.14;
        double luas = 2*phi*r;

        void hitungKeliling(){
            System.out.println("Hasil Keliling Lingkaran = " + luas + "cm");
        }
    }
}
