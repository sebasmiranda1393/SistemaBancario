import java.util.Date;

class CertificadoDeAhorroTerminoFijo extends ProductoBancario {
    private double monto;
    private int plazoMeses;
    private double interesMensual;

    public CertificadoDeAhorroTerminoFijo(Cliente cliente, int numeroCdt, Date fechaApertura, double monto, int plazoMeses, double interesMensual) {
        super(cliente, numeroCdt, fechaApertura);
        this.monto = monto;
        this.plazoMeses = plazoMeses;
        this.interesMensual = interesMensual;
    }

    @Override
    public double calcularIntereses() {
        // Implementa el cálculo de intereses al final del plazo
        double intereses = monto * (interesMensual / 100) * plazoMeses;
        return intereses;
    }


    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }
}