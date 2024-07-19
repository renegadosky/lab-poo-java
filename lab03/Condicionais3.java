package lab03;

import java.util.Scanner;

public class Condicionais3 {
    // Execute no terminal
    // java lab03/Condicionais3.java
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        System.out.println("Fale sua nota:");
        var nota = sc.next();
        switch (nota) {
            case 91 => -> System.out.println("Jogue na lixeira marrom");
            case "plastico" -> System.out.println("Jogue na lixeira vermelha");
            case "metal" -> System.out.println("Jogue na lixeira amarelo");
            case "vidro" -> System.out.println("Jogue na lixeira verde");
        }
        sc.close();
    }
}
