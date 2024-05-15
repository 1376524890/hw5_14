import java.util.Scanner;

class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful");
    }
}

public class ATM {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100); // 初始化每个账户的余额为100美元
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an id: ");
            int userId = scanner.nextInt();
            if (userId < 0 || userId >= accounts.length) {
                System.out.println("Invalid id. Please enter a correct id.");
                continue;
            }

            while (true) {
                System.out.println("\nMain menu");
                System.out.println("1: Check balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                System.out.print("Enter a choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[userId].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        accounts[userId].withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        accounts[userId].deposit(depositAmount);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                if (choice == 4) {
                    break;
                }
            }

            System.out.println("Enter an id:");
        }
    }
}

