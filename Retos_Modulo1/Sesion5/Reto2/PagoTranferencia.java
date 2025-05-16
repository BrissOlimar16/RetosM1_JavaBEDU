//package metodopago;


public class PagoTranferencia extends MetodoPago {
    private boolean validadoExternamente;

    public PagoTranferencia(double monto, boolean validadoExternamente) {
        super(monto);
        this.validadoExternamente = validadoExternamente;
    }

    @Override
    public boolean autenticar() {
        return validadoExternamente;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia por $" + monto);
    }
}

