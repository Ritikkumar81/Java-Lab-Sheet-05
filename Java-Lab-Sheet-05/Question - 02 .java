class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private double balance;
    public void setAccountNumber(long n) { accountNumber = n; }
    public void setAccountHolder(String h) { accountHolder = h; }
    public long getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }
    void deposit(double amount) {
        if (amount > 0) { balance += amount; System.out.println("Deposit successful"); }
        else System.out.println("Invalid deposit amount");
    }
    void withdraw(double amount) {
        if (amount <= 0) System.out.println("Invalid withdrawal amount");
        else if (amount > balance) System.out.println("Insufficient balance");
        else { balance -= amount; System.out.println("Withdrawal successful"); }
    }
}
class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNumber(123456); b.setAccountHolder("Aman");
        b.deposit(1000); b.withdraw(300);
        System.out.println("Account: " + b.getAccountNumber());
        System.out.println("Holder: " + b.getAccountHolder());
        System.out.println("Balance: " + b.getBalance());
    }
}
