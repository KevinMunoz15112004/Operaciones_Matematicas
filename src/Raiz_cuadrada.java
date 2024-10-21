import static java.lang.Math.*;

public class Raiz_cuadrada {
    private double num1;

    //Constructor
    public Raiz_cuadrada(double n1) {
        this.num1 = n1;
    }

    //Constructor vacio
    public Raiz_cuadrada() {

    }

    //Getter
    public double getN1() {
        return num1;
    }

    //Setter
    public void setN1(double n1) {
        this.num1 = n1;
    }

    public double raiz(){
        return sqrt(num1);
    }

    //Metodo para imprimir
    public void imprimir(){
        System.out.println("El número es = "+ getN1());
        System.out.println("La raíz cuadrada de "+getN1()+" es: "+raiz());
    }
}
