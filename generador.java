package banco;

public class Cliente {
    private int numCuenta;
    private float monto;
    private char movimiento;

    public Cliente() {
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta > 0 ? numCuenta : 0;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto > 0 ? monto : 0;
    }

    public char getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(char movimiento) {
        this.movimiento = movimiento;
    }

    @Override
    public String toString() {
        String cade = "Cliente\n";
        cade += "Número de cuenta: " + numCuenta;
        cade += "\nMonto: " + monto;
        cade += "\nMovimiento: " + movimiento+"\n";
        return cade;
    }
}
