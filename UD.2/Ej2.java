import java.util.Scanner;
public class Ej2{
    public static void main(String [] args) {
        Scanner teclado=new Scanner(System.in); 
        System.out.print("Valor a");
        a= teclado.nextInt();
        System.out.print("Valor b");
        b= teclado.nextInt();
        int c=0;
        c=b;
        b=a;
        a=c;
        String o="El numero A es 'a' y el numero B es 'b'";
        System.out.println(o);
    }
}