package lab04;
import java.util.Scanner;

public class Repeticoes1 {
    // java lab04/Repeticoes1.java
    public static void main(String[] args) {
        var contador = 1;
        var sc = new Scanner(System.in);
        System.out.println("numero: ");
        var numero = sc.nextInt();
        while (numero < 10) {
            System.out.print(numero + "x" + contador);
            System.out.print(" ");
            System.out.print(numero * contador);
            numero += 1;
        }
    }
}
