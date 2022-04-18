import Model.Barang;
import java.util.ArrayList;
import java.util.Scanner;

public class Tokopedia {


    public static void pilihBarang(char pilih) {
        Scanner isi = new Scanner(System.in);
        ArrayList<Model.Barang> keranjng = new ArrayList<>();
        Barang jajanMasuk = new Model.Barang();

        switch (pilih) {
            case '1' -> {
                System.out.print("Masukan Jumlah : ");
                int jml = isi.nextInt();
                jajanMasuk.setNamaBarang("Ciki");
                jajanMasuk.setHargaBarang(2000);
                jajanMasuk.setJumlahBarang(jml);
                keranjng.add(jajanMasuk);
            }

            case '2' -> {
                System.out.print("Masukan Jumlah :");
                int jml = isi.nextInt();
                jajanMasuk.setNamaBarang("Chaca");
                jajanMasuk.setHargaBarang(3000);
                jajanMasuk.setJumlahBarang(jml);
                keranjng.add(jajanMasuk);
            }

            case '3' -> {
                System.out.print("Masukan Jumlah : ");
                int jml = isi.nextInt();
                jajanMasuk.setNamaBarang("Ollate");
                jajanMasuk.setHargaBarang(5000);
                jajanMasuk.setJumlahBarang(jml);
                keranjng.add(jajanMasuk);
            }
        }

        int barangAwal = jajanMasuk.getJumlahBarang();
        int totalBarang = jajanMasuk.jmlBarang(barangAwal);

        printTotalBarang(totalBarang);
    }


    public static void printTotalBarang(int juml){
        System.out.println("-------------------------");
        System.out.println(juml + " barang ada di dalam keranjang");
        System.out.println("-------------------------");
    }


    public static void main(String[]args){

        char pilih = '0';
        do {

            Scanner input = new Scanner(System.in);

            System.out.println();
            System.out.println("-------------------------");
            System.out.println("Selamat Datang di Tokoku");
            System.out.println("Produk :");
            System.out.println("1. Ciki");
            System.out.println("2. Chaca");
            System.out.println("3. Ollate");
            System.out.println("-------------------------");
            System.out.print("Pilih nomor produk : ");
            pilih = input.next().charAt(0);

            System.out.println("isi x untuk keluar");

            pilihBarang(pilih);

        } while (pilih != 'x');
    }

}




//tokeen = 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