package Atividades;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario do funcionario:");
        double salario = scanner.nextDouble();

        double aumento = salario * 0.25;
        double salariofinal = salario + aumento;

        System.out.println("O salario final do funcionario é: " + salariofinal);
        scanner.close();
    }
}
