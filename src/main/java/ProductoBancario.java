import java.util.Date;

abstract class ProductoBancario {
    private Cliente cliente;
    private int numeroCuenta;
    private Date fechaApertura;

    public ProductoBancario(Cliente cliente, int numeroCuenta, Date fechaApertura) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
    }

    // Métodos abstractos que deben implementarse en las clases hijas
    public abstract double calcularIntereses();


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
}