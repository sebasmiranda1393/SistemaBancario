import java.util.Date;

class TarjetaDeCredito extends ProductoBancario {
    private Date fechaVencimiento;
    private double interesPorUso;
    private double cupo;
    private double valorUtilizado;

    public TarjetaDeCredito(Cliente cliente, int numeroTarjeta, Date fechaApertura, Date fechaVencimiento, double interesPorUso, double cupo, double valorUtilizado) {
        super(cliente, numeroTarjeta, fechaApertura);
        this.fechaVencimiento = fechaVencimiento;
        this.interesPorUso = interesPorUso;
        this.cupo = cupo;
        this.valorUtilizado = valorUtilizado;
    }

    @Override
    public double calcularIntereses() {
        // Implementa el cálculo de intereses mensuales por el valor utilizado
        double intereses = valorUtilizado * (interesPorUso / 100);
        return intereses;
    }


    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getInteresPorUso() {
        return interesPorUso;
    }

    public void setInteresPorUso(double interesPorUso) {
        this.interesPorUso = interesPorUso;
    }

    public double getCupo() {
        return cupo;
    }

    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    public double getValorUtilizado() {
        return valorUtilizado;
    }

    public void setValorUtilizado(double valorUtilizado) {
        this.valorUtilizado = valorUtilizado;
    }
}