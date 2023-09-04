import java.util.Date;

class CuentaDeAhorro extends ProductoBancario {
    private double saldo;
    private double porcentajeInteres;

    public CuentaDeAhorro(Cliente cliente, int numeroCuenta, Date fechaApertura, double saldo, double porcentajeInteres) {
        super(cliente, numeroCuenta, fechaApertura);
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
    }

    @Override
    public double calcularIntereses() {
        // Implementa el cálculo de intereses mensuales
        double intereses = saldo * (porcentajeInteres / 100);
        saldo += intereses; // Actualiza el saldo
        return intereses;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }
}

