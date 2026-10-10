import java.util.Scanner;

public class Main {

    public static void bersihkanLayar() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for(int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.tambahNasabah("Wildan", "Afandika");

        Nasabah nasabah = bank.getNasabah(0);

        Akun akunBaru = new Akun(500000.0);
        nasabah.setAkun(akunBaru);

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        Akun akunAktif = nasabah.getAkun(0);

        do {
            bersihkanLayar();
            
            System.out.println("=============================================");
            System.out.println("||                                         ||");
            System.out.println("||      SELAMAT DATANG DI ATM MySAWIT      ||");
            System.out.println("||                                         ||");
            System.out.println("=============================================");
            System.out.println("  Nasabah: " + nasabah.getNamaDepan() + " " + nasabah.getNamaBelakang());
            System.out.println("---------------------------------------------");
            System.out.println("");
            System.out.println("╔═══════════════════════════════════════════╗");
            System.out.println("║                MENU UTAMA                 ║");
            System.out.println("╠═══════════════════════════════════════════╣");
            System.out.println("║  [1] Informasi Saldo                      ║");
            System.out.println("║  [2] Setor Tunai                          ║");
            System.out.println("║  [3] Tarik Tunai                          ║");
            System.out.println("║  [4] Keluar Aplikasi                      ║");
            System.out.println("╚═══════════════════════════════════════════╝");
            System.out.print("» Masukkan Pilihan Anda (1-4): ");
            
            pilihan = scanner.nextInt();
            System.out.println("");

            if (pilihan == 1) {
                System.out.println("---------------------------------------------");
                System.out.println(" [INFORMASI SALDO]");
                System.out.println(" Sisa saldo Anda saat ini: Rp " + akunAktif.getSaldo());
                System.out.println("---------------------------------------------");
            } else if (pilihan == 2) {
                System.out.println("---------------------------------------------");
                System.out.println(" [SETOR TUNAI]");
                System.out.print(" Masukkan nominal setoran: Rp ");
                double jumlahSetor = scanner.nextDouble();
                boolean setorBerhasil = akunAktif.setor(jumlahSetor);
                
                if (setorBerhasil) {
                    System.out.println(" [»] TRANSAKSI BERHASIL!");
                    System.out.println("   Saldo Anda bertambah menjadi: Rp " + akunAktif.getSaldo());
                } else {
                    System.out.println(" [!] TRANSAKSI GAGAL, nominal harus lebih dari 0.");
                }
                System.out.println("---------------------------------------------");
            } else if (pilihan == 3) {
                System.out.println("---------------------------------------------");
                System.out.println(" [TARIK TUNAI]");
                System.out.print(" Masukkan nominal penarikan: Rp ");
                double jumlahTarik = scanner.nextDouble();
                boolean tarikBerhasil = akunAktif.tarik(jumlahTarik);
                
                if (tarikBerhasil) {
                    System.out.println(" [»] TRANSAKSI BERHASIL!");
                    System.out.println("   Sisa saldo Anda sekarang: Rp " + akunAktif.getSaldo());
                } else {
                    System.out.println(" [!] TRANSAKSI GAGAL, saldo tidak cukup atau nominal tidak valid.");
                }
                System.out.println("---------------------------------------------");
            } else if (pilihan == 4) {
                System.out.println("=============================================");
                System.out.println("||                                         ||");
                System.out.println("||         TERIMA KASIH ATM MySAWIT        ||");
                System.out.println("||                                         ||");
                System.out.println("=============================================");
            } else {
                System.out.println("---------------------------------------------");
                System.out.println(" [ERROR] Pilihan tidak valid. Silakan ulangi.");
                System.out.println("---------------------------------------------");
            }

            if (pilihan != 4) {
                System.out.print("\n» Tekan [ENTER] untuk kembali ke Menu Utama...");
                scanner.nextLine();
                scanner.nextLine();
            }

        } while (pilihan != 4);

        scanner.close();
    }
}
