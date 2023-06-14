public abstract class Cuenta {
    
    private int idCuenta;
    private double saldo;
    private int nuemeroAgencia = 1;
    private String numeroCuenta;
    private Cliente titular;
    private static int totalCuenta;


    public Cuenta(double saldo, String numeroCuenta, Cliente titular){
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta.trim();
        this.titular = titular;
        totalCuenta++;
        this.idCuenta = totalCuenta;

    }

    private void validarValor(double valor){
        if(valor >this.saldo){
              throw new CuentaException.SaldoInsuficienteException();
        }

        if(valor <= 0){
              throw new IllegalArgumentException(
                String.format("Valor ingresado $%.2f no es válido %n",valor)
              ); 
        }    
    }

    private void validarCuenta(Cuenta cuenta){
        if(cuenta.equals(null)){
            throw new NullPointerException("No existe la cuenta");
        }

        if(this.numeroCuenta.equals(cuenta.numeroCuenta) &&
           this.nuemeroAgencia == cuenta.nuemeroAgencia){
           throw new CuentaException.EnvioMismaCuentaException();
        }
    }


    public void depositarMonto(double valor){
        if(valor>0){
            this.saldo+= valor;
            System.out.printf(
                "Agrego $%.2f a la cuenta, nuevo saldo es de $%.2f %n"
                ,valor,
                saldo
            ); 
        }else{
            System.out.printf("Valor ingresado $%.2f no es válido %n",valor);
        }
    }

    public void retirarMonto(double valor){
    
        this.validarValor(valor);

        if(valor>0){
            this.saldo-= valor;
            System.out.printf(
                "Retiro $%.2f de la cuenta , nuevo saldo es de $%.2f %n"
                ,valor,
                saldo
            ); 
        }
    }


    public void transferirMonto(double valor, Cuenta cuenta){
       
        this.validarCuenta(cuenta);
        this.validarValor(valor);
        
        if(valor>0){
            cuenta.depositarMonto(valor);
            this.retirarMonto(valor);
            System.out.printf(
                "Trasfiere $%.2f a la cuenta N ***%s, nuevo saldo es de $%.2f %n"
                ,valor
                ,numeroCuenta.substring(numeroCuenta.length() - 3, numeroCuenta.length())
                ,saldo
            );  
        }
    }


    public void setNuemeroAgencia(int nuemeroAgencia) {
        this.nuemeroAgencia = nuemeroAgencia;
    }


    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public int getIdCuenta() {
        return idCuenta;
    }


    public double getSaldo() {
        return saldo;
    }


    public int getNuemeroAgencia() {
        return nuemeroAgencia;
    }


    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    @Override
    public String toString() {
        return String.format(
            "{ %n"+
             " idCuenta: %d %n" +  
             " saldo: $%.2f %n" +
             " nuemeroAgencia: %d %n" + 
             " numeroCuenta: %s %n" + 
             " titular:%s" +
             "}"
             ,idCuenta
             ,saldo
             ,nuemeroAgencia
             ,numeroCuenta
             ,titular
        );
    } 


    

    




    





    
}
