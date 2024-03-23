import java.util.Scanner;

public class Exerciciolista32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo o valor da compra e o valor pago ao usuário
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();
        
        System.out.println("Digite o valor pago:");
        double valorPago = scanner.nextDouble();
        
        // Verificando se o valor pago é suficiente para a compra
        if (valorPago < valorCompra) {
            System.out.println("Quantia paga insuficiente para realizar a compra.");
            return; // Termina o programa se o valor pago for insuficiente
        }
        
        // Calculando o troco
        double troco = valorPago - valorCompra;
        
        // Calculando o menor número de notas para o troco
        int[] notas = {50, 20, 10, 5, 2, 1}; // Valores das notas disponíveis
        int[] quantidadeNotas = new int[notas.length]; // Array para armazenar a quantidade de cada nota
        
        // Iterando sobre as notas disponíveis para calcular a quantidade de cada uma
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = (int) (troco / notas[i]);
            troco %= notas[i]; // Atualizando o valor do troco
        }
        
        // Exibindo o troco em notas
        System.out.println("Troco:");
        for (int i = 0; i < notas.length; i++) {
            if (quantidadeNotas[i] > 0) {
                System.out.println(quantidadeNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
            }
        }
        
        scanner.close(); // Fechando o scanner
    }
}