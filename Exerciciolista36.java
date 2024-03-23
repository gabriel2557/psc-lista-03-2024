import java.util.Scanner;
import java.util.Random;

public class Exerciciolista36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Pedindo os números ao usuário
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();
        
        // Encontrando o menor e o maior número
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);
        
        // Realizando o sorteio
        int numeroSorteado = random.nextInt(maior - menor + 1) + menor;
        
        // Verificando se o número sorteado é par ou ímpar
        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é: " + numeroSorteado);
            System.out.println("Este número é par.");
        } else {
            System.out.println("O número sorteado é: " + numeroSorteado);
            System.out.println("Este número é ímpar.");
        }
        
        scanner.close(); // Fechando o scanner
    }
}