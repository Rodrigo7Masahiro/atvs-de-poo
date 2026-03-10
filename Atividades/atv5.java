package Atividades;
import java.util.Scanner;


public class atv5 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

         System.out.print("Digite o salario do funcionario: ");
         double salario = scanner.nextDouble();

         System.out.print("Digite o valor do aumento: ");
         double aumento = scanner.nextDouble();


         double salariofinal = salario + aumento;

         System.out.print("O salario final do funcionario é: " + salariofinal);
         scanner.close();
    }
}
