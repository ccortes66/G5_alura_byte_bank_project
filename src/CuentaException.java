public class CuentaException {

    private CuentaException(){

    }


    static class SaldoInsuficienteException extends RuntimeException{
        
        public SaldoInsuficienteException(){
            super("Saldo Insuficiente");
        }

        public SaldoInsuficienteException(String sms){
            super(sms);
        }
    }


    static class EnvioMismaCuentaException extends RuntimeException{
        public EnvioMismaCuentaException(){
            super("Transferencia a la misma cuenta");
        }
    }

    static class CuentaBloqueadaException extends RuntimeException{
        public CuentaBloqueadaException(String sms){
            super(sms);
        }
    }

      
}
