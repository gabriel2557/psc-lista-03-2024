import java.util.Scanner;

public class Exerciciolista33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo os coeficientes ao usuário
        System.out.println("Digite o coeficiente a:");
        double a = scanner.nextDouble();
        
        System.out.println("Digite o coeficiente b:");
        double b = scanner.nextDouble();
        
        System.out.println("Digite o coeficiente c:");
        double c = scanner.nextDouble();
        
        // Verificando a consistência dos coeficientes
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double raiz = -c / b;
            System.out.println("A raiz real da equação é: " + raiz);
        } else {
            // Calculando o discriminante
            double delta = b * b - 4 * a * c;
            
            // Verificando as condições de delta
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                double raiz = -b / (2 * a);
                System.out.println("As raízes reais da equação são: " + raiz);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("As raízes reais da equação são: " + raiz1 + " e " + raiz2);
            }
        }
        
        scanner.close(); // Fechando o scanner
    }
}