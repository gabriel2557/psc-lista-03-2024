import java.util.Scanner;

public class Exerciciolista34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo os valores ao usuário
        System.out.println("Digite o indicador de operação (1 para perímetro do círculo, 2 para área do círculo, 3 para volume da esfera):");
        int indicadorOperacao = scanner.nextInt();
        
        System.out.println("Digite o raio:");
        double raio = scanner.nextDouble();
        
        // Verificando e executando a operação conforme o indicador
        switch (indicadorOperacao) {
            case 1:
                calcularPerimetroCirculo(raio);
                break;
            case 2:
                calcularAreaCirculo(raio);
                break;
            case 3:
                calcularVolumeEsfera(raio);
                break;
            default:
                System.out.println("Erro: Código de operação inválido.");
        }
        
        scanner.close(); // Fechando o scanner
    }
    
    // Método para calcular e imprimir o perímetro do círculo
    public static void calcularPerimetroCirculo(double raio) {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("O perímetro do círculo é: " + perimetro);
    }
    
    // Método para calcular e imprimir a área do círculo
    public static void calcularAreaCirculo(double raio) {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
    }
    
    // Método para calcular e imprimir o volume da esfera
    public static void calcularVolumeEsfera(double raio) {
        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("O volume da esfera é: " + volume);
    }
}