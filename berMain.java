package E_Commerce;

public class berMain {
    public static void main(String[] args) {
        // Membuat produk
        Elektronik produkTV = new Elektronik("TV", 5000000, 10, 50); // Diskon 50%
        Pakaian produkKaos = new Pakaian("Kaos", 350000, 20, 75); // Diskon 75%
        Makanan produkSnack = new Makanan("Snack", 20000, 50, 10); // Diskon 10%

        // Membuat transaksi
        Transaksi transaksi1 = new Transaksi("boruto", "Jl. Merdeka No. 1", produkTV, 1);
        Transaksi transaksi2 = new Transaksi("boruto", "Jl. Merdeka No. 2", produkKaos, 4);
        Transaksi transaksi3 = new Transaksi("hinata", "Jl. Merdeka No. 3", produkSnack, 10);

        // Metode pembayaran
        KartuKredit kartuKredit = new KartuKredit("1234-5678-9012-3456");
        EWallet eWallet = new EWallet("EWallet123");

        // Memproses transaksi dengan Kartu Kredit
        System.out.println("=== Transaksi 1 ===");
        transaksi1.prosesTransaksi(kartuKredit);

        // Memproses transaksi dengan E-Wallet
        System.out.println("=== Transaksi 2 ===");
        transaksi2.prosesTransaksi(eWallet);

        // Memproses transaksi dengan E-Wallet
        System.out.println("=== Transaksi 3 ===");
        transaksi3.prosesTransaksi(eWallet);
    }
}