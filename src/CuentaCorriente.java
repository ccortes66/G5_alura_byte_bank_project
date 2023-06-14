

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(double saldo, String numeroCuenta, Cliente titular) {
        super(saldo, numeroCuenta, titular);
       
    }

    @Override
    public void retirarMonto(double valor) {
        System.out.println("Se cobra una comisión del 2% por cada retiro");
        if(valor<=0){
          super.retirarMonto(valor);  
        }else{
          super.retirarMonto((valor + 0.02));
        }
        
        
    }
    
}
