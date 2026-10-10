public class Bank {
    private Nasabah[] daftarNasabah;
    private int jumlahNasabah;

    public Bank() {
        this.daftarNasabah = new Nasabah[100];
        this.jumlahNasabah = 0;
    }

    public void tambahNasabah(String namaDepan, String namaBelakang) {
        if (this.jumlahNasabah < 100) {
            this.daftarNasabah[this.jumlahNasabah] = new Nasabah(namaDepan, namaBelakang);
            this.jumlahNasabah = this.jumlahNasabah + 1;
        } else {
            System.out.println("Kapasitas bank sudah penuh.");
        }
    }

    public int getJumlahNasabah() {
        return this.jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        if (indeks >= 0) {
            if (indeks < this.jumlahNasabah) {
                return this.daftarNasabah[indeks];
            }
        }
        return null;
    }
}
