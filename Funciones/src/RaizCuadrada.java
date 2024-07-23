import java.util.Scanner;
public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        double numero = teclado.nextDouble();
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);

    }
}
