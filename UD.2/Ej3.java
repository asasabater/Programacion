import java.util.Scanner;
public class Ej3{
    public static void main(String [] args) {
    Scanner teclado=new Scanner(System.in); 
    System.Out.Print("Valor x");
    int x = teclado.nextInt();
    System.Out.Print("Valor y");
    int y = teclado.nextInt();
    int suma = x+y;
    int resta = x-y;
    int multiplicación = x*y;
    int división = x/y; 
    System.Out.Print("El valor de la suma es "+suma+".");
    System.Out.Print("El valor de la resta es "+resta+".");
    System.Out.Print("El valor de la multiplicación es "+multiplicación+".");
    System.Out.Print("El valor de la división es "+división+".");
        }
}