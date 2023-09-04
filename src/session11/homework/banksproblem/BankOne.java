package session11.homework_fun.banksproblem;

public class BankOne extends Bank {

    private final double balance;

    public BankOne(double balance) {
        this.balance = balance;
    }

    @Override
    protected double getBalance() {
        return balance;
    }
}
