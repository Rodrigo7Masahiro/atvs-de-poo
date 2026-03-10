package Atividades;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int num3 = scanner.nextInt();

        int mediaponderada = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;

        System.out.print("A media ponderada dos tres numeros é: " + mediaponderada);
        scanner.close();
    }
}
