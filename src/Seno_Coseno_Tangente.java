import static java.lang.Math.*;

public class Seno_Coseno_Tangente {
    private double numero1;

    //Constructor
    public Seno_Coseno_Tangente(double grados) {
        this.numero1 = toRadians(grados);
    }

    //Constructor vacio
    public Seno_Coseno_Tangente(){

    }

    //Getter
    public double getNumero1() {
        return toDegrees(numero1);
    }

    //Setter
    public void setNumero1(double grados) {
        this.numero1 = toRadians(grados);
    }

    public double seno(){
        return sin(numero1);
    }
    public double coseno(){
        return cos(numero1);
    }
    public double tangente(){
        return tan(numero1);
    }

    //Metodo para imprimir
    public void imprimir(){
        System.out.println("El número es = "+getNumero1());
        System.out.println("El seno de "+getNumero1() +" es: "+seno());
        System.out.println("El coseno de "+getNumero1() +" es: "+coseno());
        System.out.println("La tangente de "+getNumero1()+" es: " +tangente());
    }
}
