import java.util.Scanner;

public class Exerciciolista31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo os números ao usuário
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro número:");
        double numero3 = scanner.nextDouble();
        
        // Encontrando o maior número
        double maior = Math.max(numero1, Math.max(numero2, numero3));
        
        // Encontrando o menor número
        double menor = Math.min(numero1, Math.min(numero2, numero3));
        
        // Calculando a média
        double media = (numero1 + numero2 + numero3) / 3;
        
        // Exibindo os resultados
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética é: " + media);
        
        scanner.close(); // Fechando o scanner
    }
}
