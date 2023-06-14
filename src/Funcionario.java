import java.util.UUID;

public abstract class Funcionario {

    private UUID documento; 
    private String nombre;
    private double salario;


    

    public Funcionario(String nombre, double salario) {
        this.documento = UUID.randomUUID();
        this.nombre = nombre;
        this.salario = salario;
    }



    public abstract double getBonificacion();


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public UUID getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format(
            "\t{ %n"+
            "\t\t documento: %s %n"+
            "\t\t nombre: %s %n" + 
            "\t\t salario: $%.2f %n"+
            "\t\t bonificacion: $%.2f %n"+
            "\t } %n "
            ,documento
            ,nombre
            ,salario
            ,this.getBonificacion() 
        );
    }

    

    
     
    


    
}
