import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente1 = new Cliente("1073165535", "Sebastian Miranda", "sebasmirandadc@gmail.com",
                "3144452921", "calle falsa 123");
        System.out.println("Nombre del cliente: " + cliente1.getNombre());
        System.out.println("Numero de documento: " + cliente1.getDocumentoIdentidad());
        System.out.println("Correo electronico: " + cliente1.getCorreoElectronico());

        System.out.println();

        // Crear una cuenta de ahorro para el cliente1
        CuentaDeAhorro cuentaAhorro1 = new CuentaDeAhorro(cliente1, 1001, new Date(), 1000000, 5.0);

        // Calcular e imprimir intereses mensuales de la cuenta de ahorro
        double interesesAhorro1 = cuentaAhorro1.calcularIntereses();
        System.out.println("nombre del cliente: " + cliente1.getNombre());
        System.out.println("numero de cuenta ahorro: " + cuentaAhorro1.getNumeroCuenta());
        System.out.println("Intereses de la cuenta de ahorro: $ " + interesesAhorro1);
        System.out.println("Saldo actual de la cuenta de ahorro: $ " + cuentaAhorro1.getSaldo());
        System.out.println();
        // Crear una cuenta corriente para el cliente1
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(cliente1, 2001, new Date(), 200000, 5,
                1000);

        // Calcular e imprimir intereses mensuales de la cuenta corriente
        double interesesCorriente1 = cuentaCorriente1.calcularIntereses();
        System.out.println("numero de cuenta corriente: " + cuentaCorriente1.getNumeroCuenta());
        System.out.println("Intereses de la cuenta corriente: $"  + interesesCorriente1);
        System.out.println("Saldo actual de la cuenta corriente: $"  + cuentaCorriente1.getSaldo());
        System.out.println();
        // Crear un Certificado de Ahorro a Término Fijo para el cliente1
        CertificadoDeAhorroTerminoFijo cdt1 = new CertificadoDeAhorroTerminoFijo(cliente1, 30001, new Date(), 5000000, 12, 3);

        // Calcular e imprimir intereses del CDT al final del plazo
        double interesesCdt1 = cdt1.calcularIntereses();
        System.out.println("numero de CDT: " + cdt1.getNumeroCuenta());
        System.out.println("Intereses del CDT al final del plazo: $" + interesesCdt1);
        System.out.println();
        // Crear una tarjeta de crédito para el cliente1
        TarjetaDeCredito tarjetaCredito1 = new TarjetaDeCredito(cliente1, 3001, new Date(), new Date(), 2.0,
                3000000, 100000);

        // Calcular e imprimir intereses mensuales de la tarjeta de crédito
        double interesesTarjeta1 = tarjetaCredito1.calcularIntereses();
        System.out.println("numero de  Tarjeta de Credito: " + tarjetaCredito1.getNumeroCuenta());
        System.out.println("Intereses de la tarjeta de crédito: $" + interesesTarjeta1);
    }
}