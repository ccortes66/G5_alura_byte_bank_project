public class Gerente extends Funcionario{

    private Autenticar autenticar;

    public Gerente(String nombre, double salario,String username, String clave) {
        super(nombre, salario);
        autenticar = new Autenticar(username.trim(),clave.trim());
        
    }

   
    @Override
    public double getBonificacion() {
        return super.getSalario() + ((super.getSalario()  * 5 ) / 100);
    }


    public void setUsername(String username){
        autenticar.setUsername(username.trim());
    }

    public void setClave(String clave){
        autenticar.setClave(clave.trim());
    }

    public Autenticar getAutenticacion(){
        return autenticar;
    }

    @Override
    public String toString() {
        return String.format(
            "Gerente: {%n "+
            "\t username: %s %n"+
            "\t info: %s"+
            "}%n"
            ,autenticar.getUsername()
            ,super.toString()
        );
    }


    
    
}
