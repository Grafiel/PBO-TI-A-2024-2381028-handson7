package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount grafielSitanggang = new BankAccount(100);

        grafielSitanggang.withdraw(10);
        System.out.println("Current balance is: " + grafielSitanggang.getBalance());
    }
}
