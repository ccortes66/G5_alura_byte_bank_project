public class Admon extends Funcionario{

    private Autenticar autenticar;

    public Admon(String nombre, double salario, String username, String clave) {
        super(nombre, salario);
        autenticar = new Autenticar(username,clave);
        
    }

   
    @Override
    public double getBonificacion() {
        return  ((super.getSalario()  * 20 ) / 100);
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
            "Admon: {%n "+
            "\t username: %s %n"+
            "\t info: %s"+
            "}"
            ,autenticar.getUsername()
            ,super.toString()
        );
    }


    
    
}
