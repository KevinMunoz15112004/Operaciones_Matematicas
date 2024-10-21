import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("---- Menú ----");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Raíz cuadrada de un número");
            System.out.println("3. Seno, coseno, tangente de un número");
            System.out.println("4. Salir");
            System.out.println("Ingrese la opción: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("---- SUMATORIA ----");
                    System.out.println("Ingrese el número 1: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Ingrese el número 2: ");
                    double n2 = sc.nextDouble();
                    Sumar_Dos_Numeros sumatoria = new Sumar_Dos_Numeros(n1,n2);
                    sumatoria.imprimir();
                    break;
                case 2:
                    System.out.println("---- RAÍZ ----");
                    System.out.println("Ingrese el número: ");
                    double num1 = sc.nextDouble();
                    Raiz_cuadrada raiz = new Raiz_cuadrada(num1);
                    raiz.imprimir();
                    break;
                case 3:
                    System.out.println("---- SENO, COSENO Y TANGENTE ----");
                    System.out.println("Ingrese el número: ");
                    double numero1 = sc.nextDouble();
                    Seno_Coseno_Tangente sen_cos_tan = new Seno_Coseno_Tangente(numero1);
                    sen_cos_tan.imprimir();
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro sistema");
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println("Intente de nuevo");
            }
        } while(opcion!=4);

        sc.close();
    }
}
