package excepcion;

public class Main {

    public static void main(String... args) throws Exception {

        try(TryCatchResource resource = new TryCatchResource()){
            resource.leerDatos();
        }catch(IllegalStateException exception){
            exception.printStackTrace();
        }
        
    }
    
}
