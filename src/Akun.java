public class Akun {
    protected double saldo;

    public Akun(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean setor(double jumlah) {
        if (jumlah > 0) {
            this.saldo = this.saldo + jumlah;
            return true;
        }
        return false;
    }

    public boolean tarik(double jumlah) {
        if (jumlah > 0) {
            if (this.saldo >= jumlah) {
                this.saldo = this.saldo - jumlah;
                return true;
            }
        }
        return false;
    }
}
