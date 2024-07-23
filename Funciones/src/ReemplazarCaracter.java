import java.util.Scanner;
public class ReemplazarCaracter {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = teclado.nextLine();
        System.out.print("Ingresa el carácter que deseas reemplazar: ");
        char caracterViejo = teclado.next().charAt(0);
        System.out.print("Ingresa el nuevo carácter: ");
        char caracterNuevo = teclado.next().charAt(0);
        String textoModificado = texto.replace(caracterViejo, caracterNuevo);
        System.out.println("Cadena de texto modificada: " + textoModificado);

    }
}
