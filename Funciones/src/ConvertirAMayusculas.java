import java.util.Scanner;
public class ConvertirAMayusculas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto;
        while (true) {
            System.out.print("Ingresa una palabra o cadena de texto (deja en blanco para terminar): ");
            texto = teclado.nextLine();
            if (texto.trim().isEmpty()) {
                break;
            }
            System.out.println(texto.toUpperCase());
        }

    }
}
