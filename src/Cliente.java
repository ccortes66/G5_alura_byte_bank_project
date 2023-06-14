import java.util.UUID;

public class Cliente {

    private UUID documento;
    private String nombre;
    private String telefono;
    private Autenticar autenticar;

    public Cliente(String nombre, String telefono, String usuario, String clave) {
        this.documento = UUID.randomUUID();
        this.nombre = nombre;
        this.telefono = telefono;
        this.autenticar = new Autenticar(usuario, clave);
    }

    public void setUsername(String username) {
        autenticar.setUsername(username.trim());
    }

    public void setClave(String clave) {
        autenticar.setUsername(clave.trim());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public UUID getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public Autenticar getAutenticacion() {
        return autenticar;
    }

    @Override
    public String toString() {
        return String.format(
            "{%n"+
              "\t  documento: %s %n" + 
              "\t  nombre: %s %n" +  
              "\t  telefono: %s %n" +
              "\t  usuario: %s %n" +
              " }%n"
              ,documento
              ,nombre
              ,telefono
              ,autenticar.getUsername()
        );
    }

    
    
    


    




    
    
}
