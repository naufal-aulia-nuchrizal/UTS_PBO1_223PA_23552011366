package E_Commerce;

public interface Metodepembayaran {
    void verifikasi();
    void prosesPembayaran(double total);
}

class KartuKredit implements Metodepembayaran {
    private String nomorKartu;

    public KartuKredit(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void verifikasi() {
        System.out.println("Verifikasi kartu kredit dengan nomor: " + nomorKartu);
    }

    @Override
    public void prosesPembayaran(double total) {
        System.out.println("Pembayaran sebesar " + total + " menggunakan Kartu Kredit berhasil.");
    }
}

class EWallet implements Metodepembayaran {
    private String nomorEWallet;

    public EWallet(String nomorEWallet) {
        this.nomorEWallet = nomorEWallet;
    }

    @Override
    public void verifikasi() {
        System.out.println("Verifikasi E-Wallet dengan nomor: " + nomorEWallet);
    }

    @Override
    public void prosesPembayaran(double total) {
        System.out.println("Pembayaran sebesar " + total + " menggunakan E-Wallet berhasil.");
    }
}

