# UTS_PBO1_223PA_23552011366
Uts pemrograman berorientasi obyek 1

- mata kuliah    : pemrograman berorientasi obyek 1
- Dosen pengampu : muhammad ikhwan fathulloh

# Profile
nama  : Naufal Aulia Nuchrizal
kelas : 223 PA
Nim   : 23552011366

# Judul studi kasus
Aplikasi E-Commerce

# Penjelasan studi kasus
 jadi disini kita dikasih studi kasus membuat aplikasi E-comerce berdasarkan digit terakhir nim dimana ada ke-4 unsur oop
# Penjelasan 4 pilar oop dalam studi kasus
# Enchapsulasi
   jadi fungsinya untuk menyembunyikan data supaya tidak dapat diakses secara langsung dari superclass dan dapat dipanggil menggunakan suatu method
# Metode Get
public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }
    
# inheritance
   jadi membuat sub class / class turunan fungsinya supaya dapat memanggil fungsi dari superclass tanpa mengubah dulu di superclass. Jadi spesifikasinya di class turunan. Pada studi kasus saya menerapkan inheritance pada class produk yang punya sub class elektronik, pakaian dan makanan . Lalu, pada class metode pembayaran dengan sub class kartukredit dan E_wallet
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
   
# Polymorphis
   jadi fungsi Polimorfisme memungkinkan objek untuk mengambil banyak bentuk. contohnya pada method prosestransaksi menerima parameter bertipe antarmuka Metodepembayaran, memungkinkan penggunaan berbagai implementasi metode pembayaran.
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
   
# abtraksi
   fungsinya membuat suatu method /fungsi dan proses menyembunyikan detail implementasi dan hanya menampilkan fitur penting dari objek. contohnya method hitungdiskon pada class produk yang di implementasi di class turunan
   public abstract class Produk {
   public abstract double hitungDiskon(); // Metode abstrak untuk menghitung diskon
   }
   class Elektronik extends Produk {
    @Override
    public double hitungDiskon() {
        return harga * (persentaseDiskon / 100);
    }
}
   
# Demo kasus
- github  : https://github.com/naufal-aulia-nuchrizal/UTS_PBO1_223PA_23552011366.git
- youtube : https://youtu.be/yLhNrazX43A

