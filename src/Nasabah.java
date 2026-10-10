public class Nasabah {
    private String namaDepan;
    private String namaBelakang;
    private Akun[] daftarAkun;
    private int jumlahAkun;

    public Nasabah(String namaDepan, String namaBelakang) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.daftarAkun = new Akun[5];
        this.jumlahAkun = 0;
    }

    public String getNamaDepan() {
        return this.namaDepan;
    }

    public String getNamaBelakang() {
        return this.namaBelakang;
    }

    public void setAkun(Akun akun) {
        if (this.jumlahAkun < 5) {
            this.daftarAkun[this.jumlahAkun] = akun;
            this.jumlahAkun = this.jumlahAkun + 1;
        } else {
            System.out.println("Batas maksimal kepemilikan akun telah tercapai.");
        }
    }

    public Akun getAkun(int indeks) {
        if (indeks >= 0) {
            if (indeks < this.jumlahAkun) {
                return this.daftarAkun[indeks];
            }
        }
        return null;
    }

    public int getJumlahAkun() {
        return this.jumlahAkun;
    }
}
