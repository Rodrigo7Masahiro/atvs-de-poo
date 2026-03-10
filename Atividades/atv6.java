package Atividades;
import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario base: ");
        double salarioBase = scanner.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;

        double salarioFinal = salarioBase + gratificacao - imposto;

        System.out.print("O salario final do funcionario é: " + salarioFinal);
        scanner.close();
    }
}
