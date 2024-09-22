//Create a class to represent the ATM machine.

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void showMenu() {
        // Show menu options (to be implemented in step 2)
    }
}

//Design the user interface for the ATM

import java.util.Scanner;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Withdraw (to be implemented in step 3)
                    break;
                case 2:
                    // Deposit (to be implemented in step 3)
                    break;
                case 3:
                    // Check Balance (to be implemented in step 3)
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);
    }
}

// Implement methods for each option
//Let's implement withdraw, deposit, and checkBalance methods.

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposited: $" + amount);
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + account.getBalance());
    }

    // showMenu method here...
}

//Create a class to represent the user's bank account

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

//Connect the ATM class with the user's bank account class
//This is already done with the ATM class having a reference to BankAccount.

//Validate user input

import java.util.InputMismatchException;

// Inside showMenu
while (true) {
    try {
        choice = scanner.nextInt();
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid option. Please try again.");
            continue;
        }
        break; // Exit loop if input is valid
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next(); // Clear the invalid input
    }
}

// Display appropriate messages
//Messages are already displayed in the withdraw, deposit, and checkBalance methods. You can add more detailed messages based on the actions taken.

