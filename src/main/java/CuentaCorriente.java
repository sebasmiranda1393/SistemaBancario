import java.util.Date;

class CuentaCorriente extends ProductoBancario {
    private double saldo;
    private double porcentajeInteres;
    private double valorSobregiro;

    public CuentaCorriente(Cliente cliente, int numeroCuenta, Date fechaApertura, double saldo, double porcentajeInteres, double valorSobregiro) {
        super(cliente, numeroCuenta, fechaApertura);
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
        this.valorSobregiro = valorSobregiro;
    }

    @Override
    public double calcularIntereses() {
        // Implementa el cálculo de intereses mensuales
        double intereses = saldo * (porcentajeInteres / 100);
        saldo += intereses; // Actualiza el saldo
        return intereses;
    }

    // Getters y setters
    // ...

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

    public double getValorSobregiro() {
        return valorSobregiro;
    }

    public void setValorSobregiro(double valorSobregiro) {
        this.valorSobregiro = valorSobregiro;
    }
}
