public class Sumar_Dos_Numeros {
    private double n1;
    private double n2;

    //Constructor
    public Sumar_Dos_Numeros(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //Constructor vacio
    public Sumar_Dos_Numeros() {

    }

    //Getters
    public double getN1() {
        return n1;
    }
    public double getN2() {
        return n2;
    }

    //Setters
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }

    public double sumar() {
        return n1+n2;
    }

    //Metodo para imprimir
    public void imprimir() {
        System.out.println("El primer número es = " + getN1());
        System.out.println("El segundo número es = " + getN2());
        System.out.println("La suma es: "+sumar());
    }
}
