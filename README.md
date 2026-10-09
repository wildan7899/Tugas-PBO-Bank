# Tugas PBO - Sistem Bank & ATM Sederhana

Repositori ini memuat source code program Java yang mensimulasikan sistem perbankan dasar dan ATM sederhana, dibuat sebagai pemenuhan Tugas Pemrograman Berorientasi Objek (PBO).

## Deskripsi Kode
Program ini dibangun menggunakan konsep enkapsulasi dan perancangan kelas berbasis PBO. Terdapat 4 kelas utama penyusun sistem:
- **`Akun.java`**: Mengelola informasi saldo akun, serta menyediakan logika/metode untuk penyetoran (`setor`) dan penarikan (`tarik`) tunai dengan validasi pengembalian tipe data boolean.
- **`Nasabah.java`**: Merepresentasikan profil pelanggan (nama depan dan belakang). Setiap nasabah dikonfigurasi untuk dapat memiliki maksimal hingga 5 akun menggunakan tipe data *array*.
- **`Bank.java`**: Bertindak sebagai sentral pengelolaan dengan kapasitas menampung memori hingga 100 *array* nasabah. Terdapat fungsi untuk mendaftarkan dan memanggil nasabah.
- **`Main.java`**: Kelas utama (entry-point) yang menghubungkan seluruh objek. Kelas ini mendaftarkan nasabah atas nama "Wildan Afandika", mengalokasikan akun baru, dan menjalankan simulasi **Menu ATM Interaktif**.

### Penggunaan Library Tambahan
Program ini mengeksplorasi penggunaan library tambahan bawaan Java yaitu `java.util.Scanner` di dalam kelas `Main.java`. 
Library ini difungsikan untuk menangkap _input_ dari *user* melalui terminal/konsol, memungkinkan pengguna untuk berinteraksi langsung dengan Menu ATM (memasukkan nomor pilihan menu, menginput nominal tarik tunai, dan setor tunai) sehingga aplikasi berjalan dinamis melalui kontrol blok `do-while` dan `switch-case`.

## Screenshot Hasil Eksekusi

*(Silakan unggah dan pasang gambar screenshot eksekusi program Anda di bawah ini)*
<!-- Format untuk meletakkan gambar: ![Keterangan Gambar](url_atau_path_gambar) -->
- **Tampilan Awal & Cek Saldo:**

- **Uji Coba Setor Tunai:**

- **Uji Coba Tarik Tunai:**

