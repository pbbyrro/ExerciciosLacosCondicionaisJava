import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
        int a, b, c;
        
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        
        int menor, medio, maior;
        
        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                medio = b;
                maior = c;
            } else {
                medio = c;
                maior = b;
            }
        } else if (b <=a && b <= c) {
            menor = b;
            if (a <= c) {
                medio = a;
                maior = c;
            } else {
                medio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                medio = a;
                maior = b;
            } else {
                medio = b;
                maior = a;
            }
        }
        System.out.println(menor);
        System.out.println(medio);
        System.out.println(maior);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
 
}