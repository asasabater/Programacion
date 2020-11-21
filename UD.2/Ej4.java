import java.util.Scanner;
public class Ej4{
    public static void main(String [] args) {
    Scanner teclado=new Scanner(System.in);
    int niños, niñas, total;
    double porcentajeNiños, porcentajeNiñas;
    System.out.print("Número de niños en la clase");
    niños= teclado.newInt();
    System.out.print("Número de niñas en la clase");
    niñas= teclado.newInt();
    total= niños+niñas;
    porcentajeNiños= niños+100/total;
    porcentajeNiñas= niñas+100/total;
    System.out.print("El porcentaje de niños en la clase es de "+porcentajeNiños);
    System.out.print("El porcentaje de niñas en la clase es de "+porcentajeNiñas);
         }
}