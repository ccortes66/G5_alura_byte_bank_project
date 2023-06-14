public class Contador extends Funcionario{

    public Contador(String nombre, double salario) {
        super(nombre, salario);
        
    }

    @Override
    public double getBonificacion() {
        return  ((super.getSalario()  * 5 ) / 100);
    }

    @Override
    public String toString() {
        return String.format(
            "Contador: {%n "+
            "\t info: %s"+
            "}%n"
            ,super.toString()
        );
    }


    
    
}
