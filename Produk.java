package E_Commerce;

public abstract class Produk {
    protected String nama;  // Nama produk
    protected double harga; // Harga produk
    protected int stok;     // Jumlah stok produk

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public abstract double hitungDiskon(); // Metode abstrak untuk menghitung diskon

    public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }
}

class Elektronik extends Produk {
    private double persentaseDiskon; // Diskon untuk produk elektronik

    public Elektronik(String nama, double harga, int stok, double persentaseDiskon) {
        super(nama, harga, stok);
        this.persentaseDiskon = persentaseDiskon;
    }

    @Override
    public double hitungDiskon() {
        return harga * (persentaseDiskon / 100);
    }
}

class Pakaian extends Produk {
    private double persentaseDiskon; // Diskon untuk produk pakaian

    public Pakaian(String nama, double harga, int stok, double persentaseDiskon) {
        super(nama, harga, stok);
        this.persentaseDiskon = persentaseDiskon;
    }

    @Override
    public double hitungDiskon() {
        return harga * (persentaseDiskon / 100);
    }
}

class Makanan extends Produk {
    private double persentaseDiskon; // Diskon untuk produk makanan

    public Makanan(String nama, double harga, int stok, double persentaseDiskon) {
        super(nama, harga, stok);
        this.persentaseDiskon = persentaseDiskon;
    }

    @Override
    public double hitungDiskon() {
        return harga * (persentaseDiskon / 100);
    }
}