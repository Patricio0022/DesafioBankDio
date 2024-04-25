import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount AccountOne = new BankAccount();



            System.out.println("Bem vindo Usuário");
            System.out.println("Para acessar sua conta digite primeiramente o seu nome: ");
                String name = sc.nextLine();
                     AccountOne.setName(name);


            System.out.println("Digite  o número da conta: ");
                int numberAccount = sc.nextInt();
                    AccountOne.setId(numberAccount);

            System.out.println("Digite o número da Agência: ");
                String numberAgency = sc.next();
                    AccountOne.setAgency(numberAgency);


            System.out.println("Digite o seu saldo: ");
            double saldo = 0.0;
            try {
                saldo = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Entrada inválida, insira um número válido talvez possa tentar com ,");
                return;
            }
                    AccountOne.setBalance(saldo);
        sc.close();

        System.out.println(AccountOne);

    }

}
