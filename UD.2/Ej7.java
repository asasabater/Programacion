import java.util.Scanner;
public class Ej6{
    public static void main(String [] args) {
        Scanner teclado=new Scanner(System.in);
        double x, y, z, dividendo, divisor;
        System.out.print("Valor de X");
        x = teclado.nextDouble();
        System.out.print("Valor de Y");
        y = teclado.nextDouble();
        dividendo = 1+(x*x/y);
        divisor = x*x*x / (1+y);
        z = dividendo/divisor;
        System.out.print("Z= "+z);

    }
}