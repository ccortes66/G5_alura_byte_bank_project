public class Autenticar implements Autenticable {
    
    private String username;
    private String clave;
    

    public Autenticar(String username, String clave){
        this.username = username.trim();
        this.clave = clave.trim();
    }


    @Override
    public boolean inciarSesion(String username, String clave) {
        return this.username.equals(username.trim()) && 
               this.clave.equals(clave.trim()); 
    }

    

    public void setUsername(String username) {
        this.username = username;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsername() {
        return username;
    }


    
    
}
