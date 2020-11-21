import java.util.Scanner;
public class Ej6{
    public static void main(String [] args) {
        Scanner teclado=new Scanner(System.in);
        double primero, notaDeseada, notaNecesaria, notaActual, puntosNecesarios;
        System.out.print("nota primer examen");
        primero = teclado.nextDouble();
        System.out.print("nota deseada");
        notaDeseada = teclado.nextDouble();
        notaActual= primero*0.4;
        puntosNecesarios= notaDeseada-notaActual;
        notaNecesaria= puntosNecesarios/0.6;
        if(0>notaNecesaria<10){
        System.out.print("necesitarás un "+notaNecesaria+" en el próximo examen")
        }else{
        System.out.print("no puedes sacar esa nota")
        }
        if(0<notaDeseada>10){
        System.out.print("no puedes sacar esa nota")
        }
        if(0<notaActual>10){
        System.out.print("no puedes sacar esa nota")
        }
    }
}