package Model;

public class Barang {
    private int idBarang;
    public String namaBarang;
    public int jumlahBarang;
    public int hargaBarang;

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public Barang(int id, String nama, int jumlah, int harga){
        this.idBarang = id;
        this.namaBarang = nama;
        this.jumlahBarang = jumlah;
        this.hargaBarang = harga;
    }

    public Barang(){}

    public int jmlBarang(int jml){
        jml = jml + getJumlahBarang();
        return jml;
    }

}
