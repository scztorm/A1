import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = teclado.nextLine();
        if (esPalindromo(texto)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

    }

    public static boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reverso = new StringBuilder(textoLimpio).reverse();
        return textoLimpio.equals(reverso.toString());
    }

}
