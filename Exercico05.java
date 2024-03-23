import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os dois números reais do teclado
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Ler o símbolo da operação do teclado
        System.out.print("Digite o símbolo da operação (+, -, *, / ou ^): ");
        char operacao = scanner.next().charAt(0);

        // Realizar a operação e mostrar o resultado
        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Erro: Operação inválida!");
                return;
        }

        // Apresentar o resultado da operação
        System.out.println("Resultado da operação: " + resultado);

        scanner.close();
    }

}