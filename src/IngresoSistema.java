public class IngresoSistema {

    private Autenticable autenticable;

    public IngresoSistema(Autenticable autenticable){
        this.autenticable = autenticable;
    }

    public boolean loginUsuario(String username, String clave){
        return autenticable.inciarSesion(username, clave);
    }
    
}
