package E_Commerce;
public class Transaksi {
    private String namaPembeli;
    private String alamat;
    private Produk produk;
    private int jumlah;

    public Transaksi(String namaPembeli, String alamat, Produk produk, int jumlah) {
        this.namaPembeli = namaPembeli;
        this.alamat = alamat;
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public double totalHarga() {
        return (produk.getHarga() * jumlah) - produk.hitungDiskon(); // Menghitung total harga setelah diskon
    }

    public void prosesTransaksi(Metodepembayaran metodePembayaran) {
        if (jumlah <= produk.getStok()) {
            produk.kurangiStok(jumlah);
            double total = totalHarga();
            metodePembayaran.verifikasi();
            metodePembayaran.prosesPembayaran(total);
            System.out.println("Transaksi berhasil untuk " + namaPembeli + ". Total harga: " + total);
        } else {
            System.out.println("Transaksi gagal. Stok tidak cukup.");
        }
    }
}
