package Calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /):");
        operador = scanner.next().charAt(0);

        System.out.println("Digite o segundo número:");
        num2 = scanner.nextDouble();

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }
    }
}
