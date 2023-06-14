import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente criss = new  Cliente("Criss", "12345567", "CR001", "11223344");
        Gerente maria = new Gerente("Maria", 4000,"MR001","1234");
        Admon julian = new Admon("Julian", 2500,"JL001","223344");
        Cliente marcos = new Cliente("marcos", "1234567", "MC001", "1234");

        Cuenta marcosCuenta = new CuentaCorriente(1000, "123456789", marcos);
        Cuenta crissCuenta = new CuentaAhorros(300, "123456789", criss);
        crissCuenta.setNuemeroAgencia(44);
       
        System.out.println(marcosCuenta);
        marcosCuenta.transferirMonto(-100, crissCuenta);
        System.out.println(marcosCuenta);
       
        List<IngresoSistema> login = new ArrayList<>();
        login.add(new IngresoSistema(maria.getAutenticacion()));
        login.add(new IngresoSistema(julian.getAutenticacion()));
        login.add(new IngresoSistema(marcos.getAutenticacion()));
        System.out.println(login.get(0).loginUsuario("MR001", "1234"));
        System.out.println(login.get(1).loginUsuario("JL001", "223344"));
        System.out.println(login.get(2).loginUsuario("MC001", "1234"));

    
        
    } 
}
