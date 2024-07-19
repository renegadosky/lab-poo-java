package lab02;
public class Entrada1 {
    
    public static void main(String[] args) {
        var raio = Integer.parseInt(args[0]);
        var volume = 1.333 * Math.PI * Math.pow(raio, 2);
        System.out.println("O volume do esfera é " + Math.round(volume));
    }
}
