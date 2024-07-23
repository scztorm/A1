import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.print("Ingresa el primer número entero: ");
        int num1 = texto.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        int num2 = texto.nextInt();
        int mcd = calcularMCD(num1, num2);
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);

    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
