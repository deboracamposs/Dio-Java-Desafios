import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Bem-vindo ao Banco Java da DIO!\n Por favor, insira o número do seu banco:");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Em seguida, informe sua agência: ");
        String agency = scanner.nextLine();
        System.out.println("Insira seu nome completo: ");
        String fullname = scanner.nextLine();
        System.out.println("Digite seu saldo: ");
        Double balance = scanner.nextDouble();
        System.out.println("Obrigado por fornecer suas informações!");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!\n" +
                          "Número da conta: %d\n" +
                          "Agência: %s\n" +
                          "Seu saldo é de: R$ %.2f\nE já encontra-se disponível para saque!\n", fullname, number, agency, balance);
        System.out.println("Aproveite nossos serviços!");
        scanner.close();
    }
}