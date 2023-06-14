package excepcion;

public class TryCatchResource implements AutoCloseable {

    public TryCatchResource(){
        System.out.println("Abriendo la conexion");
    }

    public void leerDatos(){
        System.out.println("leyendo los dato");
        throw new IllegalStateException();
    }

    public void cerra(){
        System.out.println("Cerrando Conexion");
    }

    @Override
    public void close() throws Exception {
        this.cerra();
    }
    
}
