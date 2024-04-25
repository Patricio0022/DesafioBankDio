public class BankAccount {

    private int id;
    private String agency;
    private String name;
    private double balance;


    public BankAccount() {
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setAgency(String agency) {
        this.agency = agency;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }



    @Override
    public String toString() {
        return "Olá " + name + ", Obrigado por criar uma conta em nosso banco, sua Agência é: " + agency + ", conta "
                +  id + " e seu saldo de: " + balance + ", já está disponível na sua conta";
    }




}
