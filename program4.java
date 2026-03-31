import java.util.Scanner;

class BankAccount {
    String name;
    int accNo;
    double balance;

    // Constructor to store account details
    BankAccount(String n, int a, double b) {
        name = n;
        accNo = a;
        balance = b;
    }

    // Allows deposit of money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Allows withdrawal of money
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    // Displays current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Extra helper method to show the account info
    void displayDetails() {
        System.out.println("\nAccount Holder: " + name);
        System.out.println("Account Number: " + accNo);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Gathering initial account details from the user
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // 1. Stores account details (Creating the object)
        BankAccount obj = new BankAccount(name, accNo, balance);
        obj.displayDetails();

        // 2. Allows deposit of money
        System.out.print("\nEnter amount to deposit: ");
        double dep = sc.nextDouble();
        obj.deposit(dep);
        obj.displayBalance();

        // 3. Allows withdrawal of money
        System.out.print("\nEnter amount to withdraw: ");
        double wd = sc.nextDouble();
        obj.withdraw(wd);
        
        // 4. Displays current balance
        obj.displayBalance();
        
        sc.close(); // Closed the scanner to prevent resource leaks
    }
}